package it.napalm.stringtools.object;
// Generated 12-dic-2013 10.48.19 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * TblRacquetsPattern generated by hbm2java
 */
public class TblRacquetsPattern implements java.io.Serializable {

	private Integer id;
	private String description;
	private Set tblRacquetses = new HashSet(0);

	public TblRacquetsPattern() {
	}

	public TblRacquetsPattern(String description) {
		this.description = description;
	}

	public TblRacquetsPattern(String description, Set tblRacquetses) {
		this.description = description;
		this.tblRacquetses = tblRacquetses;
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

	public Set getTblRacquetses() {
		return this.tblRacquetses;
	}

	public void setTblRacquetses(Set tblRacquetses) {
		this.tblRacquetses = tblRacquetses;
	}
	
	@Override
    public String toString() {
        return this.description;
    }

}
