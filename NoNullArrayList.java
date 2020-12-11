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
            return true;
        }
    }
    public void add(int index, T element) {
        if (element == null) {
            throw new IllegalArgumentException();
        } else {
            this.add(index, element);
        }
    }
    public T set(int index, T value) {
        if (value == null) {
            throw new IllegalArgumentException();
        } else {
            T thing = this.get(index);
            this.set(index, value);
            return thing;
        }
    }

    public static void main(String[] args) {
        // NoNullArrayList<String> sequence = new NoNullArrayList();
        // for (int i = 0; i < 10; i++) {
        //     sequence.add("hi");
        // }
        // try {
        //     sequence.add(null);
        // } catch (IllegalArgumentException e) {
        //     e.printStackTrace();
        //     System.out.println("Cannot add null value to NoNullArrayList");
        // }
    }
}
