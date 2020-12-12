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
        super.add(element);
        System.out.println(super.get(0));
        return true;
    }
    public void add(int index, T element) {
    }
    public T set(int index, T value) {
        return value;
    }

    public static void main(String[] args) {
        NoNullArrayList<Integer> a = new NoNullArrayList<Integer>();
        System.out.println(a.add(2));
        NoNullArrayList<Integer> b = new NoNullArrayList<Integer>(15);
        for (int i = 0; i < 20; i++) {
            System.out.println(b.add(10));
        }
    }
}
