package com.ctl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.model.MyModel;

public class mycmdctr extends AbstractCommandController {

	@Override
	protected ModelAndView handle(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, BindException arg3)
			throws Exception {
		// TODO Auto-generated method stub

		MyModel mymodel = (MyModel) arg2;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("myCommand");
		mv.addObject("mymodel", mymodel);
		return mv;
		
	}

}
