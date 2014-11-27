package com.finalproject.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class KhachHang {
	@Id
	@Column(name="IdKhachHang")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idKhachHang;
	
	@Column(name="HoTen")
	private String hoTen;
	
	@Column(name="CMND")
	private String CMND;
	
	@Column(name="NgaySinh")
	private Date ngaySinh;
	
	@Column(name="TenDangNhap")
	private String tenDangNhap;
	
	@Column(name="MatKhau")
	private String matKhau;
	
	@Column(name="HinhAnh")
	private String hinhAnh;
	
	public KhachHang(){}
	public KhachHang(int idKhachHang, String hoTen, String cMND, Date ngaySinh,
			String tenDangNhap, String matKhau, String hinhAnh) {
		super();
		this.idKhachHang = idKhachHang;
		this.hoTen = hoTen;
		CMND = cMND;
		this.ngaySinh = ngaySinh;
		this.tenDangNhap = tenDangNhap;
		this.matKhau = matKhau;
		this.hinhAnh = hinhAnh;
	}
	public int getIdKhachHang() {
		return idKhachHang;
	}
	public void setIdKhachHang(int idKhachHang) {
		this.idKhachHang = idKhachHang;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getCMND() {
		return CMND;
	}
	public void setCMND(String cMND) {
		CMND = cMND;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getTenDangNhap() {
		return tenDangNhap;
	}
	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public String getHinhAnh() {
		return hinhAnh;
	}
	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}
	
}
