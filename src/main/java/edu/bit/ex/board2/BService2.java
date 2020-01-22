package edu.bit.ex.board2;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

@Service //��ü ����
public class BService2 {
	
	@Inject 
	SqlSession sqlSession; //new�ƴ�. �ּҸ� �������� ��(����). root-context.xml���� new�ؼ� ��ü ����°���. mybatis��.
	
	public List<BoardVO> selectBoardList() throws Exception {
		
		return sqlSession.selectList("board.selectBoardList"); //sqlSession���� �����ϴ� �Լ� ���
	}
}
