package J07054;
import java.util.*;
import java.io.*;
public class J07054 {
    public static void main(String[] args) throws IOException{
        // Write your code here
        // Scanner input = new Scanner(new File("J07054/BANGDIEM.in"));
        Scanner input = new Scanner(new File("BANGDIEM.in"));
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Transcript> transcripts = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            transcripts.add(new Transcript(input.nextLine(), Integer.parseInt(input.nextLine()), Integer.parseInt(input.nextLine()), Integer.parseInt(input.nextLine())));
        }
        Collections.sort(transcripts);
        int rank = 1;
        for (int i = 0; i < n; i++) {
            if (i == 0 || transcripts.get(i).getAvgScore() != transcripts.get(i - 1).getAvgScore()) {
                rank = i + 1;
            }
            transcripts.get(i).setRank(rank);
        }
        for (Transcript x : transcripts) {
            System.out.println(x);
        }
        input.close();

    }
}
