package tugas2oop;

import java.util.Scanner;
/**
 *
 * Ni Kadek Dwi Pratiwi
 * Nim = 2201010051
 * Kelas = U
 * TUGAS 2 OOP
 */
public class Tugas2OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dIN = new Scanner(System.in);
        
        System.out.print("Nilai Panjang : ");
        double nAlas = dIN.nextDouble();
        
        System.out.print("Nilai Lebar : ");
        double nLebar = dIN.nextDouble();
        
        System.out.print("Nilai Tinggi : ");
        double nTinggi = dIN.nextDouble();
        
        VolumeBalok VB = new VolumeBalok(nAlas, nLebar, nTinggi);
        
//        LS.setALAS(71);
//        LS.setTINGGI(86);
        VB.VolumeBalok();   
        
        System.out.println("Nilai Panjang : "+ VB.getPANJANG());
        System.out.println("Nilai Lebar : "+ VB.getLEBAR());
        System.out.println("Nilai Tinggi : "+ VB.getTINGGI());
        System.out.println("Jadi Volume Balok : ");
        System.out.println("Volume = Panjang x Lebar x Tinggi");
        System.out.println("     = "+ VB.getPANJANG() + " x "+ VB.getLEBAR()+" x "+VB.getTINGGI());
        System.out.println("     = "+ VB.getVOL());
    }
    
}