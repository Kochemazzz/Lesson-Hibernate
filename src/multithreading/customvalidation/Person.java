package multithreading.customvalidation;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
public class Person {
    @AgeValidator()
    @NotBlank
    @Size(min = 1)
    private int age;
    public int getAge() {
        return age;
    }
    public Person(int age) {
        this.age = age;
    }
    public Person(){

    }
}
