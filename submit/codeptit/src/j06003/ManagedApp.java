package j06003;

import java.util.HashMap;
import java.util.Map;

public class ManagedApp {
    private static Map<String, String> assignmentName = new HashMap<>();

    public static Map<String, String> getAssignmentName() {
        return assignmentName;
    }
}
