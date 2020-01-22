package edu.bit.ex.board2;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

@Service //객체 생성
public class BService2 {
	
	@Inject 
	SqlSession sqlSession; //new아님. 주소만 가져오는 것(주입). root-context.xml에서 new해서 객체 만드는거임. mybatis임.
	
	public List<BoardVO> selectBoardList() throws Exception {
		
		return sqlSession.selectList("board.selectBoardList"); //sqlSession에서 제공하는 함수 사용
	}
}
