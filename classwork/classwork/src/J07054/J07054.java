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
        double currScore = transcripts.get(0).getAvgScore();
        for (int i = 0; i < n; i++) {
            if (transcripts.get(i).getAvgScore() == currScore) {
                transcripts.get(i).setRank(rank);
            } else {
                transcripts.get(i).setRank(i + 1);
                rank = i + 1;
                currScore = transcripts.get(i).getAvgScore();
            }
        }
        for (Transcript x : transcripts) {
            System.out.println(x);
        }
        input.close();

    }
}
