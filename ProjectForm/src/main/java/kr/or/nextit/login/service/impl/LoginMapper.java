package kr.or.nextit.login.service.impl;

import org.apache.ibatis.annotations.Mapper;

import kr.or.nextit.login.service.LoginVo;

@Mapper
public interface LoginMapper {
	
	public LoginVo selectLogin(LoginVo loginvo) throws Exception;
}
