package J05063;
import java.util.*;
public class Variable {
    private int coefficient, power;

    public Variable(int coefficient, int power) {
        this.coefficient = coefficient;
        this.power = power;
    }
    public int getPower() {
        return power;
    }
    public int getCoefficient() {
        return coefficient;
    }
    @Override 
    public String toString (){ 
        return coefficient + "*x^"+ power;
    }

    
}
class CompareByPower implements Comparator<Variable> {
    @Override
    public int compare(Variable a, Variable b) {
        return Integer.compare(b.getPower(), a.getPower());
    }
}