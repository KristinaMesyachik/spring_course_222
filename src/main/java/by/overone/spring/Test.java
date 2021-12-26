package by.overone.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Pet myPet = context.getBean("myPet", Pet.class);
//        myPet.say();
//
//        Pet myPet2 = context.getBean("myPet2", Cat.class);
//        myPet2.say();
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
        System.out.println(person);
        context.close();

        AnnotationConfigApplicationContext context1 =
                new AnnotationConfigApplicationContext(MyConfig_2.class);
        Person person1 = context1.getBean("myPerson", Person.class);
        person1.callYourPet();
        System.out.println(person1);
        context1.close();

        AnnotationConfigApplicationContext context2 =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Pet cat = context2.getBean("myCat", Pet.class);
        System.out.println(cat);
        context2.close();
    }
}
