package multithreading.stepikoop20;
public class Student {
    public String Surname;
    public Double Avg;
    public Integer Age;
    public Student(String Surname, Double Avg, Integer Age) {
        this.Surname = Surname;
        this.Avg = Avg;
        this.Age = Age;
    }
    @Override
    public String toString() {
        return Surname + ";" + Avg + ";" + Age;
    }
}
