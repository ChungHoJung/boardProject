package kr.or.nextit.login.service;

import kr.or.nextit.login.service.LoginVo;

public interface LoginService{
	
	public LoginVo loginCheck(LoginVo loginVo) throws Exception;
}
