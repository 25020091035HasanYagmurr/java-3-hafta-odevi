package q4;

public class Queue {
    private int[] elements;
    private int size;

    public Queue() {
        this.elements = new int[8];
    }

    public void enqueue(int v) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = v;
    }

    public int dequeue() {
        if (empty()) {
            throw new IllegalStateException("Queue is empty");
        }

        int value = elements[0];
        for (int i = 0; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[--size] = 0;
        return value;
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}

