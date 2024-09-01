package J07045;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class J07045 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        // Write your code here
        Scanner input = new Scanner(new File("J07045/PHONG.in"));

        int n = Integer.parseInt(input.nextLine());
        ArrayList<Room> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String s = input.nextLine();
            String temp[] = s.trim().split("\\s+");
            a.add(new Room(temp[0], temp[1], Double.parseDouble(temp[2]), Double.parseDouble(temp[3])));
        }
        Collections.sort(a, new CompareByName());
        for (Room x : a) {
            System.out.println(x);
        }
    }
}
