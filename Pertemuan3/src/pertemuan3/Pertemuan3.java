/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan3;

import javax.swing.JOptionPane;

/**
 *
 * @author Sri Andayani
 * Sat 22/03/2025
 */
public class Pertemuan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // perulangan 'while'
        int naw = 0;
        int awal = naw;
        int akhir = naw;
        
        awal = Integer.parseInt(JOptionPane.showInputDialog("Input Nilai Awal"));
        akhir = Integer.parseInt(JOptionPane.showInputDialog("Input Nilai Akhir"));
        //Float.parseFloat(s);
        
        System.out.println("Perulangan --WHILE--");
        while(awal < akhir){
            System.out.println("Perulangan ke-"+awal);
            awal++; //kode yang artinya awal = awal + 1
        }
        
        //Perulangan do while
        System.out.println("Perulangan --DO...WHILE--");
        int pertama = 0;
        do{
            System.out.println("Perulangan ke-"+pertama);
            pertama++;
        }while(pertama<10);
        
        //perbedannya adalah while jika nilai bernilai false maka tidak akan ada yang di print sama sekali
        // sedangkan do while ketika syarat false maka akan di print sekali kemudian berhenti
        
        //perulangan for
        System.out.println("Perulangan --FOR--");
        for(int first= 0;first<10; first++){
            System.out.println("Perulangan ke-"+first);
        }
    }
    
}
