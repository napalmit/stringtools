package it.napalm.stringtools.object;
// Generated 12-dic-2013 10.48.19 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TblRacquets generated by hbm2java
 */
public class TblRacquets implements java.io.Serializable {

	private Integer id;
	private Integer tblBrands;
	private Integer tblRacquetsPattern;
	private String model;
	private double headSize;
	private double length;
	private double weightUnstrung;
	private double weightStrung;
	private double balance;
	private double swingweight;
	private double stiffness;
	private String beamWidth;
	private String note;
	private Date dateModify;
	private Set tblRacquetsUsers = new HashSet(0);

	public TblRacquets() {
	}

	public TblRacquets(int tblBrands,
			int tblRacquetsPattern, String model,
			double headSize, double length, double weightUnstrung,
			double weightStrung, double balance,
			double swingweight, double stiffness) {
		this.tblBrands = tblBrands;
		this.tblRacquetsPattern = tblRacquetsPattern;
		this.model = model;
		this.headSize = headSize;
		this.length = length;
		this.weightUnstrung = weightUnstrung;
		this.weightStrung = weightStrung;
		this.balance = balance;
		this.swingweight = swingweight;
		this.stiffness = stiffness;
	}

	public TblRacquets(int tblBrands,
			int tblRacquetsPattern, String model,
			double headSize, double length, double weightUnstrung,
			double weightStrung, double balance,
			double swingweight, double stiffness, String beamWidth,
			String note, Date dateModify, Set tblRacquetsUsers) {
		this.tblBrands = tblBrands;
		this.tblRacquetsPattern = tblRacquetsPattern;
		this.model = model;
		this.headSize = headSize;
		this.length = length;
		this.weightUnstrung = weightUnstrung;
		this.weightStrung = weightStrung;
		this.balance = balance;
		this.swingweight = swingweight;
		this.stiffness = stiffness;
		this.beamWidth = beamWidth;
		this.note = note;
		this.dateModify = dateModify;
		this.tblRacquetsUsers = tblRacquetsUsers;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getTblBrands() {
		return this.tblBrands;
	}

	public void setTblBrands(int tblBrands) {
		this.tblBrands = tblBrands;
	}

	public int getTblRacquetsPattern() {
		return this.tblRacquetsPattern;
	}

	public void setTblRacquetsPattern(int tblRacquetsPattern) {
		this.tblRacquetsPattern = tblRacquetsPattern;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getHeadSize() {
		return this.headSize;
	}

	public void setHeadSize(double headSize) {
		this.headSize = headSize;
	}

	public double getLength() {
		return this.length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWeightUnstrung() {
		return this.weightUnstrung;
	}

	public void setWeightUnstrung(double weightUnstrung) {
		this.weightUnstrung = weightUnstrung;
	}

	public double getWeightStrung() {
		return this.weightStrung;
	}

	public void setWeightStrung(double weightStrung) {
		this.weightStrung = weightStrung;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getSwingweight() {
		return this.swingweight;
	}

	public void setSwingweight(double swingweight) {
		this.swingweight = swingweight;
	}

	public double getStiffness() {
		return this.stiffness;
	}

	public void setStiffness(double stiffness) {
		this.stiffness = stiffness;
	}

	public String getBeamWidth() {
		return this.beamWidth;
	}

	public void setBeamWidth(String beamWidth) {
		this.beamWidth = beamWidth;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getDateModify() {
		return this.dateModify;
	}

	public void setDateModify(Date dateModify) {
		this.dateModify = dateModify;
	}

	public Set getTblRacquetsUsers() {
		return this.tblRacquetsUsers;
	}

	public void setTblRacquetsUsers(Set tblRacquetsUsers) {
		this.tblRacquetsUsers = tblRacquetsUsers;
	}

}