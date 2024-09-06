package J05076;

public class Product {
    private String id, name, rank;
    private double interestRate;

    public Product(String id, String name, String rank)  {
        this.id = id;
        this.name = name;
        this.rank = rank;
        this.interestRate = calInterestRate();
    }
    private double calInterestRate() {
        if (rank.equals("A")) {
            return 0.08;
        } else if (rank.equals("B")) {
            return 0.05;
        } else if (rank.equals("C")) {
            return 0.02;
        }
        return 0;
    }
    
    public String getId() {
        return id;
    }
    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
    
}
