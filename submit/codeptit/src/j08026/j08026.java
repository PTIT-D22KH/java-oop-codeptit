package j08026;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class j08026 {
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Write your code here
        int t = input.nextInt();
        while (t-- > 0) {
            testCase();
        }
    }
    public static void testCase() {
        int s = input.nextInt();
        int t = input.nextInt();
        HashSet<Integer> visit = new HashSet<>();
        Deque<Pair<Integer,Integer>> dq = new ArrayDeque<>();
        Pair<Integer,Integer> a = Pair.createPair(s, 0);
        dq.add(a);
        visit.add(s);
        while(dq.size()>0){
            a = dq.getFirst();
            dq.remove(a);
            if(a.getFirst() == t){
                System.out.println(a.getSecond());
                break;
            }
            if(a.getFirst() * 2 == t||a.getFirst() -1 == t){
                System.out.println(a.getSecond() + 1);
                break;
            }
            if(!visit.contains(a.getFirst() * 2) && a.getSecond() >= a.getFirst() - t){
                dq.add(Pair.createPair(a.getFirst() * 2, a.getSecond() + 1));
                visit.add(a.getFirst() * 2);
            }
            if(!visit.contains(a.getFirst() - 1)){
                dq.add(Pair.createPair(a.getFirst() - 1, a.getSecond() + 1));
                visit.add(a.getFirst() - 1);
            }
        }
    }
}
