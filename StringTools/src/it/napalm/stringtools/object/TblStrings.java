package it.napalm.stringtools.object;
// Generated 12-dic-2013 10.48.19 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * TblStrings generated by hbm2java
 */
public class TblStrings implements java.io.Serializable {

	private Integer id;
	private TblGauges tblGauges;
	private TblBrands tblBrands;
	private TblStringType tblStringType;
	private String model;
	private String code;
	private float exactGauge;
	private Set tblStringingJobsesForTblStringsIdCross = new HashSet(0);
	private Set relStringPrices = new HashSet(0);
	private Set tblStringingJobsesForTblStringsIdMain = new HashSet(0);

	public TblStrings() {
	}

	public TblStrings(TblGauges tblGauges, TblBrands tblBrands,
			TblStringType tblStringType, String model, String code,
			float exactGauge) {
		this.tblGauges = tblGauges;
		this.tblBrands = tblBrands;
		this.tblStringType = tblStringType;
		this.model = model;
		this.code = code;
		this.exactGauge = exactGauge;
	}

	public TblStrings(TblGauges tblGauges, TblBrands tblBrands,
			TblStringType tblStringType, String model, String code,
			float exactGauge, Set tblStringingJobsesForTblStringsIdCross,
			Set relStringPrices, Set tblStringingJobsesForTblStringsIdMain) {
		this.tblGauges = tblGauges;
		this.tblBrands = tblBrands;
		this.tblStringType = tblStringType;
		this.model = model;
		this.code = code;
		this.exactGauge = exactGauge;
		this.tblStringingJobsesForTblStringsIdCross = tblStringingJobsesForTblStringsIdCross;
		this.relStringPrices = relStringPrices;
		this.tblStringingJobsesForTblStringsIdMain = tblStringingJobsesForTblStringsIdMain;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TblGauges getTblGauges() {
		return this.tblGauges;
	}

	public void setTblGauges(TblGauges tblGauges) {
		this.tblGauges = tblGauges;
	}

	public TblBrands getTblBrands() {
		return this.tblBrands;
	}

	public void setTblBrands(TblBrands tblBrands) {
		this.tblBrands = tblBrands;
	}

	public TblStringType getTblStringType() {
		return this.tblStringType;
	}

	public void setTblStringType(TblStringType tblStringType) {
		this.tblStringType = tblStringType;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public float getExactGauge() {
		return this.exactGauge;
	}

	public void setExactGauge(float exactGauge) {
		this.exactGauge = exactGauge;
	}

	public Set getTblStringingJobsesForTblStringsIdCross() {
		return this.tblStringingJobsesForTblStringsIdCross;
	}

	public void setTblStringingJobsesForTblStringsIdCross(
			Set tblStringingJobsesForTblStringsIdCross) {
		this.tblStringingJobsesForTblStringsIdCross = tblStringingJobsesForTblStringsIdCross;
	}

	public Set getRelStringPrices() {
		return this.relStringPrices;
	}

	public void setRelStringPrices(Set relStringPrices) {
		this.relStringPrices = relStringPrices;
	}

	public Set getTblStringingJobsesForTblStringsIdMain() {
		return this.tblStringingJobsesForTblStringsIdMain;
	}

	public void setTblStringingJobsesForTblStringsIdMain(
			Set tblStringingJobsesForTblStringsIdMain) {
		this.tblStringingJobsesForTblStringsIdMain = tblStringingJobsesForTblStringsIdMain;
	}

}