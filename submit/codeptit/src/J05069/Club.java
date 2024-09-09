package J05069;

public class Club {
    private String id, name, matchId;
    private long totalMoney;
    private long ticketPrice;

    public Club(String id, String name, long ticketPrice) {
        this.id = id;
        this.name = name;
        this.ticketPrice = ticketPrice;
        this.totalMoney = 0;
        this.matchId = "";
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getTotalMoney() {
        return totalMoney;
    }

    public void calTotalMoney(long attendance) {
        this.totalMoney += attendance * ticketPrice;
    }

    @Override
    public String toString() {
        return matchId + " " + name + " " + totalMoney;
    }
}