package multithreading.stack;
public class Stack {
    private char[] array; // ссылка на внутренний массив Стека
    private int lastChar; // индекс последнего элемента
    public Stack(int size) {
        array = new char[size];
        lastChar = -1;
    }
    public void push(char sim) throws StackException {
        if (array.length - 1 == lastChar) {
            throw new StackException("Стек заполнен!");
        }
        array[++lastChar] = sim;
    }
    public char pop() throws StackException {
        if (lastChar == -1) {
            throw new StackException("Попытка извлечь из пустого стека!");
        }
        char lastElement = array[lastChar];
        array[lastChar] = '\u0000';
        lastChar--;
        return lastElement;
    }
    public void clear() {
        array = new char[0];
        lastChar = -1;
    }
    public void print() {
        if(array.length == 0){
            System.out.println("Стек пуст");
            return;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[array.length - i - 1] == '\u0000') {
            } else {
                System.out.print(array[array.length - i - 1] + " ");
            }
        }
        System.out.println();

    }
}
