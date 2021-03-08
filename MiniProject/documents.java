package MiniProject;

import org.springframework.stereotype.Component;


public class documents {

	String qualification;
	String aadharnum;
	String pannum;
	String voter_id;
	
	@Override
	public String toString() {
		return "documents [qualification=" + qualification + ", aadharnum=" + aadharnum + ", pannum=" + pannum + "]";
	}
	
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getAadharnum() {
		return aadharnum;
	}
	public void setAadharnum(String aadharnum) {
		this.aadharnum = aadharnum;
	}
	public String getPannum() {
		return pannum;
	}
	public void setPannum(String pannum) {
		this.pannum = pannum;
	}
	public String getVoter_id() {
		return voter_id;
	}

	public void setVoter_id(String voter_id) {
		this.voter_id = voter_id;
	}
	
	
	
	
}
