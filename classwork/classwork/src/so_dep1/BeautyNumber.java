/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so_dep1;

/**
 *
 * @author P51
 */
public class BeautyNumber {
    private int number, fre1, fre2;

    public BeautyNumber(int number, int fre1, int fre2) {
        this.number = number;
        this.fre1 = fre1;
        this.fre1 = fre2;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getFre1() {
        return fre1;
    }

    public void setFre1(int fre1) {
        this.fre1 = fre1;
    }

    public int getFre2() {
        return fre2;
    }

    public void setFre2(int fre2) {
        this.fre2 = fre2;
    }

    
    
    @Override
    public String toString() {
        return number + " " + fre1 + " " + fre2;
    }
}
