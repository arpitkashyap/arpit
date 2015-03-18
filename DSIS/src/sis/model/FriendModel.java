package sis.model;

public class FriendModel {
	public String selectfrnd;
	public String friend_name;
	public String frndtry_name;
	public String frnd_Address;
	public String destpath;
	public String srch_frnd;
	public boolean check=false;
	public String delFrnd;

	public String getDelFrnd() {
		return delFrnd;
	}

	public void setDelFrnd(String delFrnd) {
		this.delFrnd = delFrnd;
		System.out.println("model frnd"+delFrnd);
	}

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	public String getSrch_frnd() {
		return srch_frnd;
	}

	public void setSrch_frnd(String srch_frnd) {
		this.srch_frnd = srch_frnd;
	}

	public String getFrnd_Address() {
		return frnd_Address;
	}

	public void setFrnd_Address(String frnd_Address) {
		this.frnd_Address = frnd_Address;
	}

	public String getDestpath() {
		return destpath;
	}

	public void setDestpath(String destpath) {
		this.destpath = destpath;
	}

	public String getFrnd_phone() {
		return frnd_phone;
	}

	public void setFrnd_phone(String frnd_phone) {
		this.frnd_phone = frnd_phone;
	}

	
	public String frnd_phone;
	public String getFrndtry_name() {
		return frndtry_name;
	}

	public void setFrndtry_name(String frndtry_name) {
		this.frndtry_name = frndtry_name;
	}

	public String friend_id;
 public String getSelectfrnd() {
		return selectfrnd;
	}

	public void setSelectfrnd(String selectfrnd) {
		this.selectfrnd = selectfrnd;
	}


	public String getFriend_name() {
		return friend_name;
	}

	public void setFriend_name(String friend_name) {
		this.friend_name = friend_name;
	}

public String getFriend_id() {
	return friend_id;
}

public void setFriend_id(String friend_id) {
	this.friend_id = friend_id;
}



}