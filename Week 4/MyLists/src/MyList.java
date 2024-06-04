import java.util.Arrays;
import java.util.Objects;
public class MyList<T> {
    private Object[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    public MyList() {
        this.array = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }
    public MyList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than 0");
        }
        this.array = new Object[capacity];
        this.size = 0;
    }
    public int size() {
        return size;
    }
    public int getCapacity() {
        return array.length;
    }
    public void add(T data) {
        if (size == array.length) {
            ensureCapacity();
        }
        array[size++] = data;
    }
    private void ensureCapacity() {
        int newCapacity = array.length * 2;
        array = Arrays.copyOf(array, newCapacity);
    }
    public T get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return (T) array[index];
    }
    public void remove(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        array[--size] = null;
    }
    public void set(int index, T data) {
        if (index < 0 || index >= size) {
            return;
        }
        array[index] = data;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            result.append(array[i]);
            if (i < size - 1) {
                result.append(",");
            }
        }
        result.append("]");
        return result.toString();
    }

    public int indexOf(T data) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(data, array[i])) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = size - 1; i >= 0; i--) {
            if (Objects.equals(data, array[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T[] toArray() {
        return Arrays.copyOf(array, size, (Class<? extends T[]>) array.getClass());
    }

    public void clear() {
        Arrays.fill(array, null);
        size = 0;
    }public MyList<T> sublist(int start, int finish) {
        if (start < 0 || finish >= size || start > finish) {
            throw new IllegalArgumentException("Invalid start or finish index");
        }
        MyList<T> sublist = new MyList<>(finish - start + 1);
        for (int i = start; i <= finish; i++) {
            sublist.add((T) array[i]);
        }
        return sublist;
    }

    public boolean contains(T data) {
        return indexOf(data) != -1;
    }
}
