package QuanLiBatDongSan;

import java.io.*;
import java.util.Scanner;

public class BDS_Dat 
{
	private int ID;
	private String Ten;
	private String ViTri;
	private double TriGia;
	private double PhiGiaoDich;
	private double TienPhi;
	
	public BDS_Dat()
	{
		this.ID = 0;
		this.Ten = "Chua xac dinh";
		this.ViTri = "Chua xac dinh";
		this.TriGia = 0;
		this.PhiGiaoDich = this.TriGia * 0.01;
		this.TienPhi = this.TriGia + this.PhiGiaoDich;
	}
	
	public BDS_Dat(int ID, String Ten, String ViTri, double TriGia)
	{
		this.ID = ID;
		this.Ten = Ten;
		this.ViTri = ViTri;
		this.TriGia = TriGia;
		this.PhiGiaoDich = this.TriGia * 0.01;
		this.TienPhi = this.TriGia + this.PhiGiaoDich;
	}
	
	public void Nhap()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ID: ");
		this.ID = scan.nextInt();
		System.out.print("Ten: ");
		scan.nextLine();
		this.Ten = scan.nextLine();
		System.out.print("Vi tri: ");
		this.ViTri = scan.nextLine();
		System.out.print("Tri gia: ");
		this.TriGia = scan.nextDouble();

		this.PhiGiaoDich = this.TriGia * 0.01;
		this.TienPhi = this.TriGia + this.PhiGiaoDich;
	}
	
	public void Xuat()
	{
		System.out.println("ID: " + this.ID);
		System.out.println("Ten: " + this.Ten);
		System.out.println("Vi tri: " + this.ViTri);
		System.out.println("Tri gia: " + this.TriGia );
		System.out.println("Phi giao dich: " + String.format ("%.2f", this.PhiGiaoDich));
		System.out.println("Tien phi: " + this.TienPhi);
	}
	
	//set&get
	public void setID(int ID) {
		this.ID = ID;
	}
	public int getID() {
		return this.ID;
	}

	public void setTen(String Ten) {
		this.Ten = Ten;
	}
	public String getTen() {
		return this.Ten;
	}
	
	public void setViTri(String ViTri) {
		this.ViTri = ViTri;
	}
	public String getViTri() {
		return this.ViTri;
	}
	
	public void setTriGia(double TriGia) {
		this.TriGia = TriGia;
		setPhiGiaoDich(0.01);
	}
	public double getTriGia() {
		return TriGia;
	}
	
	public void setPhiGiaoDich(double PhanTram) {
		this.PhiGiaoDich = this.TriGia * PhanTram;
		this.TienPhi = this.TriGia + this.PhiGiaoDich;
	}
	public double getPhiGiaoDich() {
		return this.PhiGiaoDich;
	}
	public double getTienPhi() {
		return this.TienPhi;
	}
}
