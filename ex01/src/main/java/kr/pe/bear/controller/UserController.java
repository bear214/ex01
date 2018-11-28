package kr.pe.bear.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
/*@RequestMapping("user")*/
public class UserController {
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/user/openSignUp.do")
	public ModelAndView openSignUp(CommandMap commandMap) throws Exception {
		modelAndView mav = new ModelAndView("/user/signUP")
		return mav;
	}
	

}
