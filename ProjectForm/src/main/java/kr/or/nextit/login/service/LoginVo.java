package kr.or.nextit.login.service;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class LoginVo {
    private String memId;
    private String memPw;
    private String memName;
    private String memEmail;
    private String memPhone;
    private String regDate;
    
    public String toString() {
    	
    	return ToStringBuilder.reflectionToString(this);
    }

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getMemPw() {
		return memPw;
	}

	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public String getMemEmail() {
		return memEmail;
	}

	public void setMemEmail(String memEmail) {
		this.memEmail = memEmail;
	}

	public String getMemPhone() {
		return memPhone;
	}

	public void setMemPhone(String memPhone) {
		this.memPhone = memPhone;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
    
}
