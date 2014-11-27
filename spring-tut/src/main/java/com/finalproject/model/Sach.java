package com.finalproject.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sach {
	@Id
	@Column(name="IdSach")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idSach;
	
	@Column(name="TenSach")
	private String tenSach;
	
	@Column(name="TomTat")
	private String tomTat;
	
	@Column(name="NhaXuatBan")
	private int nhaXuatBan;
	
	@Column(name="HinhAnh")
	private String hinhAnh;
	
	@Column(name="DinhDang")
	private String dinhDang;
	
	@Column(name="NgayPhatHanh")
	private Date ngayPhatHanh;
	
	@Column(name="NguoiDich")
	private int nguoiDich;
	
	@Column(name="TacGia")
	private int tacGia;
	
	@Column(name="KhoiLuong")
	private float khoiLuong;
	
	@Column(name="KichThuoc")
	private String kichThuoc;
	
	@Column(name="DanhMuc")
	private int danhMuc;
	
	@Column(name="SoTrang")
	private int soTrang;
	
	@Column(name="Gia")
	private float gia;
	
	@Column(name="MaKhuyenMai")
	private int maKhuyenMai;
	
	@Column(name="Tag")
	private int tag;
	
	public Sach(){}
	public Sach(int idSach, String tenSach, String tomTat, int nhaXuatBan,
			String hinhAnh, String dinhDang, Date ngayPhatHanh, int nguoiDich,
			int tacGia, float khoiLuong, String kichThuoc, int danhMuc,
			int soTrang, float gia, int maKhuyenMai, int tag) {
		super();
		this.idSach = idSach;
		this.tenSach = tenSach;
		this.tomTat = tomTat;
		this.nhaXuatBan = nhaXuatBan;
		this.hinhAnh = hinhAnh;
		this.dinhDang = dinhDang;
		this.ngayPhatHanh = ngayPhatHanh;
		this.nguoiDich = nguoiDich;
		this.tacGia = tacGia;
		this.khoiLuong = khoiLuong;
		this.kichThuoc = kichThuoc;
		this.danhMuc = danhMuc;
		this.soTrang = soTrang;
		this.gia = gia;
		this.maKhuyenMai = maKhuyenMai;
		this.tag = tag;
	}
	public int getIdSach() {
		return idSach;
	}
	public void setIdSach(int idSach) {
		this.idSach = idSach;
	}
	public String getTenSach() {
		return tenSach;
	}
	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}
	public String getTomTat() {
		return tomTat;
	}
	public void setTomTat(String tomTat) {
		this.tomTat = tomTat;
	}
	public int getNhaXuatBan() {
		return nhaXuatBan;
	}
	public void setNhaXuatBan(int nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}
	public String getHinhAnh() {
		return hinhAnh;
	}
	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}
	public String getDinhDang() {
		return dinhDang;
	}
	public void setDinhDang(String dinhDang) {
		this.dinhDang = dinhDang;
	}
	public Date getNgayPhatHanh() {
		return ngayPhatHanh;
	}
	public void setNgayPhatHanh(Date ngayPhatHanh) {
		this.ngayPhatHanh = ngayPhatHanh;
	}
	public int getNguoiDich() {
		return nguoiDich;
	}
	public void setNguoiDich(int nguoiDich) {
		this.nguoiDich = nguoiDich;
	}
	public int getTacGia() {
		return tacGia;
	}
	public void setTacGia(int tacGia) {
		this.tacGia = tacGia;
	}
	public float getKhoiLuong() {
		return khoiLuong;
	}
	public void setKhoiLuong(float khoiLuong) {
		this.khoiLuong = khoiLuong;
	}
	public String getKichThuoc() {
		return kichThuoc;
	}
	public void setKichThuoc(String kichThuoc) {
		this.kichThuoc = kichThuoc;
	}
	public int getDanhMuc() {
		return danhMuc;
	}
	public void setDanhMuc(int danhMuc) {
		this.danhMuc = danhMuc;
	}
	public int getSoTrang() {
		return soTrang;
	}
	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}
	public float getGia() {
		return gia;
	}
	public void setGia(float gia) {
		this.gia = gia;
	}
	public int getMaKhuyenMai() {
		return maKhuyenMai;
	}
	public void setMaKhuyenMai(int maKhuyenMai) {
		this.maKhuyenMai = maKhuyenMai;
	}
	public int getTag() {
		return tag;
	}
	public void setTag(int tag) {
		this.tag = tag;
	}
	
}
