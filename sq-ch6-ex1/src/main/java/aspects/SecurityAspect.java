package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class SecurityAspect {
    private Logger logger = LoggerFactory.getLogger(SecurityAspect.class);

    @Around("@annotation(service.ToLog)")
    public String securityCheck(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Security aspect firing off.");
        joinPoint.proceed();
        return "Security Aspect logging out.";

    }
}
