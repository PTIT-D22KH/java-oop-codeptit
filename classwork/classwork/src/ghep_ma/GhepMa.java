/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ghep_ma;
import java.io.*;
import java.util.*;
/**
 *
 * @author P51
 */
/*

Để tăng tính bảo mật cho hệ thống, mã định danh của người dùng sẽ được tạo bởi phương pháp mới với 8 ký tự, trong đó:

5 ký tự đầu tiên là các chữ cái viết hoa, lấy từ file nhị phân DATA1.in
3 ký tự cuối là một giá trị số nguyên có ba chữ số lấy từ file nhị phân DATA2.in
File nhị phân DATA1.in được tạo sẵn với một ArrayList<String> được ghi theo kiểu Object với không quá 1000 xâu ký tự chữ hoa có đúng 5 chữ cái. Tuy nhiên có thể bị trùng nhau.

File nhị phân DATA2.in được tạo sẵn với một ArrayList<Integer> được ghi theo kiểu Object với không quá 500 số nguyên có ba chữ số. Tuy nhiên có thể bị trùng nhau.

Hãy viết chương trình liệt kê tất cả các giá trị mã khác nhau có thể được tạo ra và sắp xếp lại theo thứ tự từ điển.

Input

Hai file nhị phân DATA1.in và DATA2.in như mô tả.

Output

Danh sách các mã khác nhau được sắp xếp theo thứ tự từ điển, mỗi mã ghi trên một dòng.

Ví dụ

Input – 2 file nhị phân

Output

DATA1.in

Có một ArrayList<String>, ví dụ viết ở dạng ký tự có thể là:
AAAAA
BBBBB

 

DATA2.in

Có một ArrayList<Integer>, ví dụ viết ở dạng ký tự có thể là:

111

222

Danh sách các mã, ví dụ:

AAAAA111

AAAAA222

BBBBB111

BBBBB222

 

Gợi ý: Nên sử dụng TreeSet để lọc dữ liệu. Sau đó duyệt và in ra.
*/
public class GhepMa {
    public static void main(String[] args) throws IOException, ClassNotFoundException, FileNotFoundException {
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("DATA1.in")); 
        ArrayList<String> a = (ArrayList<String>)input.readObject();
        TreeSet<String> ts1 = new TreeSet<>(a);
        ObjectInputStream input2 = new ObjectInputStream(new FileInputStream("DATA2.in")); 
        ArrayList<Integer> b = (ArrayList<Integer>)input2.readObject();
        TreeSet<Integer> ts2 = new TreeSet<>(b);
        for (String x : ts1) {
            for (int y : ts2) {
                System.out.println(x+y);
            }
        }
    }
}
