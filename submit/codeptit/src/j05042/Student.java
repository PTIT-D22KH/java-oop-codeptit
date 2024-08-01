package j05042;

import java.util.Comparator;

public class Student {
    private String name;
    private long numTrues, numSubmits;
    public Student(String name, long numTrues, long numSubmits) {
        this.name = name;
        this.numTrues = numTrues;
        this.numSubmits = numSubmits;
    }

    public long getNumTrues() {
        return numTrues;
    }
    public long getNumSubmits() {
        return numSubmits;
    }
    @Override
    public String toString(){ 
        return name + " " + numTrues + " " + numSubmits;
    }
    
}

class CompareByNumTruesAndNumSubmit implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        if (a.getNumTrues() == b.getNumTrues()) {
            if (a.getNumSubmits() > b.getNumSubmits()) {
                return 1;
            } 
            return -1;
        } else if (a.getNumTrues() < b.getNumTrues()) {
            return 1;
        } 
        return -1;
    
    }
}
