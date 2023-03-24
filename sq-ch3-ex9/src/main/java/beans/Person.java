package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

   public Person(@Qualifier("parrot3") Parrot parrot){
       this.parrot = parrot;
   }
    private String name;
   private final Parrot parrot;


    @Override
    public String toString() {
        return "Person{" +
                "parrot=" + parrot +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
