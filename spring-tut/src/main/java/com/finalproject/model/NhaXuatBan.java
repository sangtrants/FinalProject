package com.finalproject.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NhaXuatBan {
	@Id
	@Column(name="IdNhaXuatBan")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idNhaXuatBan;
	
	@Column(name="TenNXB")
	private String tenNXB;
	
	@Column(name="SoDT")
	private String soDT;
	
	@Column(name="Website")
	private String webSite;
	
	@Column(name="TaiKhoan")
	private String taiKhoan;
	
	@Column(name="NgayThanhLap")
	private Date ngayThanhLap;
	
	@Column(name="DiaChi")
	private String diaChi;
	
	public NhaXuatBan(){}
	public NhaXuatBan(int idNhaXuatBan, String tenNXB, String soDT,
			String webSite, String taiKhoan, Date ngayThanhLap, String diaChi) {
		super();
		this.idNhaXuatBan = idNhaXuatBan;
		this.tenNXB = tenNXB;
		this.soDT = soDT;
		this.webSite = webSite;
		this.taiKhoan = taiKhoan;
		this.ngayThanhLap = ngayThanhLap;
		this.diaChi = diaChi;
	}
	public int getIdNhaXuatBan() {
		return idNhaXuatBan;
	}
	public void setIdNhaXuatBan(int idNhaXuatBan) {
		this.idNhaXuatBan = idNhaXuatBan;
	}
	public String getTenNXB() {
		return tenNXB;
	}
	public void setTenNXB(String tenNXB) {
		this.tenNXB = tenNXB;
	}
	public String getSoDT() {
		return soDT;
	}
	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}
	public String getWebSite() {
		return webSite;
	}
	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}
	public String getTaiKhoan() {
		return taiKhoan;
	}
	public void setTaiKhoan(String taiKhoan) {
		this.taiKhoan = taiKhoan;
	}
	public Date getNgayThanhLap() {
		return ngayThanhLap;
	}
	public void setNgayThanhLap(Date ngayThanhLap) {
		this.ngayThanhLap = ngayThanhLap;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	
}
