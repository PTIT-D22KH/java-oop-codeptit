/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thisinh;

/**
 *
 * @author ADMIN
 */
public class ThiSinh {
    private String hoten, ngaysinh;
    private float d1, d2, d3, tong;

    public ThiSinh(String hoten, String ngaysinh, float d1, float d2, float d3) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.tong = d1 + d2 + d3;
    }
    public String toString(){
        return hoten + " " + ngaysinh + " " + String.format("%.1f", tong);
    }
}
