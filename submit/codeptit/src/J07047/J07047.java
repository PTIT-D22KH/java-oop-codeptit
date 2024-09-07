package J07047;
import java.util.*;
import java.io.*;
public class J07047 {
    public static void main(String[] args) throws IOException{
        // Write your code here
        Scanner input = new Scanner(new File("J07047/DATA.in"));

        int n = Integer.parseInt(input.nextLine());
        ArrayList<HotelRoom> a = new ArrayList<>();
        for (int i = 0;i < n; i++) {
            a.add(new HotelRoom(input.nextLine().trim()));
        }
        int m = Integer.parseInt(input.nextLine());
        ArrayList<Customer> b = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            b.add(new Customer(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()));
        }
        Collections.sort(b, new CompareByNumDays());
        for (Customer x : b) {
            System.out.println(x);
        }
        input.close();
    }
}
