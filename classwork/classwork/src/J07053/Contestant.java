package J07053;

public class Contestant {
    private String id, name, dob;
    private static int count = 0;
    private double score1, score2 , rewardScore, totalScore;
    public Contestant(String name, String dob, double score1, double score2) {
        this.name = name;
        this.dob = dob;
        this.score1 = score1;
        this.score2 = score2;
        count++;
        this.id = String.format("PH%2d", count);
        this.rewardScore = calRewardScore();
    }
    private double calRewardScore(){
        if (score1 >= 8 && score2 >= 8) {
            return 1.0;
        } else if (score1 >= 7.5 && score2 >= 7.5) {
            return 0.5;
        } 
        return 0.0;
    }

    

}
