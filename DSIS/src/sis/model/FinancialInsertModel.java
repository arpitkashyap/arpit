package sis.model;

import java.sql.Date;

public class FinancialInsertModel  {
	private String s_id;
	private String TOTAL_FEE;
	private String FEE_PAID;
	private Date PAY_DATE;
	private int SEMESTER;
	
	public String getS_id() {
		return s_id;
	}
	public void setS_id(String s_id) {
		this.s_id = s_id;
	}
	public String getTOTAL_FEE() {
		return TOTAL_FEE;
	}
	public void setTOTAL_FEE(String tOTAL_FEE) {
		TOTAL_FEE = tOTAL_FEE;
	}
	public String getFEE_PAID() {
		return FEE_PAID;
	}
	public void setFEE_PAID(String fEE_PAID) {
		FEE_PAID = fEE_PAID;
	}
	
	public int getSEMESTER() {
		return SEMESTER;
	}
	public void setSEMESTER(int sEMESTER) {
		SEMESTER = sEMESTER;
	}
	public Date getPAY_DATE() {
		//System.out.println("getdate"+PAY_DATE);
		return PAY_DATE;
	}
	public void setPAY_DATE(Date pAY_DATE) {
		PAY_DATE = pAY_DATE;
		//System.out.println("setdate"+PAY_DATE);

	}
	
}