package j07005;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class j07005 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Write your code here
        DataInputStream input = new DataInputStream(new FileInputStream("DATA.IN"));
        Map<Integer, Integer> mp = new TreeMap<>();

        // int []fre = new int[1001];
        for (int i = 0; i < 100000; i++) {
            int value = input.readInt();
            if (mp.containsKey(value)){
                mp.put(value, mp.get(value) + 1);
            } else {
                mp.put(value, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        input.close();

    }
}