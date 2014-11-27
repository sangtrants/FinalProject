package com.finalproject.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CtDonHang {
	@Id
	@Column(name="IdCtDonHang")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idCtDonHang;
	
	@Column( name="MaSach")
	private int maSach;
	
	@Column(name="Gia")
	private float gia;
	
	@Column(name="SoCuon")
	private int soCuon;
	
	@Column(name="NgayMua")
	private Date ngayMua;
	
	@Column(name="MaDonHang")
	private int maDonHang;
	
	public CtDonHang(){}
	public CtDonHang(int idCtDonHang, int maSach, float gia, int soCuon,
			Date ngayMua, int maDonHang) {
		super();
		this.idCtDonHang = idCtDonHang;
		this.maSach = maSach;
		this.gia = gia;
		this.soCuon = soCuon;
		this.ngayMua = ngayMua;
		this.maDonHang = maDonHang;
	}
	public int getIdCtDonHang() {
		return idCtDonHang;
	}
	public void setIdCtDonHang(int idCtDonHang) {
		this.idCtDonHang = idCtDonHang;
	}
	public int getMaSach() {
		return maSach;
	}
	public void setMaSach(int maSach) {
		this.maSach = maSach;
	}
	public float getGia() {
		return gia;
	}
	public void setGia(float gia) {
		this.gia = gia;
	}
	public int getSoCuon() {
		return soCuon;
	}
	public void setSoCuon(int soCuon) {
		this.soCuon = soCuon;
	}
	public Date getNgayMua() {
		return ngayMua;
	}
	public void setNgayMua(Date ngayMua) {
		this.ngayMua = ngayMua;
	}
	public int getMaDonHang() {
		return maDonHang;
	}
	public void setMaDonHang(int maDonHang) {
		this.maDonHang = maDonHang;
	}
	
}
