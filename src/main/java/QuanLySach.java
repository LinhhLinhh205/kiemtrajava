
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ADMIN
 */
public class QuanLySach {

    private ArrayList<Sach> ds;

    public QuanLySach() {
        ds = new ArrayList<>();

        ds.add(new Sach("KH011", "Lap trinh java", 95000, 2017));
        ds.add(new Sach("KH012", "Co so du lieu", 85000, 2001));
        ds.add(new Sach("KH013", "Nhap mon lap trinh", 72000, 2013));
        ds.add(new Sach("KH014", "Lap trinh Python", 39000, 2015));
        ds.add(new Sach("KH015", "Lap trinhC#", 82000, 2015));
    }

    public void xuat() {

        for (Sach sach : ds) {
            System.out.println(sach);
        }
        
    }

    public ArrayList<Sach> laySpTruoc2015() {
        ArrayList<Sach> kq=new ArrayList<>();
        for (Sach sach : ds) {
            if (sach.getNamxuatban() < 2015) {
                kq.add(sach);
            }
        }
        return kq;
    }

    public void timSp() {
        for (Sach sach : ds) {
            if (sach.getTensach().startsWith("Lap trinh")) {
                System.out.println(sach);
            }
        }
    }

    public void sapxep() {
        ds.sort((sp1, sp2) -> Double.compare(sp1.getGiaban(), sp2.getGiaban()));
        System.out.println("Danh sach san pham sau khi sap xep ");
        for (Sach sv : ds) {
            System.out.println(sv);
        }
    }

    public void xoaMaSach(String maSach) {
        Iterator<Sach> iterator = ds.iterator();
        while (iterator.hasNext()) {
            Sach sach = iterator.next();
            if (sach.getMasach().equals(maSach)) {
                iterator.remove();
            }
        }

    }

    public void suaGiaMaSach(String maSach, double giaBan) {
        for (Sach sach : ds) {
            if (sach.getMasach().equals(maSach)) {
                sach.setGiaban(giaBan);
                System.out.println("Da sua thanh cong");
                return;
            }
        }
    }

    public double tinhTong() {
        double tong = 0;
        for (Sach sach : ds) {
            tong += sach.getGiaban();
        }
        return tong;
    }

}
