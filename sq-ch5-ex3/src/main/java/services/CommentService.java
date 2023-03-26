package services;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Component
public class CommentService {
    public CommentService(){
        System.out.println("Comment service created -  eager instantiation");
    }
}
