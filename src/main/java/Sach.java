/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Sach {
    private String masach;
    private String tensach;
    private double giaban;
    private int namxuatban;

    public Sach(String masach, String tensach, double giaban, int namxuatban) {
        this.masach = masach;
        this.tensach = tensach;
        this.giaban = giaban;
        this.namxuatban = namxuatban;
    }
    
    
    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public int getNamxuatban() {
        return namxuatban;
    }

    public void setNamxuatban(int namxuatban) {
        this.namxuatban = namxuatban;
    }

    @Override
    public String toString() {
        return "Sach{" + "masach=" + masach + ", tensach=" + tensach + ", giaban=" + giaban + ", namxuatban=" + namxuatban + '}';
    }
    
}
