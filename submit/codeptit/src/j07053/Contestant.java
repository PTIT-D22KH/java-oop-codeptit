package j07053;

public class Contestant {
    private String id, name, dob, result;
    private static int count = 0;
    private int age;
    private double score1, score2, rewardScore, totalScore;

    public Contestant(String name, String dob, double score1, double score2) {
        this.name = formatName(name);
        this.dob = dob;
        this.score1 = score1;
        this.score2 = score2;
        this.age = calAge(dob);
        count++;
        this.id = String.format("PH%02d", count);
        this.rewardScore = calRewardScore();
        this.totalScore = calTotalScore();
        this.result = calResult();
    }

    private int calAge(String dob) {
        String[] a = dob.split("/");
        int year = Integer.parseInt(a[2]);
        return 2021 - year;
    }

    private String calResult() {
        if (totalScore < 5) {
            return "Truot";
        } else if (totalScore < 7) {
            return "Trung binh";
        } else if (totalScore == 7) {
            return "Kha";
        } else if (totalScore == 8) {
            return "Gioi";
        } else {
            return "Xuat sac";
        }
    }

    private double calTotalScore() {
        double sum = (score1 + score2) / 2.0 + rewardScore;
        if (sum > 10.0) {
            return 10.0;
        }
        return roundDouble(sum);
    }

    private double roundDouble(double n) {
        return Math.round(n);
    }

    private double calRewardScore() {
        if (score1 >= 8 && score2 >= 8) {
            return 1.0;
        } else if (score1 >= 7.5 && score2 >= 7.5) {
            return 0.5;
        }
        return 0.0;
    }

    private String formatName(String s) {
        String[] a = s.trim().split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String word : a) {
            res.append(Character.toUpperCase(word.charAt(0)));
            for (int j = 1; j < word.length(); j++) {
                res.append(Character.toLowerCase(word.charAt(j)));
            }
            res.append(" ");
        }
        return res.toString().trim();
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age + String.format(" %.0f ", totalScore) + result;
    }
}