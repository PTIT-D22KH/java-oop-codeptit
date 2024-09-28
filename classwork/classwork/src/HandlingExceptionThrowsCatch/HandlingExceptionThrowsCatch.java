package HandlingExceptionThrowsCatch;

public class HandlingExceptionThrowsCatch {
    public static void main(String[] args) {
        // Write your code here
        int d = 0;
        try {
            int d = SoNguyen.nhapDiem();
        } catch (DiemException e) {
            e.getLocalizedMessage();
        }
        

        System.out.println("Diem = " + d);
    }
}
