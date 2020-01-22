package edu.bit.ex.board1;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

@Service //객체 생성
public class BService1 {
	
	@Inject 
	SqlSession sqlSession; //new아님. 주소만 가져오는 것(주입). root-context.xml에서 new해서 객체 만드는거임. mybatis임.
	
	public List<BoardVO> selectBoardList() throws Exception {
		IBDao dao = sqlSession.getMapper(IBDao.class); //인터페이스 구현을 안하고 있다. -> mapper가 구현
		return dao.listDao();
	}
}
