package com.finalproject.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class KhuyenMai {
	@Id
	@Column(name="IdKhuyenMai")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idKhuyenMai;
	
	@Column(name="IdKhuyenMai")
	private String tenKhuyenMai;
	private String moTa;
	private int saleOff;
	private Date ngayBatDau;
	private Date ngayKetThuc;
	private int active;
	
	public KhuyenMai(){}
	public KhuyenMai(int idKhuyenMai, String tenKhuyenMai, String moTa,
			int saleOff, Date ngayBatDau, Date ngayKetThuc, int active) {
		super();
		this.idKhuyenMai = idKhuyenMai;
		this.tenKhuyenMai = tenKhuyenMai;
		this.moTa = moTa;
		this.saleOff = saleOff;
		this.ngayBatDau = ngayBatDau;
		this.ngayKetThuc = ngayKetThuc;
		this.active = active;
	}
	public int getIdKhuyenMai() {
		return idKhuyenMai;
	}
	public void setIdKhuyenMai(int idKhuyenMai) {
		this.idKhuyenMai = idKhuyenMai;
	}
	public String getTenKhuyenMai() {
		return tenKhuyenMai;
	}
	public void setTenKhuyenMai(String tenKhuyenMai) {
		this.tenKhuyenMai = tenKhuyenMai;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public int getSaleOff() {
		return saleOff;
	}
	public void setSaleOff(int saleOff) {
		this.saleOff = saleOff;
	}
	public Date getNgayBatDau() {
		return ngayBatDau;
	}
	public void setNgayBatDau(Date ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}
	public Date getNgayKetThuc() {
		return ngayKetThuc;
	}
	public void setNgayKetThuc(Date ngayKetThuc) {
		this.ngayKetThuc = ngayKetThuc;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	
}
