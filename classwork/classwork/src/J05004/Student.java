package J05004;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Student {
    private String name, className, id;
    private Date dobDate;
    private double gpa;
    private static int count = 0;
    private SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
    public Student(String name, String className, String dob, double gpa) throws ParseException{
        count++;
        this.id = String.format("B20DCCN%03d", count);
        this.name = formatName(name);
        this.className = className;
        this.dobDate = sd.parse(dob);
        this.gpa = gpa;
    }
    private String formatName(String name) {
        String words[] = name.trim().toLowerCase().split("\\s+");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            res.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1)).append(" ");
        }
        return res.toString().trim();
    }
    @Override
    public String toString( ){
        return id + " " + name + " " +  className + " " + sd.format(dobDate) + " " + String.format("%.02f", gpa);
    }

    
}
