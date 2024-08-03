package j05070;

import java.util.Comparator;

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
    public String getName() {
        return name;
    }
    public long getTotalMoney() {
        return totalMoney;
    }
    public void calTotalMoney(long ticketPrice) {
        this.totalMoney += attendance * ticketPrice;
    }
    @Override
    public String toString(){ 
        return matchId + " " + name + " " + totalMoney;
    }
}

class CompareByTotalMoneyAndName implements Comparator<Club> {
    @Override
    public int compare(Club a, Club b) {
        if (a.getTotalMoney() == b.getTotalMoney()) {
            return a.getName().compareTo(b.getName());
        } else if (a.getTotalMoney() < b.getTotalMoney()) {
            return 1;
        }
        return -1;
    }
}