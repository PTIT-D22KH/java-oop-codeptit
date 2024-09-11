package J07040;
import java.util.*;
import java.io.*;
public class J07040 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Write your code here
        ObjectInputStream input1 = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> a = (ArrayList<String>) input1.readObject();
        input1.close();

        Set<String> se1 = new HashSet<>();
        for (String x : a) {
            String words[] = x.trim().toLowerCase().split("\\s+");
            for (String word : words) {
                se1.add(word);
            }
            
        }

        Set<String> res = new LinkedHashSet<>();
        Scanner input2 = new Scanner(new File("VANBAN.in"));
        while(input2.hasNextLine()) {
            String s = input2.nextLine().trim().toLowerCase();
            String words[] = s.split("\\s+");
            for (String word : words) {
                
                if (se1.contains(word)) {
                    res.add(word);
                }
            }
        }
        input2.close();
        
        for (String x : res) {
            System.out.println(x);
        }

    }
}
