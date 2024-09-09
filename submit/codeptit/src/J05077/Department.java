package J05077;

import java.util.*;

public class Department {
    private String id, name;
    private static Map<String, Department> departmentMap = new HashMap<>();
    public Department(String s) {
        String a[] = s.trim().split("\\s+");
        this.id = a[0];
        StringBuilder temp = new StringBuilder();
        for (int i = 1; i < a.length; i++) {
            temp.append(a[i]).append(" ");
        }

        this.name = temp.toString().trim();
        departmentMap.put(a[0], this);
    }
    public static Map<String, Department> getDepartmentMap() {
        return departmentMap;
    }
    public String getName() {
        return name;
    }
    
    
}
