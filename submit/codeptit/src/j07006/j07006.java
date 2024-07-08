package j07006;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class j07006 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException, ClassNotFoundException{

        ObjectInputStream input = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) input.readObject();
        int []fre = new int[1001];
        for (int i : a) {
            fre[i]++;
        }
        for (int i = 0; i < 1001; i++) {
            if (fre[i] > 0) {
                System.out.printf("%d %d\n", i, fre[i]);
            }
        }
        input.close();
    }
}
