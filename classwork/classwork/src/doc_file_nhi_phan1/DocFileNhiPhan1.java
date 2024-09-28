/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doc_file_nhi_phan1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

/**
 *
 * @author P51
 */
/*
Cho file nhị phân DAYSO.DAT trong đó ghi một ArrayList<Integer> theo kiểu Object. Hãy thống kê các số nguyên tố khác nhau có từ 3 chữ số trở lên và liệt kê theo thứ tự từ nhỏ đến lớn.

Input

File nhị phân DAYSO.DAT trong đó ghi một ArrayList<Integer>.

Dữ liệu đảm bảo trong ArrayList có không quá 100000 đối tượng số Integer. Các giá trị số cũng đều không quá 1000000.

Output

Ghi lần lượt các số nguyên tố khác nhau có từ 3 chữ số trở lên theo thứ tự từ nhỏ đến lớn, mỗi số ghi trên một dòng.

Ví dụ

Input

Output

File nhị phân như mô tả đề bài.

Ví dụ kết quả sẽ như sau

113

163

229

887

907
*/
public class DocFileNhiPhan1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, FileNotFoundException {
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("DAYSO.DAT")); 
        ArrayList<Integer> a = (ArrayList<Integer>)input.readObject();
        TreeSet<Integer> se = new TreeSet<>(a);
        Collections.sort(a);
        ArrayList<Integer> res = new ArrayList<>();
        for (int x : a) {
            if(isPrime(x) && !res.contains(x)) {
                res.add(x);
            }
        }
        for (int x : res) {
            System.out.println(x);
        }
        
        
    }
    private static boolean isPrime(int x) {
        if(x < 100) {
            return false;
        }
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
