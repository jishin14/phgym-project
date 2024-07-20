package com.phgym.board.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.phgym.board.model.BoardDTO;
import com.phgym.board.model.BoardMapper;
import com.phgym.util.mybatis.MybatisUtil;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BoardServiceImpl implements BoardService {
	
	private SqlSessionFactory sqlSessionFactory = MybatisUtil.getSqlSessionFactory();

	//코드 작성
	
	// 작성화면
//	public void regist(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		String title = request.getParameter("title");
//		int admin_no = Integer.parseInt(request.getParameter("admin_no"));
//		String content = request.getParameter("content");
//		
//		BoardDTO dto = new BoardDTO();
//		dto.setTitle(title);
//		dto.setAdmin_no(admin_no);
//		dto.setContent(content);
//		
//		SqlSession sql = sqlSessionFactory.openSession(true);
//		BoardMapper board = sql.getMapper(BoardMapper.class);
//		int result = board.regist(dto);
//		
//		sql.close();
//		
//		response.sendRedirect("main_exe_list.board");
//		
//	}
	
//	// 등록
//	public void regist(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String title = request.getParameter("title");
//		String adminNoStr = request.getParameter("admin_no");
//		String content = request.getParameter("content");
//
//		System.out.println("Received parameters - Title: " + title + ", Admin No: " + adminNoStr + ", Content: " + content);
//
//		if (title == null || adminNoStr == null || content == null) {
//			response.sendRedirect("main_exe_post_form.board");
//			return;
//		}
//		
//		int admin_no = 0;
//		try {
//			admin_no = Integer.parseInt(adminNoStr);
//		} catch (NumberFormatException e) {
//			e.printStackTrace();
//			response.sendRedirect("main_exe_post_form.board");
//			return;
//		}
//
//		BoardDTO dto = new BoardDTO();
//		dto.setTitle(title);
//		dto.setAdmin_no(admin_no);
//		dto.setContent(content);
//
//		try (SqlSession sql = sqlSessionFactory.openSession(true)) {
//			BoardMapper board = sql.getMapper(BoardMapper.class);
//			int result = board.regist(dto);
//			if (result > 0) {
//				System.out.println("완료");
//			} else {
//				System.out.println("실패");
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		response.sendRedirect("main_exe_list.board");
//	}
//	
//	// 목록
//	public void getList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try (SqlSession sql = sqlSessionFactory.openSession()) {
//            BoardMapper board = sql.getMapper(BoardMapper.class);
//            ArrayList<BoardDTO> list = board.getList();
//            request.setAttribute("list", list);
//            request.getRequestDispatcher("main-exerciseinfo-list.jsp").forward(request, response);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
	
	
	//=====================================================================================================================
}
