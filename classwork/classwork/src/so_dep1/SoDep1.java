/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so_dep1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author P51
 */
public class SoDep1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, FileNotFoundException {
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("DATA1.in")); 
        ArrayList<Integer> a = (ArrayList<Integer>)input.readObject();
        ObjectInputStream input2 = new ObjectInputStream(new FileInputStream("DATA2.in")); 
        ArrayList<Integer> b = (ArrayList<Integer>)input.readObject();
        
    }
}
