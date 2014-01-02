package it.napalm.stringtools.object;
// Generated 12-dic-2013 10.48.19 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * TblStringingMachineType generated by hbm2java
 */
public class TblStringingMachineType implements java.io.Serializable {

	private Integer id;
	private String description;
	private Set tblStringingMachineses = new HashSet(0);

	public TblStringingMachineType() {
	}

	public TblStringingMachineType(String description) {
		this.description = description;
	}

	public TblStringingMachineType(String description,
			Set tblStringingMachineses) {
		this.description = description;
		this.tblStringingMachineses = tblStringingMachineses;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString(){
		return this.description;
	}

	public Set getTblStringingMachineses() {
		return this.tblStringingMachineses;
	}

	public void setTblStringingMachineses(Set tblStringingMachineses) {
		this.tblStringingMachineses = tblStringingMachineses;
	}

}
