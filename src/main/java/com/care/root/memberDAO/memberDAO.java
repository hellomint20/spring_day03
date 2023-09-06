package com.care.root.memberDAO;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.care.root.memberDTO.memberDTO;

@Repository
public class memberDAO {
	ArrayList<memberDTO> DB;
	public memberDAO() {
		DB = new ArrayList<memberDTO>();
	}
	
	public void register(memberDTO dto) {
		memberDTO d = new memberDTO();
		
		d.setId(dto.getId());
		d.setPwd(dto.getPwd());
		d.setName(dto.getName());
		
		DB.add(d);
		System.out.println("dao"+DB.size());
	}
	public int loginChk(String id, String pwd) {
		int result = 0;
		
		for(int i=0; i<DB.size(); i++) {
			if(id.equals(DB.get(i).getId()) && pwd.equals(DB.get(i).getPwd())) {
				result = 1;
			}
		}
		return result;
	}
	public ArrayList<memberDTO> list() {
		System.out.println("member dao");
		ArrayList<memberDTO> d = new ArrayList<memberDTO>();
		
		for(int i=0; i<DB.size(); i++) {
			memberDTO dto = new memberDTO();
			dto.setId(DB.get(i).getId());
			dto.setPwd(DB.get(i).getPwd());
			dto.setName(DB.get(i).getName());
			d.add(dto);
		}
		System.out.println("dao"+d.get(0).getId());
		return d;
	}
	public memberDTO getInfo(String id) {
		memberDTO dto = new memberDTO();
		
		for(int i=0; i<DB.size(); i++) {
			if(id.equals(DB.get(i).getId())) {
				dto.setId(DB.get(i).getId());
				dto.setPwd(DB.get(i).getPwd());
				dto.setName(DB.get(i).getName());
			}
		}
		return dto;
	}
}
