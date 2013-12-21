package it.napalm.stringtools.object;
// Generated 12-dic-2013 10.48.19 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;

/**
 * TblStringingJobs generated by hbm2java
 */
public class TblStringingJobs implements java.io.Serializable {

	private Integer id;
	private TblStringingJobType tblStringingJobType;
	private TblRacquetsUser tblRacquetsUser;
	private TblStrings tblStringsByTblStringsIdMain;
	private TblStrings tblStringsByTblStringsIdCross;
	private TblStringingMachines tblStringingMachines;
	private int tblUsersIdStringer;
	private Date dateStringing;
	private BigDecimal weightMain;
	private BigDecimal wieghtCross;
	private int oldJobId;
	private BigDecimal dynamicTension;
	private int stencyl;
	private int grommetsGuard;
	private int tblGripId;
	private int tblOvergripId;
	private String note;
	private BigDecimal totalPrice;
	private int paid;
	private BigDecimal prestretchMain;
	private BigDecimal prestretchCross;

	public TblStringingJobs() {
	}

	public TblStringingJobs(TblStringingJobType tblStringingJobType,
			TblRacquetsUser tblRacquetsUser,
			TblStrings tblStringsByTblStringsIdMain,
			TblStrings tblStringsByTblStringsIdCross,
			TblStringingMachines tblStringingMachines, int tblUsersIdStringer,
			Date dateStringing, BigDecimal weightMain, BigDecimal wieghtCross,
			int oldJobId, BigDecimal dynamicTension, int stencyl,
			int grommetsGuard, int tblGripId, int tblOvergripId, int paid) {
		this.tblStringingJobType = tblStringingJobType;
		this.tblRacquetsUser = tblRacquetsUser;
		this.tblStringsByTblStringsIdMain = tblStringsByTblStringsIdMain;
		this.tblStringsByTblStringsIdCross = tblStringsByTblStringsIdCross;
		this.tblStringingMachines = tblStringingMachines;
		this.tblUsersIdStringer = tblUsersIdStringer;
		this.dateStringing = dateStringing;
		this.weightMain = weightMain;
		this.wieghtCross = wieghtCross;
		this.oldJobId = oldJobId;
		this.dynamicTension = dynamicTension;
		this.stencyl = stencyl;
		this.grommetsGuard = grommetsGuard;
		this.tblGripId = tblGripId;
		this.tblOvergripId = tblOvergripId;
		this.paid = paid;
	}

