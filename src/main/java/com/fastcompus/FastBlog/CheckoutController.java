package com.fastcompus.FastBlog;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fastcompus.FastBlog.vo.UserVO;

@Controller
public class CheckoutController {
	@RequestMapping(value = "/checkout", method = RequestMethod.GET)
	public String register(Locale locale, Model model) {
		UserVO userVO = new UserVO();
		userVO.setEmail("test@test.com");
		
		return "checkout";
	}

}
