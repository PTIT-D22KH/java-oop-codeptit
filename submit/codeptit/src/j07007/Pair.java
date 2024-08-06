package j07007;

public class Pair<T, S> {
    private T first;
    private S second;

    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }
    public boolean isPrime() {
        return checkPrime((Integer)first) && checkPrime((Integer)second);
    }
    
    private boolean checkPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    @Override
    public String toString(){ 
        return first + " " + second;
    }
}
