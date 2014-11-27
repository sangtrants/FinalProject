package com.finalproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DanhMuc {
	@Id
	@Column(name="IdDanhMuc")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idDanhMuc;
	@Column(name="TenDanhMuc")
	private String tenDanhMuc;
	
	public DanhMuc(){}
	public DanhMuc(int idDanhMuc, String tenDanhMuc) {
		super();
		this.idDanhMuc = idDanhMuc;
		this.tenDanhMuc = tenDanhMuc;
	}
	public int getIdDanhMuc() {
		return idDanhMuc;
	}
	public void setIdDanhMuc(int idDanhMuc) {
		this.idDanhMuc = idDanhMuc;
	}
	public String getTenDanhMuc() {
		return tenDanhMuc;
	}
	public void setTenDanhMuc(String tenDanhMuc) {
		this.tenDanhMuc = tenDanhMuc;
	}
	
}
