package com.board.dao;

import java.util.List;

import com.board.domain.BoardVO;

public interface BoardDAO {
 
	// 게시판 목록
	public List<BoardVO> list() throws Exception; 

	// 게시판 작성
	public void write(BoardVO vo) throws Exception;

	// 게시판 조회
	public BoardVO view(int bno) throws Exception;
	
}
