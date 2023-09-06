package com.care.get_post;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller //bean 등록해야 사용 가능 --> servlet-context.xml 에서 
@RequestMapping("/my")
public class MyController {
	public MyController() {
		System.out.println("생성자 실행");
	}
	@RequestMapping("index")
	public String index() {
		return "get_post/index";
	}
	@RequestMapping(value = "/result", method = RequestMethod.GET)
	public String result(HttpServletRequest req, Model model) {
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		System.out.println("전송 방식 : "+req.getMethod());
		System.out.println("name : "+name);
		System.out.println("age : "+age);
		
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		model.addAttribute("method", req.getMethod());
		
		return "get_post/result";
	}
	
	@PostMapping("/result")	
	public String reusltPost(@RequestParam String name, @RequestParam("age") int a,
								HttpServletRequest req, Model model) {
							//jsp에서 적은 변수명으로 작성해야됨(변수명 똑같이 사용(왼쪽), 변수명 다르게 사용(오른쪽))
		model.addAttribute("name", name);
		model.addAttribute("age", a);
		model.addAttribute("method", req.getMethod());
		
		return "/get_post/result";
	}
	
	@PostMapping("dto")
	public String dto(MyDTO dto, Model model) {
		//dto 이름과 넘겨준 변수명이 같아야 값이 들어옴
		model.addAttribute("dto", dto);
		
		return "get_post/dto";
	}
}
