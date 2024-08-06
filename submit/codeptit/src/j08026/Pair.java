package j08026;

public class Pair <T,S> {
    private T first;
    private S second;

    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }
    public T getFirst() {
        return first;
    }
    public S getSecond() {
        return second;
    }
    @Override
    public String toString() {
        return first+" "+second; //To change body of generated methods, choose Tools | Templates.
    }
    public static Pair<Integer, Integer> createPair(int s, int i){
        return new Pair<Integer, Integer>(s,i);
    }
}
