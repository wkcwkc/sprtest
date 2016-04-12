package com.ctl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.model.*;

public class multicontrl extends MultiActionController {
		
	public String create(HttpServletRequest request, HttpServletResponse response, testmodel user) {
		System.out.println(user.getStr1());
		System.out.println(user.getDd1());

		return "success";
	}
	
	public String paraname1(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("paraname1");

		return "success";
	}
	
	public String paravalue(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("paravalue");

		return "success";
	}
	
}
