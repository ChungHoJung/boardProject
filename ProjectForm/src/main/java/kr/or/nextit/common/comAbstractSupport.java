package kr.or.nextit.common;

import java.util.Properties;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;

public abstract class comAbstractSupport {
	public final Logger log = LoggerFactory.getLogger(this.getClass());

	// messageSource-context 확인 //
	// messageSource-context bean id값을 받아와서 
	// db.properties와 message-properties 파일의 값과 메시지를 가져오기
	// @@@@@사용필수
	@Resource(name="propertyService")
	public Properties propertyService;
	
	// messageSource-context 확인 //
	@Resource(name="messageSource")
	public MessageSource messageSource;
}
