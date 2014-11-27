package com.finalproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Review {
	@Id
	@Column(name="IdReview")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idReview;
	
	@Column(name="MaKhachHang")
	private int maKhachHang;
	
	@Column(name="Comment")
	private String comment;
	
	@Column(name="Rate")
	private int rate;
	
	@Column(name="Sach")
	private int Sach;
	
	public Review(){}
	public Review(int idReview, int maKhachHang, String comment, int rate,
			int sach) {
		super();
		this.idReview = idReview;
		this.maKhachHang = maKhachHang;
		this.comment = comment;
		this.rate = rate;
		Sach = sach;
	}
	public int getIdReview() {
		return idReview;
	}
	public void setIdReview(int idReview) {
		this.idReview = idReview;
	}
	public int getMaKhachHang() {
		return maKhachHang;
	}
	public void setMaKhachHang(int maKhachHang) {
		this.maKhachHang = maKhachHang;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getSach() {
		return Sach;
	}
	public void setSach(int sach) {
		Sach = sach;
	}
	
	
}
