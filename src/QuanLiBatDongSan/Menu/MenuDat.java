package QuanLiBatDongSan.Menu;

import QuanLiBatDongSan.ModuleChucNang.*;
import java.util.Scanner;

public class MenuDat 
{
	private int ChucNang;
	
	public void Call_Menu_Dat()
	{
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("--He thong giao dich dat--");
		System.out.println("1. Danh sach giao dich");
		System.out.println("2. Tim kiem giao dich");
		System.out.println("3. Them giao dich");
		System.out.println("4. Sua giao dich");
		System.out.println("5. Xoa giao dich");
		
		this.ChucNang = Scan.nextInt();
		switch (ChucNang) {
			case 1:
				GiaoDichDanhSach DanhSach = new GiaoDichDanhSach();
				DanhSach.CallDanhSach();
				break;
			default:
				break;
		}
	}
}
