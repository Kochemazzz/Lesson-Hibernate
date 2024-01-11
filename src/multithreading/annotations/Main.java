package multithreading.annotations;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
public class Main {
    public static void main(String[] args) {

        Person person = new Person();
//        Annotation declaredAnnotation = person.getClass().getDeclaredAnnotation(MyAnnotation.class);
//        MyAnnotation myAnnotation = (MyAnnotation) declaredAnnotation;
        System.out.println(person);
//
//        person.setAge(myAnnotation.age());
//        person.setName(myAnnotation.name());
//        person.setGender(myAnnotation.gender());
//        System.out.println(person);


    }
}
