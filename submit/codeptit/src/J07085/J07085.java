package J07085;
import java.util.*;
import java.io.*;
public class J07085 {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        // Write your code here
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("DATA.in"));    
        ArrayList<String> a = (ArrayList<String>)input.readObject();
        ArrayList<String> b = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        for (String s : a) { 
            StringBuilder temp = new StringBuilder();
            for (int i =0 ; i < s.length(); i++) {
                
                if (Character.isDigit(s.charAt(i))) {
                    temp.append(s.charAt(i));
                }

            }
            String x = temp.toString();
            if (x.length() == 0) {
                continue;
            }
            int j = 0;
            while(j < x.length() && x.charAt(j) == '0') {
                j++;
            }
            x = x.substring(j);
            int y = 0;
            for (int i = 0; i < x.length(); i++) {
                y += x.charAt(i) - '0';
            }
            b.add(x);
            res.add(y);
            
        }
        for (int i = 0; i < b.size(); i++) {
            System.out.printf("%s %d\n", b.get(i), res.get(i));
        }




        input.close();
    }
}
