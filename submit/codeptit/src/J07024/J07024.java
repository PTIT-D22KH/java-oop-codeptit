package J07024;
import java.util.*;
import java.io.*;
public class J07024 {
    public static void main(String[] args) throws IOException {
        // Write your code here

        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
        
    }
}