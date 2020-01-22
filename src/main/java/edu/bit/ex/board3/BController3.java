package edu.bit.ex.board3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//����° ���
//�������̽� ���� ������̼�(@)�� ���̴� ������
//xml�� �ʿ����. sqlSession��ü �ʿ����(root-context.xml�� �Ʒ��� �� �� �߰� �߱� ������)
//root-context.xml�� �Ʒ��� �� �� �߰�
//<!-- Mapper Interface -->
//<mybatis-spring:scan base-package="edu.bit.ex.*"/>
//������ ������� ����ϱ� ����. �׷��� �� ������.

@Controller
public class BController3 {
	
	@Autowired
	BService3 bservice;
	
	@RequestMapping("/list3")
	public String list3(Model model) throws Exception {
		System.out.println("list3()");
		
		model.addAttribute("list", bservice.selectBoardList()); 
		
		return "list";
	}
}
