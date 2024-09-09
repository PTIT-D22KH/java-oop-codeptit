package J02017;

import java.util.ArrayList;
import java.util.Scanner;

public class J02017 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(input.nextInt());
        }
        while(true) {
            boolean ok = false;
            for (int i = 0; i < a.size() - 1; i++){
                if ((a.get(i) + a.get(i + 1)) % 2 == 0) {
                    ok = true;
                    a.remove(i + 1);
                    a.remove(i);
                    i--;
                }
                
            }
            if (!ok) {
                break;
            }

        }
        System.out.println(a.size());
        input.close();
    }
}
