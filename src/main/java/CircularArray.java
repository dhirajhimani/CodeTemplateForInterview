public class CircularArray<T> {
    private T[] items;
    private int head = 0;

    public CircularArray(int size) {
        items = (T[]) new Object[size];
    }

    /**
     * provide you index where head can point
     */
    private int convert(int index) throws Exception {
        if (index < 0) {
            index += items.length;
        }
        throw new UnImplementedException();
    }

    public void rotate(int shiftRight) throws Exception {
        head = convert(shiftRight);
    }

    public T get(int i) throws Exception {
        if (i < 0 || i >= items.length) {
            throw new IndexOutOfBoundsException("Index " + i + " is out of bounds");
        }
        throw new UnImplementedException();
    }

    public void set(int i, T item) throws Exception {
        items[convert(i)] = item;
    }

}

class UnImplementedException extends Exception {

    @Override
    public String getMessage() {
        return "Need to Implement Code";
    }

}
