package com.finalproject.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NhanVien {
	@Id
	@Column(name="IdNhanVien")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idNhanVien;
	
	@Column(name="HoTen")
	private String hoTen;
	
	@Column(name="CMND")
	private String CMND;
	
	@Column(name="NgaySinh")
	private Date ngaySinh;
	
	@Column(name="tenDangNhap")
	private String tenDangNhap;
	
	@Column(name="MatKhau")
	private String matKhau;
	
	public NhanVien(){}
	public NhanVien(int idNhanVien, String hoTen, String cMND, Date ngaySinh,
			String tenDangNhap, String matKhau) {
		super();
		this.idNhanVien = idNhanVien;
		this.hoTen = hoTen;
		CMND = cMND;
		this.ngaySinh = ngaySinh;
		this.tenDangNhap = tenDangNhap;
		this.matKhau = matKhau;
	}
	public int getIdNhanVien() {
		return idNhanVien;
	}
	public void setIdNhanVien(int idNhanVien) {
		this.idNhanVien = idNhanVien;
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
	
}
