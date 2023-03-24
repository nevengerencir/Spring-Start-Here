package classes;

public class Person {
    private Parrot parrot;

    @Override
    public String toString() {
        return "Person{" +
                "parrot=" + parrot +
                ", name='" + name + '\'' +
                '}';
    }

    public Parrot getParrot() {
        return parrot;
    }

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}
