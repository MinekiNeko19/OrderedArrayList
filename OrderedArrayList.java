public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
    // Constructors
    public OrderedArrayList() {
        super();
    }

    public OrderedArrayList(int startingCapacity) {
        super(startingCapacity);
    }

    // Methods
    public int findIndex(T value) {
        for (int i = 0; i < size(); i++) {
            if (value.compareTo(get(i)) <= 0) {
                return i;
            }
        }
        return size();
    }

    public boolean add(T element) {
        if (element == null) {
            throw new IllegalArgumentException();
        } else {
            super.add(findIndex(element), element);
        }
        return true;
    }

    public void add(int index, T element) {
        add(element);
    }

    public T set(int index, T value) {
        add(value);
        return remove(index);
    }

    public static void main(String[] args) {
        // testing add
        OrderedArrayList<Integer> a = new OrderedArrayList<Integer>();
        for (int i = 0; i < 20; i = i + 2) {
            a.add(i);
        }
        System.out.println(a.toString());
        System.out.println(a.add(5));
        System.out.println(a.toString());
        System.out.println(a.add(31));
        System.out.println(a.toString());
        // try {
        //     System.out.println(a.add(null));
        // } catch (IllegalArgumentException e) {
        //     e.printStackTrace();
        //     System.out.println("cannot add null to a NoNullArrayList");
        // }
        // System.out.println(a.toString());

        // testing set
        System.out.println(a.set(2,13));
        System.out.println(a.toString());

        //testing with strings
        OrderedArrayList<String> b = new OrderedArrayList<String>();
        b.add("a"); b.add("b"); b.add("deli"); b.add("even"); b.add("f"); b.add("g");
        System.out.println(b.toString());
        b.add("c");
        System.out.println(b.toString());
        b.add("zebra");
        System.out.println(b.toString());
        b.set(3,"demo");
        b.set(5, "pumpkin");
        System.out.println(b.toString());
    }
}
