package edu.bit.ex.board4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//네번째 방법
//첫번째 방법과 같은 방식임. 대신 sqlSession.getMapper 함수를 사용하지 않음
//간단하고 심플함
//root-context.xml에 아래의 한 줄 추가
//<!-- Mapper Interface -->
//<mybatis-spring:scan base-package="edu.bit.ex.*"/>
//세번째 방법과 혼용해서 사용할 수 있다. xml에 쿼리문 넣기 싫으면 인터페이스에 직접적으로 넣어도 된다.
//요즘은 이것을 많이 사용함.

@Controller
public class BController4 {
	
	@Autowired
	BService4 bservice;
	
	@RequestMapping("/list4")
	public String list4(Model model) throws Exception {
		System.out.println("list4()");
		
		model.addAttribute("list", bservice.selectBoardList()); 
		
		return "list";
	}
}
