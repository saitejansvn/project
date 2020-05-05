package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="uom_tab")
public class Uom
{
	@Id
	@GeneratedValue(generator="uom1")
	@GenericGenerator(name="uom1",strategy="increment")
	@Column(name="uid")
	private Integer uomid;
	@Column(name="utype")
	private String uomtype;
	@Column(name="ucode")
	private String uomcode;
   @Column(name="enabled")
	private String enabled;
	@Column(name="mcode")
	private String metacode;
@Column(name="asize")
private String adjustsize;
@Column(name="note")
private String note;
public Uom() {
	super();
}
@Override
public String toString() {
	return "Uom [uomid=" + uomid + ", uomtype=" + uomtype + ", uomcode=" + uomcode + ", enabled=" + enabled
			+ ", metacode=" + metacode + ", adjustsize=" + adjustsize + ", note=" + note + "]";
}
public Integer getUomid() {
	return uomid;
}
public void setUomid(Integer uomid) {
	this.uomid = uomid;
}
public String getUomtype() {
	return uomtype;
}
public void setUomtype(String uomtype) {
	this.uomtype = uomtype;
}
public String getUomcode() {
	return uomcode;
}
public void setUomcode(String uomcode) {
	this.uomcode = uomcode;
}
public String getEnabled() {
	return enabled;
}
public void setEnabled(String enabled) {
	this.enabled = enabled;
}
public String getMetacode() {
	return metacode;
}
public void setMetacode(String metacode) {
	this.metacode = metacode;
}
public String getAdjustsize() {
	return adjustsize;
}
public void setAdjustsize(String adjustsize) {
	this.adjustsize = adjustsize;
}
public String getNote() {
	return note;
}
public void setNote(String note) {
	this.note = note;
}
public Uom(Integer uomid) {
	super();
	this.uomid = uomid;
}


}
