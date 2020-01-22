package edu.bit.ex.board1;

//ù��° ���
//interface IBDao�� xml namespace�� ���� <mapper namespace="edu.bit.ex.board1.IBDao">
//sqlSession.getMapper(IBDao.class)�� �̿�.
//������ �� ��� ����. ���� �ҽ��� ���� �ִ� ��찡 ����.

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
		
		model.addAttribute("list", bservice.selectBoardList()); //list.jsp���� list�� �θ��� Ű����(item)���� �׳� list�� �־��� ������ list1�� �ϸ� db�� ����� �� table�� ���� ����->ArrayList�� ���ؼ� list�� �ҷ����δٰ� �س��� ����
		
		return "list";
	}
}
