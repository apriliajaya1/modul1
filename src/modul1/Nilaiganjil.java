/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul1;

/**
 *
 * @author user
 */
public class Nilaiganjil {
   
    public static void main(String[] args) {
        // TODO code application logic here
        int data[][] = {{4, 6, 4, 2, 8, 4, 2, 10}, {4, 6, 4, 2, 8, 4, 2, 10}};
        int totalkolom = 0;
        for (int a = 0; a < data.length; a++) {
            for (int b = 0; b < data[0].length; b++) {
                if (b % 2 != 0) {
                    totalkolom += data[a][b];
                }
                
            }
            
        }
        System.out.print("Total elemen dengan index kolom ganjil :" +totalkolom);
    }
    
}
