package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HoaDon {
	protected long maHoaDon;
	protected Date ngayHoaDon;
	protected String tenKH;
	protected int roomId;
	protected int donGia;
	
	protected HoaDon(long _maHoaDon, String _ngayHoaDon, String _tenKH, int _roomId, int _donGia) {
		maHoaDon = _maHoaDon;
		SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/MM/yyyy");
		try {
			ngayHoaDon = ngayVietNam.parse(_ngayHoaDon);
		} catch (ParseException e) {
		    e.printStackTrace();
		}
		tenKH = _tenKH;
		roomId = _roomId;
		donGia = _donGia;
	}
	
	protected void XuatHoaDon() {
		System.out.println("----------------------------------------------------");
		System.out.println("| Mã hóa đơn:	"+maHoaDon+"	|");
		System.out.println("| Ngày nhận phòng:	"+ngayHoaDon+"	|");
		System.out.println("| Tên khách hàng:	"+tenKH+"	|");
		System.out.println("| Số phòng:		"+roomId+"	|");
		System.out.println("| Đơn giá phòng:	"+donGia+"	|");
		System.out.println("----------------------------------------------------");
	}
	
//	protected void SetNgayHoaDon(String date) {
//		SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/MM/yyyy");
//		try {
//			ngayHoaDon = ngayVietNam.parse(date);
//		} catch (ParseException e) {
//		    e.printStackTrace();
//		}
//	}
	
//	public long GetMaHoaDon() {
//		return maHoaDon;
//	}
//	
//	public Date GetNgayHoaDon() {
//		return ngayHoaDon;
//	}
//	
//	public String GetTenKH() {
//		return tenKH;
//	}
//	
//	public int GetRoomId() {
//		return roomId;
//	}
//	
//	public int GetDonGia() {
//		return donGia;
//	}
}
