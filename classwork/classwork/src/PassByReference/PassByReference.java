package PassByReference;

public class PassByReference {
    public static void main(String[] args) {
        // Write your code here
        Number a = new Number(5);
        Number b = new Number(11);
        
        System.out.println("Truoc" + ", a: " + a + ", b: " + b);
        swap(a, b);
        System.out.println("Sau" + ", a: " + a + ", b: " + b);

    }
    public static void swap(Number a, Number b) {
        int t1 = a.getValue();
        int t2 = b.getValue();
        a.setValue(t2);
        b.setValue(t1);
        System.out.println("Trong" + ", a: " + a + ", b: " + b);

    }
}
