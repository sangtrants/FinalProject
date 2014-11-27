package com.finalproject.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WishList {
	@Id
	@Column(name="IdWishList")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idWishList;
	
	@Column(name="NgayThaoTac")
	private Date ngayThaoTac;
	
	@Column(name="NgayKhoiTao")
	private Date ngayKhoiTao;
	
	@Column(name="MaNguoiDung")
	private int maNguoiDung;
	
	public WishList(){}
	public WishList(int idWishList, Date ngayThaoTac, Date ngayKhoiTao,
			int maNguoiDung) {
		super();
		this.idWishList = idWishList;
		this.ngayThaoTac = ngayThaoTac;
		this.ngayKhoiTao = ngayKhoiTao;
		this.maNguoiDung = maNguoiDung;
	}
	public int getIdWishList() {
		return idWishList;
	}
	public void setIdWishList(int idWishList) {
		this.idWishList = idWishList;
	}
	public Date getNgayThaoTac() {
		return ngayThaoTac;
	}
	public void setNgayThaoTac(Date ngayThaoTac) {
		this.ngayThaoTac = ngayThaoTac;
	}
	public Date getNgayKhoiTao() {
		return ngayKhoiTao;
	}
	public void setNgayKhoiTao(Date ngayKhoiTao) {
		this.ngayKhoiTao = ngayKhoiTao;
	}
	public int getMaNguoiDung() {
		return maNguoiDung;
	}
	public void setMaNguoiDung(int maNguoiDung) {
		this.maNguoiDung = maNguoiDung;
	}
	
}
