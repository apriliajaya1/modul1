/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class modul202357201041 {
    public static void main(String[] args) {
        // TODO code application logic here
        int data[][] = {{4, 6, 4, 2, 8, 4, 2, 10}, {4, 6, 4, 2, 8, 4,
            2, 10}};
        int jumlah=0;
        double total=0;
        for (int a = 0; a < data.length; a++)  {
            for (int b = 0; b < data[a].length; b++) { 
                System.out.print(data[a][b]+" ");
                total += data[a][b];
                jumlah++;
        }
            System.out.println("\n");
            
        } 
        double ratarata = total / jumlah;
        System.out.println("rata rata = " + ratarata);
    }           
}

    

