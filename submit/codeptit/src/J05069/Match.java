package J05069;

public class Match {
    private String id;
    private long ticketPrice;

    public Match(String id, long ticketPrice) {
        this.id = id;
        this.ticketPrice = ticketPrice;
    }
    public static String getClubIdFromMatchId(String id) {
        return id.substring(1, 3);
    }
}
