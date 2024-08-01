package j05055;

public class Athlete {
    private String id, name, dob;
    private int age, rank;
    private Time runTime, priorityTime, finalTime;
    private static int count = 0;
    public Athlete(String name, String dob, String startTime, String endTime) {
        this.name = name;
        this.dob = dob;
        Time start = new Time(startTime);
        Time end = new Time(endTime);
        this.runTime = start.timeDiff(end);
        this.age = 2024 - Integer.parseInt(dob.substring(6));
        
    }

    
    
}
