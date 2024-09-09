package J05063;
import java.util.*;
public class DaThuc {
    private ArrayList<Variable> polynomial = new ArrayList<>();

    public DaThuc (){ 

    }
    public DaThuc(String s) {
        String a[] = s.trim().split("\\s*\\+\\s*");
        for (String x : a) {
            String b[] = x.trim().split("\\*x\\^");
            // System.out.println(b.length);
            polynomial.add(new Variable(Integer.parseInt(b[0]), Integer.parseInt(b[1])));
        }
        Collections.sort(polynomial, new CompareByPower());
    }

    public DaThuc cong(DaThuc other) {
        DaThuc res = new DaThuc();
        for (int i = 0; i < this.polynomial.size(); i++) {
            boolean hasPower = false;
            Variable x = polynomial.get(i);
            for (int j = 0; j < other.polynomial.size(); j++) {
                
                Variable y = other.polynomial.get(j);
                if (x.getPower() == y.getPower()) {
                    hasPower = true;
                    res.polynomial.add(new Variable(x.getCoefficient() + y.getCoefficient(), x.getPower()));
                    break;
                }
            }
            if (hasPower == false) {
                res.polynomial.add(x);
                
            }
        
        }
        for (int i = 0; i < other.polynomial.size(); i++) {
            boolean hasPower = false;
            Variable x = other.polynomial.get(i);
            for (int j = 0; j < polynomial.size(); j++) {
                
                Variable y = polynomial.get(j);
                if (x.getPower() == y.getPower()) {
                    hasPower = true;
                    // res.polynomial.add(new Variable(x.getCoefficient() + y.getCoefficient(), x.getPower()));
                    break;
                }
            }
            if (hasPower == false) {
                res.polynomial.add(x);
                
            }
        
        }
        
        Collections.sort(res.polynomial, new CompareByPower());
        return res;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < polynomial.size(); i++) {
            Variable x = polynomial.get(i);
            res.append(x);
            if (i != polynomial.size() - 1) {
                res.append(" + ");
            }
        }
        return res.toString().trim();
    }
}
