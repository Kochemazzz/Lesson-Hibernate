package multithreading.annotations;
import jdk.jfr.Name;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@MyAnnotation(name = "Ivan", age = 21,gender = "male")
public class Person {


    private String name;

    private int age;

    private String gender;
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public Person(){
        Annotation declaredAnnotation = this.getClass().getDeclaredAnnotation(MyAnnotation.class);
        MyAnnotation myAnnotation = (MyAnnotation) declaredAnnotation;
        this.name = myAnnotation.name();
        this.age = myAnnotation.age();
        this.gender = myAnnotation.gender();
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
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
