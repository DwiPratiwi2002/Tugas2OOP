package tugas2oop;

/**
 * Ni Kadek Dwi Pratiwi
 * Nim = 2201010051
 * Kelas = U
 * TUGAS 2 OOP
 */
public class VolumeBalok {
    private double panjang, lebar, tinggi, vol;
    
    public VolumeBalok(double Pj, double Lb, double Tg){
        panjang = Pj;
        lebar = Lb;
        tinggi = Tg;
    }

    VolumeBalok(double nvol) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void setPANJANG (double nVAL){
        this.panjang = nVAL;
        panjang = nVAL;
    }
    public double getPANJANG(){
        return panjang;
    }
    public void setLEBAR (double nVAL){
        this.lebar = nVAL;
        lebar = nVAL;
    }
    public double getLEBAR(){
        return lebar;
    }
    public void setTINGGI (double nVAL){
        this.tinggi = nVAL;
        tinggi = nVAL;
    }
    public double getTINGGI(){
        return tinggi;
    }
    void VolumeBalok(){
        vol = (this.panjang*this.lebar*this.tinggi);
    }
    public double getVOL(){
        return vol;
    }
}
