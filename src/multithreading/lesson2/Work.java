package multithreading.lesson2;
import java.util.List;
import java.util.concurrent.Callable;
public class Work implements Callable<Integer> {
    private List<Integer> list1;
    public Work(List<Integer> list1) {
        this.list1 = list1;
    }
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (Integer integer : this.list1) {
            sum += integer;
        }
        return sum; // return type
    }
}
