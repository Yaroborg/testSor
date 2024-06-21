package Spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
/*        Dog myDog = context.getBean("myPet", Dog.class); // получаем объект Dog
         myDog.setName("Barbos");
        Dog yourDog = context.getBean("myPet", Dog.class); // получаем объект Dog
        yourDog.setName("Vasya");
        System.out.println(myDog.getName());
        System.out.println(yourDog.getName());*/

/*
        System.out.println("Переменные ссылаются на один обьект? " + (myDog == yourDog));
        System.out.println(myDog);
        System.out.println(yourDog);*/
        context.close();
    }
}
