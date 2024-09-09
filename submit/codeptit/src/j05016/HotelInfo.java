package j05016;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HotelInfo {
    private String roomId;
    private int floor;
    private Date checkInDate, checkOutDate;
    private long numDays;
    private long additionalCost, totalCost;

    public HotelInfo(String roomId, String checkInString, String checkOutString, long additionalCost) {
        this.roomId = roomId;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.checkInDate = formatter.parse(checkInString);
            this.checkOutDate = formatter.parse(checkOutString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.floor = Integer.parseInt(roomId.substring(0, 1));
        this.additionalCost = additionalCost;
        this.numDays = (checkOutDate.getTime() - checkInDate.getTime()) / (1000 * 60 * 60 * 24) + 1;
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
    public String toString() {
        return roomId + " " + numDays + " " + totalCost;
    }
}