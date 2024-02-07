package multithreading.stepikoop20;
import java.util.ArrayList;
public class Stack {
    private ArrayList<Student> arrayList;
    private int index;

    public Stack (int size){
        arrayList = new ArrayList<>(size);
        index = -1;
    }

    public void push (Student student) throws StackException {
        if(arrayList.size() == index){
            throw new StackException("Стек заполнен");
        }
        arrayList.add(++index,student);
    }

    public Student pop() throws StackException {
        if (index == -1) {
            throw new StackException("Попытка извлечь из пустого стека!");
        }
        Student lastElement = arrayList.get(index);
        arrayList.remove(index);
        index--;
        return lastElement;
    }
    public void clear() {
        arrayList.clear();
        index = -1;
    }
    public ArrayList<Student> getArrayList() {
        return arrayList;
    }
}
