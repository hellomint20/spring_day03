package com.care.root.memberService;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.care.root.memberDAO.memberDAO;
import com.care.root.memberDTO.memberDTO;

@Service
public class memberService {
	@Autowired
	private memberDAO dao;
	
	public memberService() {
		System.out.println("member service ½ÇÇà");
	}
	
	public void register(memberDTO dto) {
		dao.register(dto);
	}
	
	public int loginChk(String id, String pwd) {
		int result = dao.loginChk(id, pwd);
		System.out.println("ser loginChk : "+result);
		return result;
	}
	public ArrayList<memberDTO> list() {
		ArrayList<memberDTO> dto = dao.list();
		
		return dto;
	}
	public memberDTO getInfo(String id) {
		memberDTO dto = dao.getInfo(id);
		return dto;
	}
}
