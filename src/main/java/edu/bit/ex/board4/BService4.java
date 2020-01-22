package edu.bit.ex.board4;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service //객체 생성
public class BService4 {
	
	@Inject 
	BoardMapper4 boardMapper; //mybatis가 객체를 만든것. 알아서 bean생성 IoC 컨테이너가 아니라.
	
	public List<BoardVO> selectBoardList() throws Exception {
		
		return boardMapper.selectBoardList();
	}
}
