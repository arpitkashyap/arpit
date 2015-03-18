package sis.model;

import java.util.Map;

public class UserModel {
	private String destpath;
public String getDestpath() {
		return destpath;
	}
	public void setDestpath(String destpath) {
		this.destpath = destpath;
	}
private String userid;
private String pwd;
private String Role;
public Map<String,Object> session;

public String getRole() {
	return Role;
}
public void setRole(String role) {
	Role = role;
}
public String getUserid() {
	return userid;
}
public void setUserid(String userid) {
	this.userid = userid;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public Map<String,Object> getSession() {
	return session;
}
public void setSession(Map<String,Object> session) {
	this.session = session;
}

}
