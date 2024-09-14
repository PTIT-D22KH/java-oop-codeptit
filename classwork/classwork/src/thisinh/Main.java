/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thisinh;

/**
 *
 * @author ADMIN
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ThiSinh a = new ThiSinh(in.nextLine(), in.nextLine(), in.nextFloat(), in.nextFloat(), in.nextFloat());
        System.out.println(a);
    }
}
