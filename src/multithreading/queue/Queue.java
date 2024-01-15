package multithreading.queue;
public class Queue {
    private char[] array; // ссылка на внутренний массив для хранения очереди
    private int tail; // индекс последнего элемента. Индекс первого элемента - 0
    public Queue(int n) {
        this.array = new char[n];
        this.tail = -1; // пока нет элементов
    }
    public void add(char c) throws QueueException {
        if (tail == array.length - 1) {
            throw new QueueException("Буфер заполнен");
        }
        array[++tail] = c; // Запись в конец очереди
    }
    public char poll() throws QueueException {
        if (tail == -1) {
            throw new QueueException("Извлечение из пустой очереди");
        }
        char tmp = array[0]; // сохраняем копию первого элемента и сдвигаем весь массив на один элемент влево
        for (int i = 0; i < tail; i++) {
            array[i] = array[i + 1];
        }
        tail--;
        return tmp;
    }
    public void print() {
        for (int i = 0; i <= tail; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }
    public void clear() {
        tail = -1;
    }
    public int getTail() {
        return tail;
    }
}
