package com.human.service;

import java.util.List;

import com.human.vo.MemberVO;

public interface MemberService {
	public void memberInsert(MemberVO memberVO) throws Exception;
	public List<MemberVO> memberSelect() throws Exception;
	public MemberVO memberview(String userid) throws Exception;
	public void memberUpdate (MemberVO memberVO) throws Exception;
	public void memberDelete (String userid) throws Exception; 
	
}
