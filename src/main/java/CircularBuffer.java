public class CircularBuffer {
    private int size;
    private int writePointer;
    private String[] buffers;
    private int readPointer;

    public void setSize(int size) {
        this.size = size;
        buffers = new String[size];
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return writePointer == readPointer;
    }

    public void push(String input) {
        buffers[writePointer++] = input;
    }

    public String remove() {
        return buffers[readPointer++];
    }
}
