package com.spr;

import java.io.File;
import java.io.IOException;

import iservice.imyservice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.mymodel;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.contextutil.SpringContextUtil;

@Controller
@RequestMapping(value = "/hello")
public class HelloWorldController extends AbstractController {
	@Override
	@RequestMapping(value = { "", "/", "/login" })
	public ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		// 1���ռ���������֤����
		// 2���󶨲������������
		// 3�������������ҵ��������ҵ����
		// 4��ѡ����һ��ҳ��

		ModelAndView mv = new ModelAndView();
		// ���ģ������ �����������POJO����
		mv.addObject("mes", "Hello World!");
		// �����߼���ͼ������ͼ����������ݸ����ֽ������������ͼҳ��
		mv.setViewName("hello");
		// resp.getWriter().write("<a href='http://localhost:8080/sprtest/hello'>this</a>");

		return mv;
	}

	@RequestMapping(value = "/file")
	public String save(MultipartHttpServletRequest request,
			HttpServletResponse rsp, Model model) throws Exception {
		MultipartFile multipartFile = (MultipartFile) request.getFile("myfile");

		if (!multipartFile.isEmpty()) {
			
			File desfile=new File("E:\\"+multipartFile.getOriginalFilename());
			desfile.setWritable(true, false);
			FileUtils.writeByteArrayToFile(desfile, multipartFile.getBytes());
			model.addAttribute("mes", multipartFile.getOriginalFilename());
		} else {
			model.addAttribute("mes", "fail");
		}
		return "hello";

	}

}