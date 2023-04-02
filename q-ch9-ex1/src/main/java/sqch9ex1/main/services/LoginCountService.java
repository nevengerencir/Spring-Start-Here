package sqch9ex1.main.services;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

@Component
@ApplicationScope
public class LoginCountService {
    private int count;
    public void count (){
        count++;
    }

    public int getCount() {
        return count;
    }
}
