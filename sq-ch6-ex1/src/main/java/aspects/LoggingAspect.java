package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;


@Aspect
@Component
public class LoggingAspect {
    private Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Around("execution(* service.*.*(..))")

    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object [] arguments = joinPoint.getArgs();
        logger.info("Method will execute");
        joinPoint.proceed();
        logger.info("Method " + methodName + "with parameters " + Arrays.asList(arguments) + " is executed.");
    }
}
