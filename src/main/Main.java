package main;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rd = new Random();
		
		List<HoaDonTheoGio> dsHD_TheoGio = new ArrayList<HoaDonTheoGio>();
		List<HoaDonTheoNgay> dsHD_TheoNgay = new ArrayList<HoaDonTheoNgay>();;
		
//		Date startDate = new Date(2012, 1, 1);
//		Date endDate = new Date(2022, 16, 3);
		
		for(int i = 0; i < 20; i++) {
			int random = rd.nextInt(1) + 1;
			
			int randomNgay = rd.nextInt(30) + 1;
			int randomThang = rd.nextInt(11) + 1;
			int randomNam = rd.nextInt(12) + 2010;
			
			int roomId = rd.nextInt(29) + 1;
			
			int donGia = (rd.nextInt(2) + 1)*80000;
			
			if (random == 1) {
			    String date = Integer.toString(randomNgay)+"-"+Integer.toString(randomThang)+"-"+Integer.toString(randomNam);
				HoaDonTheoGio hd = new HoaDonTheoGio(rd.nextInt(10000)+9999, date, "Dương Đức Tiến", roomId, donGia);
				dsHD_TheoGio.add(hd);
			}else {
				String date = Integer.toString(randomNgay)+"-"+Integer.toString(randomThang)+"-"+Integer.toString(randomNam);
				HoaDonTheoNgay hd = new HoaDonTheoNgay(rd.nextInt(10000)+9999, date, "Dương Đức Tiến", roomId, donGia);
				dsHD_TheoNgay.add(hd);
			}
		}
		
		
		
		
		while(true) {
			System.out.println("-------------Hãy lựa chọn chức năng:-------");
			System.out.println("1: Thêm phòng thuê mới");
			System.out.println("2: In danh sách các phòng thuê");
			System.out.println("3: In tổng số lượng các loại phòng đang thuê");
			System.out.println("4: Tính trung bình thành tiền các hóa đơn thuê phòng trong tháng 9/2013");
			
			int luachon = input.nextInt();
			switch (luachon) {
			case 1:
				System.out.println("------------------------------------\nHãy nhập thông tin");
				System.out.print("Thuê theo giờ hay theo ngày: 1 → Theo giờ		2 → Theo ngày| Lựa chọn: "); int choose = input.nextInt();
				if (choose == 1) {
					LocalDateTime now = LocalDateTime.now();
					String date = Integer.toString(now.getDayOfMonth()) +"-"+ Integer.toString(now.getMonthValue()) +"-"+ Integer.toString(now.getYear());
					System.out.print("Nhập số phòng: "); int roomId = input.nextInt();
					System.out.print("Nhập đơn giá: "); int donGia = input.nextInt();
					HoaDonTheoGio hd = new HoaDonTheoGio(rd.nextInt(10000)+9999, date, "Dương Đức Tiến", roomId, donGia);
					dsHD_TheoGio.add(hd);
				}else if (choose == 1){
					LocalDateTime now = LocalDateTime.now();
					String date = Integer.toString(now.getDayOfMonth()) +"-"+ Integer.toString(now.getMonthValue()) +"-"+ Integer.toString(now.getYear());
					System.out.print("Nhập số phòng: "); int roomId = input.nextInt();
					System.out.print("Nhập đơn giá: "); int donGia = input.nextInt();
					HoaDonTheoNgay hd = new HoaDonTheoNgay(rd.nextInt(10000)+9999, date, "Dương Đức Tiến", roomId, donGia);
					dsHD_TheoNgay.add(hd);
				}
				break;
			case 2:
				for (HoaDonTheoGio hoaDonTheoGio : dsHD_TheoGio) {
					hoaDonTheoGio.XuatHoaDon();
				}
				
				for (HoaDonTheoNgay hoaDonTheoNgay : dsHD_TheoNgay) {
					hoaDonTheoNgay.XuatHoaDon();
				}
			case 3:
				int count1 = 0;
				int count2 = 0;
				for (HoaDonTheoGio hoaDonTheoGio : dsHD_TheoGio) {
					count1++;
				}
				
				for (HoaDonTheoNgay hoaDonTheoNgay : dsHD_TheoNgay) {
					count2++;
				}
				System.out.println("Tổng hóa đơn theo ngày: "+count2+"	Tổng hóa đơn theo giờ: "+count1);
			default:
				break;
			}
		}
	}
}
