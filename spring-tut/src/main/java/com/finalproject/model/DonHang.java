package com.finalproject.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DonHang {
	@Id
	@Column(name="IdDonHang")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idDonHang;
	
	@Column(name="NgayLap")
	private Date ngayLap;
	
	@Column(name="NgayGiaoDuKien")
	private Date ngayGiaoDuKien;
	
	@Column(name="NgayGiaoThucTe")
	private Date ngayGiaoThucTe;
	
	@Column(name="MaNguoiDung")
	private int maNguoiDung;
	
	@Column(name="TrangThaiDonHang")
	private String trangThaiDonHang;
	
	@Column(name="NguoiGiao")
	private int nguoiGiao;
	
	@Column(name="TongTien")
	private float tongTien;
	
	@Column(name="NguoiCheckDonHang")
	private int nguoiCheckDonHang;
	
	public DonHang(){}
	public DonHang(int idDonHang, Date ngayLap, Date ngayGiaoDuKien,
			Date ngayGiaoThucTe, int maNguoiDung, String trangThaiDonHang,
			int nguoiGiao, float tongTien, int nguoiCheckDonHang) {
		super();
		this.idDonHang = idDonHang;
		this.ngayLap = ngayLap;
		this.ngayGiaoDuKien = ngayGiaoDuKien;
		this.ngayGiaoThucTe = ngayGiaoThucTe;
		this.maNguoiDung = maNguoiDung;
		this.trangThaiDonHang = trangThaiDonHang;
		this.nguoiGiao = nguoiGiao;
		this.tongTien = tongTien;
		this.nguoiCheckDonHang = nguoiCheckDonHang;
	}
	public int getIdDonHang() {
		return idDonHang;
	}
	public void setIdDonHang(int idDonHang) {
		this.idDonHang = idDonHang;
	}
	public Date getNgayLap() {
		return ngayLap;
	}
	public void setNgayLap(Date ngayLap) {
		this.ngayLap = ngayLap;
	}
	public Date getNgayGiaoDuKien() {
		return ngayGiaoDuKien;
	}
	public void setNgayGiaoDuKien(Date ngayGiaoDuKien) {
		this.ngayGiaoDuKien = ngayGiaoDuKien;
	}
	public Date getNgayGiaoThucTe() {
		return ngayGiaoThucTe;
	}
	public void setNgayGiaoThucTe(Date ngayGiaoThucTe) {
		this.ngayGiaoThucTe = ngayGiaoThucTe;
	}
	public int getMaNguoiDung() {
		return maNguoiDung;
	}
	public void setMaNguoiDung(int maNguoiDung) {
		this.maNguoiDung = maNguoiDung;
	}
	public String getTrangThaiDonHang() {
		return trangThaiDonHang;
	}
	public void setTrangThaiDonHang(String trangThaiDonHang) {
		this.trangThaiDonHang = trangThaiDonHang;
	}
	public int getNguoiGiao() {
		return nguoiGiao;
	}
	public void setNguoiGiao(int nguoiGiao) {
		this.nguoiGiao = nguoiGiao;
	}
	public float getTongTien() {
		return tongTien;
	}
	public void setTongTien(float tongTien) {
		this.tongTien = tongTien;
	}
	public int getNguoiCheckDonHang() {
		return nguoiCheckDonHang;
	}
	public void setNguoiCheckDonHang(int nguoiCheckDonHang) {
		this.nguoiCheckDonHang = nguoiCheckDonHang;
	}
	
}
