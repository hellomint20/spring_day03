package com.care.root.memberController;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.care.root.memberDTO.memberDTO;
import com.care.root.memberService.memberService;

@Controller
@RequestMapping("/member")
public class memberController {
	@Autowired
	private memberService ser;
	
	public memberController() {
		System.out.println("member controller ½ÇÇà");
	}
	@GetMapping("login")
	public String login() {
		return "member/login";
	}
	@GetMapping("register")
	public String register() {
		return "member/register";
	}
	@PostMapping("register")
	public String register(memberDTO dto) {
		System.out.println("dto"+dto.getId());
		ser.register(dto);
		return "member/login";
	}
	@PostMapping("login_chk")
	public String loginChk(@RequestParam String id, @RequestParam String pwd,
							HttpSession session) {
		int result = ser.loginChk(id, pwd);
		
		if(result == 1) {
			session.setAttribute("id", id);
			return "redirect:main";
		}
		return "redirect:login";
	}
	@GetMapping("list")
	public String list(Model model) {
		System.out.println("membercontroller list");
		ArrayList<memberDTO> dto = ser.list();
		model.addAttribute("list", dto);
		return "member/list";
	}@GetMapping("getInfo")
	public String getInfo(@RequestParam String id, Model model) {
		System.out.println("id"+id);
		memberDTO dto = ser.getInfo(id);
		model.addAttribute("dto", dto);
		return "member/getInfo";
	}
}
