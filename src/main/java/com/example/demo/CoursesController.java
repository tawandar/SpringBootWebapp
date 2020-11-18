package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoursesController {
	
	
	//simple homepage example
	@RequestMapping("/home")
	public String courses() {
		
		System.out.println("Hello to your courses");
		return "course";
		//ModelAndView model=new ModelAndView();
		//model.setViewName("course");
		//return model;
	}
	
	//simple fetchdate example "/fetchReqData?courseName=SCS"
	@RequestMapping("/fetchReqData")
	public String reqData(HttpServletRequest req) {
		
		HttpSession session =req.getSession();
		System.out.println("Hello to your courses is: "+req.getParameter("courseName"));
		session.setAttribute("cname", req.getParameter("courseName"));
		return "courseName";
	}
	
	//simple ModelAndView Example
	@RequestMapping("/mvcExample")
	public ModelAndView myModel() {
		
		
		ModelAndView model=new ModelAndView();
		model.setViewName("course");
		return model;
	}

}
