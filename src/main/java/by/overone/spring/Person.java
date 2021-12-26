package by.overone.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Objects;
@Component ("myPerson")
@Scope("prototype")
public class Person {
//    @Autowired
//    @Qualifier("myDog")
    private Pet pet;
    @Value("Alexey")
    private String name;
    @Value("${person.age}")
    private int age;

    public Person() {
    }
@PostConstruct
    public void init() {
        System.out.println("\nInit-method");
    }
@PreDestroy
    public void destroy(){
        System.out.println("\nDestroy-method");
    }

    public Person(Pet pet) {
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void callYourPet() {
        System.out.println("Hello, " + pet.getName() + "!");
        pet.say();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(pet, person.pet) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pet, name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "pet=" + pet +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
