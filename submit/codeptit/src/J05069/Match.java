package J05069;

public class Match {
    private String id;
    private long attendance;

    public Match(String id, long attendance) {
        this.id = id;
        this.attendance = attendance;
    }

    public static String getClubIdFromMatchId(String id) {
        return id.substring(1, 3);
    }

    public String getId() {
        return id;
    }

    public long getAttendance() {
        return attendance;
    }
}