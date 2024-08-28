
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();
    Scanner sc = new Scanner(System.in);
    int chon;

    
    do{
        System.out.println("QUAN LY SACH");
        System.out.println("1. Xuat toan bo danh sach");
        System.out.println("2. Tim sach co ky tu la Lap trinh");
        System.out.println("3. Sap xep gia tang dan");
        System.out.println("4. Xoa sach theo ma sach");
        System.out.println("5. Sua gia ban bia theo ma sach");
        System.out.println("6. Tinh tong gia tri cua sach");
        System.out.println("0. Thoat");
        System.out.print("Ban chon:");
        chon = sc.nextInt();
        
        switch (chon) {
            case 1:
                ql.xuat();
                break;
            case 2:
                ql.timSp();
                break;
            case 3:
                ql.sapxep();
                break;
            case 4:
                System.out.print("Nhap ma sach can xoa:");
                String masach = sc.nextLine();
                ql.xoaMaSach(masach);
                break;
            case 5:
                System.out.println("Nhap ma sach can sua gia ban:");
                String maSach = sc.nextLine();
                System.out.println("Nhap gia ban: ");
                double giaBan = sc.nextDouble();
                ql.suaGiaMaSach(maSach, giaBan);
                break;
            case 6:
                double tinhTong = ql.tinhTong();
                System.out.println("Tong tri gia: " + tinhTong);
                break;
            case 0:
                System.out.println("Thoat");
                break;
            default:
                System.out.println("KHong hop le");
                break;
        }
    }while(chon!=0);
    }
    

}
