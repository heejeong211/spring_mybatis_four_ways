package edu.bit.ex.board1;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

@Service //��ü ����
public class BService1 {
	
	@Inject 
	SqlSession sqlSession; //new�ƴ�. �ּҸ� �������� ��(����). root-context.xml���� new�ؼ� ��ü ����°���. mybatis��.
	
	public List<BoardVO> selectBoardList() throws Exception {
		IBDao dao = sqlSession.getMapper(IBDao.class); //�������̽� ������ ���ϰ� �ִ�. -> mapper�� ����
		return dao.listDao();
	}
}
