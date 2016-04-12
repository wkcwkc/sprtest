package com.spr;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import iservice.imyservice;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.contextutil.SpringContextUtil;

import model.ajaxidmodel;
import model.mymodel;

@Controller
public class testhbm {

	@Resource
	private imyservice myservice;
	
	@RequestMapping(value = "/hiberatetest")
	protected ModelAndView handle(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

		ModelAndView mv = new ModelAndView();
		mv.setViewName("hiberatetest");

		return mv;
	}

	@RequestMapping(value = "/querydata")
	public @ResponseBody Map<String, Object> getqueryid(@RequestBody ajaxidmodel reqdata) {

		Map<String, Object> map = new HashMap<String, Object>();
		//imyservice myservice = (imyservice) SpringContextUtil.getBean("myService");
		
		
		
		System.out.println(reqdata.getId());
		int id = Integer.parseInt(reqdata.getId());
		
		System.out.println(id);
		mymodel result = myservice.getmodel(id);
		
		map.put("id", String.valueOf(result.getId()));
		map.put("name", result.getName());
		map.put("color", result.getColor());
		map.put("hoby", result.getHoby());
		map.put("age", String.valueOf(result.getAge()));

		return map;

	}
	
	@RequestMapping(value = "/insertdata")
	public @ResponseBody Map<String, Object> savedata(@RequestBody mymodel reqdata) {

		Map<String, Object> map = new HashMap<String, Object>();
		
		myservice.save(reqdata);
		
		map.put("id", reqdata.getId());
		map.put("name", reqdata.getName());
		map.put("hoby", reqdata.getHoby());
		map.put("color", reqdata.getColor());
		map.put("age", reqdata.getAge());
		return map;

	}

}
