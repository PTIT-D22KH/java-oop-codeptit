package HandlingExceptionThrowsCatch;
import java.util.*;
public class SoNguyen {
    public static int nhapDiem() throw new DiemException(""){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n < 0 || n > 10) {
            throw new DiemException("Nhap diem ngoai khoang cho phep");
        }
    }
}
