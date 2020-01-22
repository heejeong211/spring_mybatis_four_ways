package edu.bit.ex.board4;

import java.util.List;

import org.apache.ibatis.annotations.Select;

public interface BoardMapper4 { //이 인터페이스 구현을 자손이 안해줌.. 누가 해줬을까? mybatis가 구현
	
	public List<BoardVO> selectBoardList(); //다형성 적용 되도록 List로 바꿈
	
	//세번째 방법
	@Select("select bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent from mvc_board order by bGroup desc, bStep asc")	
	public List<BoardVO> selectBoardList1();
	
	
	//test. 에러가 날 것 같은데 안나는 이유. 컬럼명이 변수명이랑 같아야 한다. 그래서 자기가 알아서 getter, setter 함수 호출
	@Select("select bId, bName from mvc_board order by bGroup desc, bStep asc")	
	public List<BoardVO> selectBoardList2();
}
