package J07048;
import java.util.*;
import java.io.*;
public class J07048 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        // Write your code here
        // Scanner input = new Scanner(new File("J07048/SANPHAM.in"));
        Scanner input = new Scanner(new File("SANPHAM.in"));
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Product> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            a.add(new Product(input.nextLine(), input.nextLine(), Integer.parseInt(input.nextLine()), Integer.parseInt(input.nextLine())));
        }
        Collections.sort(a, new CompareByPriceDescAndIdAsc());
        for (Product x : a) {
            System.out.println(x);
        }
        input.close();

    }
}
