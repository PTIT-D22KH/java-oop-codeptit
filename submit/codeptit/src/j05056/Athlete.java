package j05056;

import java.util.Comparator;

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
        this.priorityTime = calPriorityTime();
        this.finalTime = calFinalTime();
        count++;
        this.id = String.format("VDV%02d", count);
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getId() {
        return id;
    }

    private Time calPriorityTime() {
        if (age < 18) {
            return new Time("00:00:00");
        } else if (age < 25) {
            return new Time("00:00:01");
        } else if (age < 32) {
            return new Time("00:00:02");
        }
        return new Time("00:00:03");
    }

    public Time getFinalTime() {
        return finalTime;
    }

    private Time calFinalTime() {
        return this.runTime.timeDiff(priorityTime);
    }
    public int getRank() {
        return rank;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + runTime + " " + priorityTime + " " + finalTime + " " + rank;
    }
}
class CompareByFinalTime implements Comparator<Athlete> {
    @Override
    public int compare(Athlete a, Athlete b) {
        if (a.getFinalTime().getHour() == b.getFinalTime().getHour()) {
            if (a.getFinalTime().getMinutes() == b.getFinalTime().getMinutes()) {
                if (a.getFinalTime().getSeconds() > b.getFinalTime().getSeconds()) {
                    return 1;
                }
                return -1;
            } else if (a.getFinalTime().getMinutes() > b.getFinalTime().getMinutes()) {
                return 1;

            }
            return -1;

        } else if (a.getFinalTime().getSeconds() > b.getFinalTime().getSeconds()) {
            return 1;
        }
        return -1;
    }
}

class CompareByRank implements Comparator<Athlete> {
    @Override
    public int compare(Athlete a, Athlete b) {
        if (a.getRank() > b.getRank()) {
            return 1;
        } 
        return -1;
    }
}