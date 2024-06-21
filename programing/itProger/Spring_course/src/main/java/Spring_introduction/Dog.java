package Spring_introduction;

public class Dog implements Pet{
/*    private String name;

    public void setName(String name) {
        this.name = name;
    }*/

/*    public String getName() {
        return name;
    }*/

    public void init() {
        System.out.println("Class Dog: init()");
    }

    public void destroy() {
        System.out.println("Class Dog: destroy()");
    }
    public Dog() {
        System.out.println("I'm a Dog and I'm alive!");
    }
    @Override
    public void say() {
        System.out.println("Gav");
    }
}
