import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T> {
    //constructors
    //default
    public NoNullArrayList() {
        super();
    }
    //set startingCapacity
    public NoNullArrayList(int startingCapacity) {
        super(startingCapacity);
    }

    //methods
    public boolean add(T element) {
        if (element==null) {
            throw new IllegalArgumentException();
        } else {
            this.add(element);
        }
    }
    public boolean add(int index, T element) {
        if (element == null) {
            throw new IllegalArgumentException();
        } else {
            this.add(index, element);
        }
    }
    public void set(int index, T value) {
        if (value == null) {
            throw new IllegalArgumentException();
        } else {
            this.set(index, value);
        }
    }

    public static void main(String[] args) {
        // NoNullArrayList<int> sequence = new NoNullArrayList();
        // for (int i = 0; i < 10; i++) {
        //     sequence.add(i);
        // }
        // try {
        //     sequence.add(null);
        // } catch (IllegalArgumentException e) {
        //     e.printStackTrace();
        //     System.out.println("Cannot add null value to NoNullArrayList");
        // }
    }
}
