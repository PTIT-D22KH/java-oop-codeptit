package j05055;

public class Time {
    private int hour, minutes, seconds;

    @Override
    public String toString() {
        return String.format("%02d:$02d:%02d", hour, minutes, seconds);
    }
}
