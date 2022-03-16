package main;

import java.util.Date;

public class HoaDonTheoGio extends HoaDonTheoNgay{
	public int soGioThue;
	public HoaDonTheoGio(long _maHoaDon, String _ngayHoaDon, String _tenKH, int _roomId, int _donGia) {
		super(_maHoaDon, _ngayHoaDon, _tenKH, _roomId, _donGia);
	}
	
	
	public double TinhTien(){
		double tinhTien = soGioThue * donGia;
		
		if (soGioThue > 30) 
			return super.TinhTien();
		else if (soGioThue >= 24)
			return 24*donGia;
		else 
			return tinhTien;
	}
	
	@Override
	protected void XuatHoaDon() {
		super.XuatHoaDon();
		System.out.println("Số giờ thuê:	"+soGioThue);
	}
	
}
