package edu.bit.ex.board2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//�� ��° ���
//interface�� �ʿ����
//sqlSession���� �����ϴ� �Լ�(selectList, selectOne...)�� �̿���
//���������� ���� xml�� �ʿ�. �ش� xml�� namespace�� �����ڰ� ����
//���� �� ��� ����.

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
