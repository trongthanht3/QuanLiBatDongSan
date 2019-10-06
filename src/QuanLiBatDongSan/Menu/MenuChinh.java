package QuanLiBatDongSan.Menu;

import java.util.Scanner;

public class MenuChinh 
{
	private int LoaiGiaoDich;
	
	public void Call_Menu()
	{
		Scanner Scan = new Scanner(System.in);
		System.out.println("Dia oc Alibobo kinh chao quy khach!");
		System.out.println("Chon loai giao dich");
		System.out.println("1. Dat");
		System.out.println("2. Chung cu");
		System.out.println("Chon: ");
		
		LoaiGiaoDich = Scan.nextInt();
		switch (LoaiGiaoDich) {
			case 1:
				MenuDat MenuDat = new MenuDat();
				MenuDat.Call_Menu_Dat();
				break;
			case 2:
			//	Call_Menu_Nha();
				break;
			default:
				break;
		}
				
	}
}
