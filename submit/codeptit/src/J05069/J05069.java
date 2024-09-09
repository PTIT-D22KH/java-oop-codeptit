package J05069;

import java.util.*;

public class J05069 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Club> clubs = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            clubs.add(new Club(input.nextLine(), input.nextLine(), Long.parseLong(input.nextLine())));
        }

        int m = Integer.parseInt(input.nextLine());
        ArrayList<Match> matches = new ArrayList<>(m);
        for (int i = 0; i < m; i++) {
            String s = input.nextLine();
            String[] temp = s.split(" ");
            String id = temp[0];
            long attendance = Long.parseLong(temp[1]);
            String clubId = Match.getClubIdFromMatchId(id);
            matches.add(new Match(id, attendance));
            for (Club x : clubs) {
                if (x.getId().equals(clubId)) {
                    x.calTotalMoney(attendance);
                    x.setMatchId(id);
                }
            }
        }

        for (Match match : matches) {
            for (Club club : clubs) {
                if (club.getId().equals(Match.getClubIdFromMatchId(match.getId()))) {
                    System.out.println(match.getId() + " " + club.getName() + " " + club.getTotalMoney());
                }
            }
        }

        input.close();
    }
}