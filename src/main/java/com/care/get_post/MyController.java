package com.care.get_post;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller //bean ����ؾ� ��� ���� --> servlet-context.xml ���� 
@RequestMapping("/my")
public class MyController {
	public MyController() {
		System.out.println("������ ����");
	}
	@RequestMapping("index")
	public String index() {
		return "get_post/index";
	}
	@RequestMapping(value = "/result", method = RequestMethod.GET)
	public String result(HttpServletRequest req, Model model) {
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		System.out.println("���� ��� : "+req.getMethod());
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
							//jsp���� ���� ���������� �ۼ��ؾߵ�(������ �Ȱ��� ���(����), ������ �ٸ��� ���(������))
		model.addAttribute("name", name);
		model.addAttribute("age", a);
		model.addAttribute("method", req.getMethod());
		
		return "/get_post/result";
	}
	
	@PostMapping("dto")
	public String dto(MyDTO dto, Model model) {
		//dto �̸��� �Ѱ��� �������� ���ƾ� ���� ����
		model.addAttribute("dto", dto);
		
		return "get_post/dto";
	}
}
