package edu.bit.ex.board2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//두 번째 방법
//interface가 필요없음
//sqlSession에서 제공하는 함수(selectList, selectOne...)를 이용함
//쿼리구현을 위한 xml이 필요. 해당 xml의 namespace는 개발자가 정함
//요즘에 잘 사용 안함.

@Controller
public class BController2 {
	
	@Autowired
	BService2 bservice;
	
	@RequestMapping("/list2")
	public String list2(Model model) throws Exception {
		System.out.println("list2()");
		
		model.addAttribute("list", bservice.selectBoardList());
		
		return "list";
	}
}
