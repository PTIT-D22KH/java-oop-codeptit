package J05076;
import java.util.*;
public class J05076 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Bill> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new Bill(input.nextLine(), input.nextLine(), input.nextLine()));
        }
        int m = Integer.parseInt(input.nextLine());
        for (int i = 0; i < m; i++) {
            String s = input.nextLine();
            String b[] = s.trim().split("\\s+");
            String id = b[0];
            long numImport = Long.parseLong(b[1]);
            long singlePrice = Long.parseLong(b[2]);
            long numExport = Long.parseLong(b[3]);
            for (Bill x : a) {
                if (x.getProduct().getId().equals(id)) {
                    x.setNumImport(numImport);
                    x.setSinglePrice(singlePrice);
                    x.setNumExport(numExport);
                    x.calTotalImportCost();
                    x.calTotalExportValue();
                    break;
                }
            }
        }
        for (Bill x : a) {
            System.out.println(x);
        }
    }
}
