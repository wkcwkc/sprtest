package com.ctl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.CancellableFormController;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.model.MyModel;

public class mysimpleform extends CancellableFormController {

	public mysimpleform() {

		setCommandClass(MyModel.class);

		setCommandName("mymodel");
	}
	
	@Override
	protected Object formBackingObject(HttpServletRequest request) throws Exception {
		MyModel user = new MyModel();
		user.setName("please input your name");
		return user;
	}
	
	@Override
	protected Map referenceData(HttpServletRequest request) throws Exception {
		Map map = new HashMap();
		map.put("cityList", Arrays.asList("xiamen", "fuzhou", "nanping","shanghai"));
		map.put("province", Arrays.asList("fujian", "jiangxi", "hunan","shenzheng"));
		return map;
	}
	
	@Override
	protected void doSubmitAction(Object command) throws Exception {
//		MyModel user = (MyModel) command;
//		System.out.println(user);
		super.doSubmitAction(command);
	}
	@Override
	protected ModelAndView onCancel(Object command) throws Exception {
		MyModel user = (MyModel) command;
		System.out.println(user);
		return super.onCancel(command);
	}
}
