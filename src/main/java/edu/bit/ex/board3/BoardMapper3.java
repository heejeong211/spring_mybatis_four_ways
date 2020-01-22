package edu.bit.ex.board3;

import java.util.List;

import org.apache.ibatis.annotations.Select;

public interface BoardMapper3 { //이 인터페이스 구현을 자손이 안해줌.. 누가 해줬을까? mybatis가 구현
	
	//xml 필요없음.
	@Select("select bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent from mvc_board order by bGroup desc, bStep asc")	
	public List<BoardVO> selectBoardList(); //다형성 적용 되도록 List로 바꿈
}
