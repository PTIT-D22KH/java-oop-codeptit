package j05070;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class j05070 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Club> clubs = new ArrayList<>(n);

        for (int i = 0; i < n; i++ ){
            clubs.add(new Club(input.nextLine(), input.nextLine(), Long.parseLong(input.nextLine())));
        }

        int m = Integer.parseInt(input.nextLine());
        ArrayList<Match> matches = new ArrayList<>(m);
        for (int i = 0; i < n; i++) {
            String s = input.nextLine();
            String temp[] = s.split(" ");
            String id = temp[0];
            long ticketPrice = Long.parseLong(temp[1]);
            String clubId = Match.getClubIdFromMatchId(id);
            matches.add(new Match(id, ticketPrice));
            for (Club x : clubs) {
                if (x.getId().equals(clubId)) {
                    x.calTotalMoney(ticketPrice);
                    x.setMatchId(id);
                }
            }
        }
        Collections.sort(clubs, new CompareByTotalMoneyAndName());
        for (Club x : clubs) {
            System.out.println(x);
        }
        input.close();
    }
}
