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
        if (value == null) {
            throw new IllegalArgumentException();
        } else {
            return(super.set(index, value));
        }
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
        // System.out.println(c.add(10));
        // try {
        //     c.add(null);
        // } catch (IllegalArgumentException e) {
        //     e.printStackTrace();
        //     System.out.println("Cannot have null values in NoNullArrayList");
        // }
        for (int i = 0; i < 15; i++) {
            c.add(5);
        }

        // c.add(6, 20);
        // System.out.println(c.toString());
        // try {
        //     c.add(3, null);
        // } catch (IllegalArgumentException e) {
        //     e.printStackTrace();
        //     System.out.println("Cannot have null values in NoNullArrayList");
        // }

        // Testing set(index, value)
        // System.out.println(c.set(10,90));
        // System.out.println(c.toString());
        // System.out.println(c.set(0,80));
        // System.out.println(c.toString());

        // Testing with strings
        NoNullArrayList<String> d = new NoNullArrayList<String>();
        for (int i = 0; i < 10; i++) {
            d.add("lapras");
        }
        System.out.println(d.toString());
        d.add(0, "psyduck");
        System.out.println(d.toString());
        System.out.println(d.set(5, "scraggy"));
        System.out.println(d.toString());
    }
}
