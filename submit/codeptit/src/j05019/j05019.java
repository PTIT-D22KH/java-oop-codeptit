package j05019;

import java.util.ArrayList;
import java.util.Scanner;

public class j05019 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int t = Integer.parseInt(input.nextLine());
        ArrayList<Station> a = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String name = input.nextLine();
            boolean notFound = true;
            String startTime = input.nextLine();
            String endTime = input.nextLine();
            double newRainVolume = Double.parseDouble(input.nextLine());
            for (Station station: a) {
                if (station.getName().equals(name)) {
                    notFound = false;
                    station.addTime(startTime, endTime);
                    station.updateRainVolume(newRainVolume);
                    break;
                    // System.out.println(station);
                } 
            }
            if (notFound) {
                a.add(new Station(name, startTime, endTime, newRainVolume));
                // System.out.println(a);
            }
            for (Station station: a) {
                station.calAverageRainVolume();
            }
                
        }
        for (Station station: a) {
            System.out.println(station);
        }
        input.close();

    }
}
