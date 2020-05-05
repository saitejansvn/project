package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="user_tab")
public class User 
{
@Id
@GeneratedValue( generator = "usergen")
@GenericGenerator(name = "usergen",strategy = "increment")
@Column(name="uid")
private Integer userid;
@Column(name="utype")
private String usertype;
@Column(name="ucode")
private String usercode;
@Column(name="ufor")
private String userfor;
@Column(name="uemail")
private String useremail;
@Column(name="ucontanct")
private String usercontanct;
@Column(name="uidtype")
private String useridtype;
@Column( name = "uid")
private int idnumber;
public User() {
	super();
}
public User(Integer userid) {
	super();
	this.userid = userid;
}
public Integer getUserid() {
	return userid;
}
public void setUserid(Integer userid) {
	this.userid = userid;
}
public String getUsertype() {
	return usertype;
}
public void setUsertype(String usertype) {
	this.usertype = usertype;
}
public String getUsercode() {
	return usercode;
}
public void setUsercode(String usercode) {
	this.usercode = usercode;
}
public String getUserfor() {
	return userfor;
}
public void setUserfor(String userfor) {
	this.userfor = userfor;
}
public String getUseremail() {
	return useremail;
}
public void setUseremail(String useremail) {
	this.useremail = useremail;
}
public String getUsercontanct() {
	return usercontanct;
}
public void setUsercontanct(String usercontanct) {
	this.usercontanct = usercontanct;
}
public String getUseridtype() {
	return useridtype;
}
public void setUseridtype(String useridtype) {
	this.useridtype = useridtype;
}
public int getIdnumber() {
	return idnumber;
}
public void setIdnumber(int idnumber) {
	this.idnumber = idnumber;
}
@Override
public String toString() {
	return "User [userid=" + userid + ", usertype=" + usertype + ", usercode=" + usercode + ", userfor=" + userfor
			+ ", useremail=" + useremail + ", usercontanct=" + usercontanct + ", useridtype=" + useridtype
			+ ", idnumber=" + idnumber + "]";
}

}
