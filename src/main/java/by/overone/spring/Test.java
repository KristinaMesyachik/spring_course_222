package by.overone.spring;

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
    }
}
