package QuanLiBatDongSan;

import java.util.Scanner;

public class BDS_ChungCu extends BDS_Dat
{
	private int SoTang;
	private int SoPhong;
	
	public BDS_ChungCu()
	{
		super();
		this.SoTang = 0;
		this.SoPhong = 0;
		this.setPhiGiaoDich(0.02);
	}
	
	public BDS_ChungCu(int ID, String Ten, String ViTri, double TriGia, int SoTang, int SoPhong)
	{
		super(ID, Ten, ViTri, TriGia);
		this.SoTang = SoTang;
		this.SoPhong = SoPhong;
		this.setPhiGiaoDich(0.02);
	}
	
	@Override
	public void Nhap()
	{
		Scanner scan = new Scanner(System.in);
		
		super.Nhap();
		System.out.print("So tang: ");
		this.SoTang = scan.nextInt();
		System.out.print("So phong: ");
		this.SoPhong = scan.nextInt();
	}
	
	@Override
	public void Xuat()
	{
		super.Xuat();
		System.out.println("So tang: " + this.SoTang);
		System.out.println("So phong: " + this.SoPhong);
	}
	
	@Override
	public void setTriGia(double TriGia) {
		super.setTriGia(TriGia);
		this.setPhiGiaoDich(0.02);
	}
}
