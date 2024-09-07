package J05059;

import java.util.Comparator;

public class Contestant {
    private String id, name;
    private double math, physics, chemistry, priorityScore, totalScore;
    public Contestant(String id, String name, double math, double physics, double chemistry) {
        this.id = id;
        this.name = name;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        this.priorityScore = calPriorityScore();
        this.totalScore = math * 2 + physics + chemistry + priorityScore;
    }
    private double calPriorityScore () {
        switch(id.substring(2,3)) {
            case "1":
                return 0.5;
            case "2":
                return 1.0;
            case "3":
                return 2.5;
            default:
                return 0.0;
        }
    }
    public double getTotalScore() {
        return totalScore;
    }
    public String getId() {
        return id;
    }
    @Override
    public String toString(){ 
        if (priorityScore - (int)priorityScore == 0) {
            if (totalScore - (int)totalScore == 0) {
                return id + " " + name + String.format(" %.0f %.0f", priorityScore, totalScore);
            } else {
                return id + " " + name + String.format(" %.0f %.1f", priorityScore, totalScore);

            }
            
        } else {
            if (totalScore - (int)totalScore == 0) {
                return id + " " + name + String.format(" %.1f %.0f", priorityScore, totalScore);
            } else {
                return id + " " + name + String.format(" %.1f %.1f", priorityScore, totalScore);

            }
        }
    }

    
}
class CompareByTotalScoreAndId implements Comparator<Contestant> {
    @Override
    public int compare(Contestant a, Contestant b) {
        int cmpTotalScore = Double.compare(b.getTotalScore(), a.getTotalScore());
        if (cmpTotalScore == 0) {
            return a.getId().compareTo(b.getId());
        }
        return cmpTotalScore;
    }
}