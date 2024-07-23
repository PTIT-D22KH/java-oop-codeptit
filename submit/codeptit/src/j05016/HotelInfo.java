package j05016;

public class HotelInfo {
    private String roomId;
    private int floor;
    private MyDate checkInDate, checkOutDate;
    private long numDays;
    private long additionalCost, totalCost, basicCost;
    

    public HotelInfo(String roomId, String checkInString, String checkOutString, long additionalCost) {
        this.roomId = roomId;
        this.checkInDate = new MyDate(checkInString);
        this.checkOutDate = new MyDate(checkOutString);
        this.floor = Integer.parseInt(roomId.substring(0, 1));
        this.additionalCost = additionalCost;
        this.numDays = checkInDate.daysDiff(checkOutDate);
        this.totalCost = calTotalCost();
    }
    private long calTotalCost() {
        long res = 0;
        if (floor == 1) {
            res = 25 * this.numDays + additionalCost;
        } else if (floor == 2) {
            res = 34 * this.numDays + additionalCost;
        } else if (floor == 3) {
            res = 50 * this.numDays + additionalCost;
        } else if (floor == 4) {
            res = 80 * this.numDays + additionalCost;
        }
        return res;
    }
    public long getTotalCost() {
        return totalCost;
    }
    @Override
    public String toString(){ 
        return roomId + " " + numDays + " " + totalCost;
    }
}
