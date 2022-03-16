package main;

import java.util.Date;

public class HoaDonTheoNgay extends HoaDon{
	public int soNgayThue;
	
	public HoaDonTheoNgay(long _maHoaDon, String _ngayHoaDon, String _tenKH, int _roomId, int _donGia) {
		super(_maHoaDon, _ngayHoaDon, _tenKH, _roomId, _donGia);
	}
	
	public double TinhTien() {
		double thanhtien = soNgayThue*donGia;
		
		if (soNgayThue > 7) {
			double soNgayGiamGia = thanhtien - 7;
			
			return thanhtien - soNgayGiamGia*donGia*0.2;
		}else 
			return  thanhtien;
	}
	
	@Override
	protected void XuatHoaDon() {
		super.XuatHoaDon();
		System.out.println("Số ngày thuê:	"+soNgayThue);
	}
}
