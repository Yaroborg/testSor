package Spring_introduction;


import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet {
    public Cat() {
        System.out.println("I'm a Cat and I'm alive");
    }

    @Override
    public void say() {
        System.out.println("Meow");
    }
}
