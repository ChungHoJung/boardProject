package kr.or.nextit.login.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.nextit.login.service.LoginService;
import kr.or.nextit.login.service.LoginVo;

@Service("LoginService")
public class LoginServiceImpl implements LoginService {
	
	// mapper 사용
	@Autowired
	private LoginMapper loginMapper; 
	
	@Override
	public LoginVo loginCheck(LoginVo loginVo) throws Exception {

		LoginVo result = loginMapper.selectLogin(loginVo); 
		
		return result;
	}
}
