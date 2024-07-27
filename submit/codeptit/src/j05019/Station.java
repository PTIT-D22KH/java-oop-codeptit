package j05019;

public class Station {
    private String name, id;
    private double rainVolume, averageRainVolume;
    // Time time;
    private int totalMinutes;
    private static int count = 0;

    public Station(String name, String startTime, String endTime, double rainVolume) {
        this.name = name;
        count++;
        String s = String.valueOf(count);
        if (s.length() == 1) {
            s = "0" + s;
        }
        this.id = "T" + s;
        this.totalMinutes = calTotalMinutes(startTime, endTime);
        this.rainVolume = rainVolume;
    } 
    private int calTotalMinutes(String startTime, String endTime) {
        Time start = new Time(startTime);
        Time end = new Time(endTime);
        return start.timeDiffToTotalMinutes(end);
    }
    public void calAverageRainVolume() {
        averageRainVolume = rainVolume / Time.minutesToHourDecimal(totalMinutes);
    }   
    public String getName() {
        return name;
    }

    public void updateRainVolume(double newRainVolume) {
        this.rainVolume += newRainVolume;
    }
    public void addTime(String startTime, String endTime) {
        this.totalMinutes += calTotalMinutes(startTime, endTime);
    }
    @Override
    public String toString(){ 
        return id + " " + name + " " + String.format("%.2f", averageRainVolume);
    }

}
