package aspects;

import model.Comment;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import java.util.Arrays;


@Aspect
@Component
@Order(2)

public class LoggingAspect {
    private Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Around("@annotation(service.ToLog)")

    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object [] arguments = joinPoint.getArgs();
        logger.info("Method " + methodName + "with parameters " + Arrays.asList(arguments) + " will execute but with different parameters.");
        Comment comment = new Comment();
        comment.setText("Some other text!");
        Object [] newArguments = {comment};
        joinPoint.proceed(newArguments);
        logger.info("Method " + methodName + "with parameters " + Arrays.asList(comment) + " is executed.");
        return  "I am the aspect number 2 String return value";

    }
}
