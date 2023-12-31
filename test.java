package Du_An_PRO192;

import java.net.Socket;
import java.util.Scanner;

//- Viết chương trình chạy command line để quản lý giảng viên và sinh viên 
//gồm các chức năng (lựa chọn chức năng bằng input từ command line)
//+ giảng viên: 
//	tìm kiếm (email, 1 môn học, 2 môn học), export kết quả tìm kiếm ra file
//	thêm, xóa và sửa thông tin giảng viên
//+ sinh viên: 
//	tìm kiếm (email, 1 chuyên ngành, 2 chuyên ngành), export kết quả tìm kiếm ra file
//	thêm, xóa và sửa thông tin sinh viên
public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Quan_Li ql = new Quan_Li();
		int luachon = 0;
		do {
			
			System.out.println(""+ "Moi ban lua chon: \r\n"
			+ "1. Giang Vien \r\n"		                     
			+ "2. Sinh Vien  \r\n");
			
					


			luachon = sc.nextInt();
			sc.nextLine();
			if(luachon==1) {
				do {
					
					System.out.println("Menu----------------------------------------");
					System.out.println("" 
					+ "Giang Vien: \r\n" 
					        + "			1. Them giang vien\r\n"
							+ "			2. In ra thong tin cua giang vien .\r\n"
							+ "			3. Tim kiem giang vien dua tren mon giang day.\r\n"
							+ "			4. Tim kiem giang vien dua tren email.\r\n"
							+ "         5. Kiem tra ten cua giang vien co ton tai hay khong.\r\n"
							+ "			6. Xoa thong tin cua giang vien .\r\n"
							+ "			7. Sua thong tin cua giang vien.\r\n"
							+ "			8. Xoa tat ca thong tin cua giang vien.\r\n"
							+ "			0. Nhap 0 de dung chuong trinh.\r\n");

					luachon = sc.nextInt();
					sc.nextLine();
			
			if (luachon == 1) {
				System.out.println("Nhap ten: ");
				String ten = sc.nextLine();
				System.out.println("Nhap email: ");
				String email = sc.nextLine();
				System.out.println("Nhap mon day: ");
				String mon_day = sc.nextLine();
				System.out.println("Nhap so dien thoai: ");
				String so_Dien_Thoai= sc.nextLine();


				Giang_Vien gv = new Giang_Vien(ten, email, mon_day, so_Dien_Thoai);
				ql.themGiangVien(gv);
			} else if (luachon == 2) {
				ql.xuatGiangVien();
			} else if (luachon == 3) {
				System.out.println("Nhap ten mon day: ");
				ql.timKiemGiangVien_MonDay(sc.nextLine(), "Ketqua_GiangVien(MonDay).txt");
			} else if (luachon == 4) {
				System.out.println("Nhap Email de tim kiem giang vien: ");
				ql.timKiemGiangVien_Email(sc.nextLine(), "ketqua_giangvien(Email).txt");
			} else if (luachon == 5) {
				System.out.println("Nhap ten giang vien de kiem tra ton tai : ");
				String ten = sc.nextLine();
				System.out.println("Giang Vien co ton tai hay khong: " + ql.kiemTraGiangVienTonTai(ten));
			} else if (luachon == 6) {
				System.out.println("Nhap email de xoa giang vien: ");
				String email = sc.nextLine();
				System.out.println("Xoa giang vien: " + ql.xoaTenGiangVien(email));

			} else if (luachon == 7) {
				System.out.println("Nhap ten giang vien ban muon thay doi thong tin: ");
				String ten = sc.nextLine();
				System.out.println("Nhap ten giang vien moi: ");
				String tenmoi = sc.nextLine();
				System.out.println("Nhap email giang vien moi: ");
				String emailmoi = sc.nextLine();
				System.out.println("Nhap mon day giang vien moi: ");
				String mondaymoi = sc.nextLine();
				System.out.println("Nhap so dien thoai giang vien moi: ");
				String so_Dien_Thoai = sc.nextLine();


				Giang_Vien gvMoi = new Giang_Vien(tenmoi, emailmoi, mondaymoi, so_Dien_Thoai );
				System.out.println("Ket qua sua: " + ql.suaThongTin(ten, gvMoi));

			} else if (luachon == 8) {
				System.out.println("Xoa tat ca giang vien: " +ql.xoaTatCaGiangVien());
			}
			} while(luachon!=0);}
			else if(luachon ==2) {
				do {				
					System.out.println("Menu----------------------------------------");
					System.out.println("" 
				+ "Sinh Vien: \r\n"

					+ "			1. Them sinh vien\r\n" 
					+ "			2. In ra thong tin cua hoc sinh .\r\n"
					+ "			3. Tim kiem hoc sinh  dua tren mon hoc.\r\n"
					+ "			4. Tim kiem ten hoc sinh dua tren email.\r\n"
					+ "         5. Kiem tra ten cua hoc sinh  co ton tai hay khong .\r\n"
					+ "			6. Xoa thong tin cua hoc sinh .\r\n"
					+ "			7. Sua thong tin cua hoc sinh .\r\n"
					+ "			8. Xoa tat ca thong tin cua hoc sinh .\r\n"
					+ "			0. Nhap 0 de dung chuong trinh .\r\n");


					luachon = sc.nextInt();
					sc.nextLine();
			 if (luachon == 1) {
				System.out.println("Nhap ten: ");
				String ten = sc.nextLine();
				System.out.println("Nhap email: ");
				String email = sc.nextLine();
				System.out.println("Nhap chuyen nganh: ");
				String chuyen_nganh = sc.nextLine();
				System.out.println("Nhap so dien thoai cua sinh vien: ");
				String so_Dien_Thoai = sc.nextLine();


				Sinh_Vien sv = new Sinh_Vien(ten, email, chuyen_nganh, so_Dien_Thoai);
				ql.themSinhVien(sv);
			} else if (luachon == 2) {
				ql.xuatSinhVien();
			} else if (luachon == 3) {
				System.out.println("Nhap ten mon hoc de tim kiem sinh vien: ");
				ql.timKiemTen_MonHoc(sc.nextLine(), "Ketqua_SinhVien(ChuyenNganh).txt");
			} else if (luachon == 4) {
				System.out.println("Nhap email de tim kiem sinh vien: ");
				ql.timKiem_Email(sc.nextLine(), "Ketqua_SinhVien(Email).txt");
			} else if (luachon == 5) {
				System.out.println("Nhap ten de kiem tra sinh vien co ton tai: ");
				String ten = sc.nextLine();
				System.out.println("Sinh vien co ton tai: " + ql.kiemTraTonTai_SinhVien(ten));
			} else if (luachon == 6) {
				System.out.println("Nhap email de xoa ten sinh vien: ");
				String email = sc.nextLine();
				System.out.println("Xoa sinh vien: " + ql.xoaThongTin_SinhVien(email));
			} else if (luachon == 7) {
				System.out.println("Nhap ten sinh vien de thay doi thong tin: ");
				String ten = sc.nextLine();
				System.out.println("Nhap ten moi cua sinh vien: ");
				String tenMoi = sc.nextLine();
				System.out.println("Nhap email moi cua sinh vien: ");
				String emailMoi = sc.nextLine();
				System.out.println("Nhap chuyen nganh moi cua sinh vien: ");
				String chuyenNganhMoi = sc.nextLine();
				System.out.println("Nhap so dien thoai moi cua sinh vien: ");
				String so_Dien_Thoai = sc.nextLine();


				Sinh_Vien svMoi = new Sinh_Vien(tenMoi, emailMoi, chuyenNganhMoi, so_Dien_Thoai);
				System.out.println("Sua thong tin: " + ql.suaThongTin_SinhVien(ten, svMoi));
			} else if(luachon ==8) {
				System.out.println("Xoa sinh vien: " +ql.xoaTatCaSinhVien());
			}} while(luachon !=0);}
		} while (luachon != 0);

	}
}
