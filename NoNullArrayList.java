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
        if (element == null) {
            throw new IllegalArgumentException();
        } else {
            super.add(element);
            return true;
        }
    }

    public void add(int index, T element) {
        if (element == null) {
            throw new IllegalArgumentException();
        } else {
            super.add(index,element);
        }
    }

    public T set(int index, T value) {
        return value;
    }

    public static void main(String[] args) {
        // Testing constructors
        // NoNullArrayList<Integer> a = new NoNullArrayList<Integer>();
        // System.out.println(a.add(2));
        // NoNullArrayList<Integer> b = new NoNullArrayList<Integer>(15);
        // for (int i = 0; i < 20; i++) {
        //     System.out.println(b.add(10));
        // }

        // Testing add(element)
        NoNullArrayList<Integer> c = new NoNullArrayList<Integer>();
        System.out.println(c.add(10));
        try {
            c.add(null);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println("Cannot have null values in NoNullArrayList");
        }
        for (int i = 0; i < 15; i++) {
            c.add(5);
        }

        c.add(6, 20);
        System.out.println(c.toString());
        try {
            c.add(3, null);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println("Cannot have null values in NoNullArrayList");
        }
    }
}
