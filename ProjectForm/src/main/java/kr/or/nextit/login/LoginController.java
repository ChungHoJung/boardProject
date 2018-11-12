package kr.or.nextit.login;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.nextit.common.comAbstractSupport;
import kr.or.nextit.login.service.LoginService;
import kr.or.nextit.login.service.LoginVo;




@Controller
public class LoginController extends comAbstractSupport {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="/actionLoginForm.do")
	public String actionLoginForm(Model model
			 					,@ModelAttribute("loginVo") LoginVo loginVo) {
		
		return "login/loginForm";
	}
	
	@RequestMapping(value="/actionLoginProc.do")
	public String actionLoginProc(Model model
			  ,@ModelAttribute("loginVo") LoginVo loginVo
			  ,HttpSession session) throws Exception {
		
		log.debug("loginVo : {}", loginVo);
		
		LoginVo loginInfo = loginService.loginCheck(loginVo);
		
		log.debug("loginInfo : {}", loginInfo);
		
		if(loginInfo != null) {
			if(loginInfo.getMemId().equals(loginVo.getMemId()) &&
					loginInfo.getMemPw().equals(loginVo.getMemPw())) {
				session.setAttribute("loginInfo", loginInfo);
			}
			
			return "redirect:/";
			
		}else {
			session.removeAttribute("loginInfo");
			return "login/loginForm";
		}
	}
	
		// 로그아웃 하는 부분
		@RequestMapping(value="/actionLoginLogOut.do")
		public String actionLoginLogout(
						HttpSession session
						)  throws Exception {
			// 1번째 방법
			session.setAttribute("loginInfo", null);
//			// 2번째 방법
//			session.removeAttribute("loginInfo");
//			// 3번째 방법
//			session.invalidate();
			
			return "redirect:/";
		}
}
