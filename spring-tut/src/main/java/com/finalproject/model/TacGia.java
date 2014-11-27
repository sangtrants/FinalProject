package com.finalproject.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TacGia {
	@Id
	@Column(name="IdTacGia")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idTacGia;
	
	@Column(name="TenTacGia")
	private String tenTacGia;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="QuocGia")
	private String quocGia;
	
	@Column(name="NamSinh")
	private Date namSinh;
	
	@Column(name="LoaiTacGia")
	private String loaiTacGia;
	
	public TacGia(){}
	public TacGia(int idTacGia, String tenTacGia, String email, String quocGia,
			Date namSinh, String loaiTacGia) {
		super();
		this.idTacGia = idTacGia;
		this.tenTacGia = tenTacGia;
		this.email = email;
		this.quocGia = quocGia;
		this.namSinh = namSinh;
		this.loaiTacGia = loaiTacGia;
	}
	public int getIdTacGia() {
		return idTacGia;
	}
	public void setIdTacGia(int idTacGia) {
		this.idTacGia = idTacGia;
	}
	public String getTenTacGia() {
		return tenTacGia;
	}
	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getQuocGia() {
		return quocGia;
	}
	public void setQuocGia(String quocGia) {
		this.quocGia = quocGia;
	}
	public Date getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(Date namSinh) {
		this.namSinh = namSinh;
	}
	public String getLoaiTacGia() {
		return loaiTacGia;
	}
	public void setLoaiTacGia(String loaiTacGia) {
		this.loaiTacGia = loaiTacGia;
	}
	
	
}
