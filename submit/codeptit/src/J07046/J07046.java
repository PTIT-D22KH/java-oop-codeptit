package J07046;
import java.util.*;
import java.io.*;
public class J07046 {
    public static void main(String[] args) throws IOException, FileNotFoundException{
        // Write your code here
        // Scanner input = new Scanner(new File("J07046/KHACH.in"));
        Scanner input = new Scanner(new File("KHACH.in"));

        int n = Integer.parseInt(input.nextLine());
        ArrayList<Customer> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++ ){
            a.add(new Customer(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()));
        }
        Collections.sort(a, new CompareByDuration());
        for (Customer x : a) {
            System.out.println(x);
        }
        input.close();
        
    }
}
