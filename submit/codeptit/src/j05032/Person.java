package j05032;

import java.util.Comparator;

public class Person {
    private String name;
    private MyDate dob;
    public Person(String name, String inputDob) {
        this.name = name;
        this.dob = new MyDate(inputDob);
    }
    public String getName() {
        return name;
    }
    public MyDate getDob() {
        return dob;
    }
}
class CompareByAge implements Comparator<Person> {
    @Override
    public int compare(Person a, Person b) {
        if (a.getDob().getYear() == b.getDob().getYear()) {
            if (a.getDob().getMonth() == b.getDob().getMonth()) {
                if (a.getDob().getDay() < b.getDob().getDay()) {
                    return 1;
                } 
                return -1;
            } else if (a.getDob().getMonth() < b.getDob().getMonth()) {
                return 1;
            }
            return -1;
            
        } else if (a.getDob().getYear() < b.getDob().getYear()) {
            return 1;
        }
        return -1;
    }
}