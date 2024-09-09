package J07072;
import java.util.*;
import java.io.*;
public class J07072 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        // Write your code here
        // Scanner input = new Scanner(new File("J07072/DANHSACH.in"));
        Scanner input = new Scanner(new File("DANHSACH.in"));
        ArrayList<Name> a = new ArrayList<>();
        while (input.hasNextLine()) {
            a.add(new Name(input.nextLine()));
        }
        Collections.sort(a, new CompareByName());
        for (Name x : a) {
            System.out.println(x);
        }
        input.close();
    }
}
