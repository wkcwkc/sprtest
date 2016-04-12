package com.ctl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

import com.model.MyModel;

public class InfoFillWizardFormController extends AbstractWizardFormController {
	
	public InfoFillWizardFormController() {
		setCommandClass(MyModel.class);
		setCommandName("mymodel");
	}
	
	@Override
	protected Map referenceData(HttpServletRequest request, int page) throws Exception {
		Map map = new HashMap();
		if(page==1) {
			map.put("schoolTypeList", Arrays.asList("gaozhong", "daxue", "boshi"));
		}
		if(page==2) {
			map.put("cityList", Arrays.asList("beijing", "xiamen", "nanping"));
		}
		return map;
    }
	
	protected void validatePage(Object command, Errors errors, int page) {
		
	}
	
	@Override
	protected void postProcessPage(HttpServletRequest request, Object command, Errors errors, int page) throws Exception {
		
	}
	
	@Override
	protected ModelAndView processFinish(HttpServletRequest req, HttpServletResponse resp, Object command, BindException errors) throws Exception {
		
		System.out.println(command);
		ModelAndView mv=new ModelAndView("success");
		mv.addObject("data", command);
		return mv;
	}
	
	@Override
	protected ModelAndView processCancel(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception {
		
		System.out.println(command);
		return new ModelAndView("redirect:/cancel");
	}

}
