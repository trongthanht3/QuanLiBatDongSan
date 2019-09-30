package QuanLiBatDongSan;

public class QuanLiBatDongSan
{
	public static void main(String [] args)
	{
		System.out.println("Chao mung ban den voi dia oc Alibobo");
		BDS_ChungCu ChungCuA = new BDS_ChungCu();
		ChungCuA.Nhap();
		ChungCuA.setTriGia(100000);
		ChungCuA.Xuat();

	}
}
