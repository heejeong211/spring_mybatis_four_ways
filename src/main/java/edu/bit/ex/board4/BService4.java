package edu.bit.ex.board4;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service //��ü ����
public class BService4 {
	
	@Inject 
	BoardMapper4 boardMapper; //mybatis�� ��ü�� �����. �˾Ƽ� bean���� IoC �����̳ʰ� �ƴ϶�.
	
	public List<BoardVO> selectBoardList() throws Exception {
		
		return boardMapper.selectBoardList();
	}
}