	public TblStringingJobs(TblStringingJobType tblStringingJobType,
			TblRacquetsUser tblRacquetsUser,
			TblStrings tblStringsByTblStringsIdMain,
			TblStrings tblStringsByTblStringsIdCross,
			TblStringingMachines tblStringingMachines, int tblUsersIdStringer,
			Date dateStringing, BigDecimal weightMain, BigDecimal wieghtCross,
			int oldJobId, BigDecimal dynamicTension, int stencyl,
			int grommetsGuard, int tblGripId, int tblOvergripId, String note,
			BigDecimal totalPrice, int paid, BigDecimal prestretchMain,
			BigDecimal prestretchCross) {
		this.tblStringingJobType = tblStringingJobType;
		this.tblRacquetsUser = tblRacquetsUser;
		this.tblStringsByTblStringsIdMain = tblStringsByTblStringsIdMain;
		this.tblStringsByTblStringsIdCross = tblStringsByTblStringsIdCross;
		this.tblStringingMachines = tblStringingMachines;
		this.tblUsersIdStringer = tblUsersIdStringer;
		this.dateStringing = dateStringing;
		this.weightMain = weightMain;
		this.wieghtCross = wieghtCross;
		this.oldJobId = oldJobId;
		this.dynamicTension = dynamicTension;
		this.stencyl = stencyl;
		this.grommetsGuard = grommetsGuard;
		this.tblGripId = tblGripId;
		this.tblOvergripId = tblOvergripId;
		this.note = note;
		this.totalPrice = totalPrice;
		this.paid = paid;
		this.prestretchMain = prestretchMain;
		this.prestretchCross = prestretchCross;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TblStringingJobType getTblStringingJobType() {
		return this.tblStringingJobType;
	}

	public void setTblStringingJobType(TblStringingJobType tblStringingJobType) {
		this.tblStringingJobType = tblStringingJobType;
	}

	public TblRacquetsUser getTblRacquetsUser() {
		return this.tblRacquetsUser;
	}

	public void setTblRacquetsUser(TblRacquetsUser tblRacquetsUser) {
		this.tblRacquetsUser = tblRacquetsUser;
	}

	public TblStrings getTblStringsByTblStringsIdMain() {
		return this.tblStringsByTblStringsIdMain;
	}

	public void setTblStringsByTblStringsIdMain(
			TblStrings tblStringsByTblStringsIdMain) {
		this.tblStringsByTblStringsIdMain = tblStringsByTblStringsIdMain;
	}

	public TblStrings getTblStringsByTblStringsIdCross() {
		return this.tblStringsByTblStringsIdCross;
	}

	public void setTblStringsByTblStringsIdCross(
			TblStrings tblStringsByTblStringsIdCross) {
		this.tblStringsByTblStringsIdCross = tblStringsByTblStringsIdCross;
	}

	public TblStringingMachines getTblStringingMachines() {
		return this.tblStringingMachines;
	}

	public void setTblStringingMachines(
			TblStringingMachines tblStringingMachines) {
		this.tblStringingMachines = tblStringingMachines;
	}

	public int getTblUsersIdStringer() {
		return this.tblUsersIdStringer;
	}

	public void setTblUsersIdStringer(int tblUsersIdStringer) {
		this.tblUsersIdStringer = tblUsersIdStringer;
	}

	public Date getDateStringing() {
		return this.dateStringing;
	}

	public void setDateStringing(Date dateStringing) {
		this.dateStringing = dateStringing;
	}

	public BigDecimal getWeightMain() {
		return this.weightMain;
	}

	public void setWeightMain(BigDecimal weightMain) {
		this.weightMain = weightMain;
	}

	public BigDecimal getWieghtCross() {
		return this.wieghtCross;
	}

	public void setWieghtCross(BigDecimal wieghtCross) {
		this.wieghtCross = wieghtCross;
	}

	public int getOldJobId() {
		return this.oldJobId;
	}

	public void setOldJobId(int oldJobId) {
		this.oldJobId = oldJobId;
	}

	public BigDecimal getDynamicTension() {
		return this.dynamicTension;
	}

	public void setDynamicTension(BigDecimal dynamicTension) {
		this.dynamicTension = dynamicTension;
	}

	public int getStencyl() {
		return this.stencyl;
	}

	public void setStencyl(int stencyl) {
		this.stencyl = stencyl;
	}

	public int getGrommetsGuard() {
		return this.grommetsGuard;
	}

	public void setGrommetsGuard(int grommetsGuard) {
		this.grommetsGuard = grommetsGuard;
	}

	public int getTblGripId() {
		return this.tblGripId;
	}

	public void setTblGripId(int tblGripId) {
		this.tblGripId = tblGripId;
	}

	public int getTblOvergripId() {
		return this.tblOvergripId;
	}

	public void setTblOvergripId(int tblOvergripId) {
		this.tblOvergripId = tblOvergripId;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public BigDecimal getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getPaid() {
		return this.paid;
	}

	public void setPaid(int paid) {
		this.paid = paid;
	}

	public BigDecimal getPrestretchMain() {
		return this.prestretchMain;
	}

	public void setPrestretchMain(BigDecimal prestretchMain) {
		this.prestretchMain = prestretchMain;
	}

	public BigDecimal getPrestretchCross() {
		return this.prestretchCross;
	}

	public void setPrestretchCross(BigDecimal prestretchCross) {
		this.prestretchCross = prestretchCross;
	}

}
