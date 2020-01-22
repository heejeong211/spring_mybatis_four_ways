package edu.bit.ex.board4;

import java.util.List;

import org.apache.ibatis.annotations.Select;

public interface BoardMapper4 { //�� �������̽� ������ �ڼ��� ������.. ���� ��������? mybatis�� ����
	
	public List<BoardVO> selectBoardList(); //������ ���� �ǵ��� List�� �ٲ�
	
	//����° ���
	@Select("select bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent from mvc_board order by bGroup desc, bStep asc")	
	public List<BoardVO> selectBoardList1();
	
	
	//test. ������ �� �� ������ �ȳ��� ����. �÷����� �������̶� ���ƾ� �Ѵ�. �׷��� �ڱⰡ �˾Ƽ� getter, setter �Լ� ȣ��
	@Select("select bId, bName from mvc_board order by bGroup desc, bStep asc")	
	public List<BoardVO> selectBoardList2();
}
