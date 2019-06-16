package exercise;
import edu.princeton.cs.algs4.StdIn;
import java.util.Iterator;
import java.util.NoSuchElementException;
import edu.princeton.cs.algs4.StdOut;

public class ResizingArrayQueue<Item> {

    private int first;      // index of first element of queue
    private int last;       // index of next available slot
    private int N;  // number of elements on queue
    private Item[] a;  // queue elements

    public ResizingArrayQueue() {
        a = (Item[]) new Object[2];
        N = 0;
        first = 0;
        last = 0;
    }

    public int size() {
        return N;

    }

    public Boolean isEmpty() {
        return N == 0;
    }

    private void resize(int capacity) {

        Item[] temp = (Item[]) new Object[capacity];
        for (int i = 0; i < capacity; i++) {
            temp[i] = a[(first + i) % a.length];
        }
        a = temp;
        first = 0;
        last  = N;

    }

    public void enqueue(Item item) {

        if (N == a.length) resize(a.length * 2);
        a[N++] = item;
        if(last==a.length) last=0;
        N++;

    }

    public Item dequeue() {
        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
        Item item = a[first];
        a[first]=null;
        N--;
        first++;
        if (first == a.length) first = 0;
        if (N > 0 && N == a.length / 4) {
            resize(a.length / 2);
        }
        return item;
    }

    public Iterator<Item> iterator(){
        return new ArrayIterator();
    }

    private class ArrayIterator implements Iterator<Item>{
        private int i=0;
        public boolean hasNext()  { return i < N;                               }
        public void remove()      { throw new UnsupportedOperationException();  }
        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = a[(i + first) % a.length];
            i++;
            return item;
        }
    }

    /**
     * Returns the item least recently added to this queue.
     * @return the item least recently added to this queue
     * @throws java.util.NoSuchElementException if this queue is empty
     */

    public Item peek() {
        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
        return a[first];
    }

    /**
     * Unit tests the {@code ResizingArrayQueue} data type.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        ResizingArrayQueue<String> queue = new ResizingArrayQueue<String>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) queue.enqueue(item);
            else if (!queue.isEmpty()) StdOut.print(queue.dequeue() + " ");
        }
        StdOut.println("(" + queue.size() + " left on queue)");
    }
}
