package J05069;

public class Club {
    private String id, name, matchId;
    private long totalMoney;
    private long attendance;

    public Club(String id, String name, long attendance) {
        this.id = id;
        this.name = name;
        this.attendance = attendance;
        this.totalMoney = 0;
        this.matchId = "";
    }
    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }
    public String getId() {
        return id;
    }
    public void calTotalMoney(long ticketPrice) {
        this.totalMoney += attendance * ticketPrice;
    }
    @Override
    public String toString(){ 
        return matchId + " " + name + " " + totalMoney;
    }
}