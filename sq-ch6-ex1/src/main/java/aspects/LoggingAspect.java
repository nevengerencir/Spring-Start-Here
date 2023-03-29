package aspects;

import model.Comment;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import java.util.Arrays;


@Aspect
@Component
public class LoggingAspect {
    private Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Around("execution(* service.*.*(..))")

    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object [] arguments = joinPoint.getArgs();
        logger.info("Method " + methodName + "with parameters " + Arrays.asList(arguments) + " will execute but with different parameters.");
        Comment comment = new Comment();
        comment.setText("Some other text!");
        Object [] newArguments = {comment};
        Object returnObject = joinPoint.proceed(newArguments);
        logger.info("Method " + methodName + "with parameters " + Arrays.asList(comment) + " is executed.");
        return  returnObject;

    }
}
