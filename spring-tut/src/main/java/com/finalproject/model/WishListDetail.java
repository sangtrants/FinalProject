package com.finalproject.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WishListDetail {
	@Id
	@Column(name="IdWishListDetail")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idWishListDetail;
	
	@Column(name="MaSach")
	private	int maSach;
	
	@Column(name="NgayThem")
	private Date ngayThem;
	
	@Column(name="MaWishList")
	private int maWishList;
	public WishListDetail(){}
	public WishListDetail(int idWishListDetail, int maSach, Date ngayThem,
			int maWishList) {
		super();
		this.idWishListDetail = idWishListDetail;
		this.maSach = maSach;
		this.ngayThem = ngayThem;
		this.maWishList = maWishList;
	}
	public int getIdWishListDetail() {
		return idWishListDetail;
	}
	public void setIdWishListDetail(int idWishListDetail) {
		this.idWishListDetail = idWishListDetail;
	}
	public int getMaSach() {
		return maSach;
	}
	public void setMaSach(int maSach) {
		this.maSach = maSach;
	}
	public Date getNgayThem() {
		return ngayThem;
	}
	public void setNgayThem(Date ngayThem) {
		this.ngayThem = ngayThem;
	}
	public int getMaWishList() {
		return maWishList;
	}
	public void setMaWishList(int maWishList) {
		this.maWishList = maWishList;
	}
	
}
