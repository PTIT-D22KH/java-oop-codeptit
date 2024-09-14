package J05032;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Person implements Comparable<Person>{
    private String name;
    private Date dob;
    private SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");

    public Person(String s) throws ParseException{
        String a[] = s.trim().split("\\s+");
        this.name = a[0];
        this.dob = sd.parse(a[1]);
    }

    @Override
    public String toString (){
        return name;
    }
    @Override
    public int compareTo(Person other) {
        return Long.compare(other.dob.getTime(), this.dob.getTime());
    }
}
