package edu.bit.ex.board1;

//첫번째 방법
//interface IBDao를 xml namespace에 매핑 <mapper namespace="edu.bit.ex.board1.IBDao">
//sqlSession.getMapper(IBDao.class)를 이용.
//요즘은 잘 사용 안함. 옛날 소스에 남아 있는 경우가 있음.

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BController1 {
	
	@Autowired
	BService1 bservice;
	
	@RequestMapping("/list1")
	public String list1(Model model) throws Exception {
		System.out.println("list1()");
		
		model.addAttribute("list", bservice.selectBoardList()); //list.jsp에서 list를 부르는 키워드(item)으로 그냥 list로 주었기 때문에 list1로 하면 db에 저장된 내 table이 뜨질 않음->ArrayList를 통해서 list를 불러들인다고 해놨기 때문
		
		return "list";
	}
}
