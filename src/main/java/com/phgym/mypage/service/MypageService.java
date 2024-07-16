package com.phgym.mypage.service;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface MypageService {

	public void doCheckin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

	public void checkCheckin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
	
	public void doTransfer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
	
	public void checkTransfer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
