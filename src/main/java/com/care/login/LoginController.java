package com.care.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("red")
public class LoginController {
	public LoginController() {
		System.out.println("login class");
	}
	@GetMapping("index")
	public String index() {
		return "test/index";
	}
	@PostMapping("login_chk")
	public String loginChk(@RequestParam String id, @RequestParam String pwd,
							RedirectAttributes ra) {
		System.out.println("id : "+id);
		System.out.println("pwd : "+pwd);
		
		String DBId = "1", DBPwd = "1";
		if(id.equals(DBId) && pwd.equals(DBPwd)) {
			//return "redirect:main"; //상대경로
			//return "redirect:main01?id="+id; //? 이용하여 값 전달
			//ra.addAttribute("id", id);
			//return "redirect:main02";
			
			TestDTO dto = new TestDTO();
			dto.setId("aaa");
			dto.setPwd("1");
			dto.setName("에이");
			
			ra.addFlashAttribute(dto); //객체 자체를 넘겨줌
			return "redirect:main03";
		}
		return "redirect:/red/index"; //절대경로
	}
	@GetMapping("main03")
	public String main03(TestDTO d) { //해당하는 자료형으로 받아줌
		System.out.println("main03 id : "+d.getId());
		System.out.println("main03 pwd : "+d.getPwd());
		System.out.println("main03 name : "+d.getName());
		return null;
	}
	@GetMapping("main02")
	public String main02(@RequestParam String id) {
		System.out.println("main02 id : "+id);
		return null;
	}
	@GetMapping("main01")
	public String main01(@RequestParam String id) {
		System.out.println("main01 id : "+id);
		return null;
	}
	@GetMapping("main")
	public String main() {
		System.out.println("로그인 성공");
		return null;
	}
}
