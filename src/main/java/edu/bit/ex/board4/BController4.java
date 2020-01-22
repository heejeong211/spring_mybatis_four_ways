package edu.bit.ex.board4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//�׹�° ���
//ù��° ����� ���� �����. ��� sqlSession.getMapper �Լ��� ������� ����
//�����ϰ� ������
//root-context.xml�� �Ʒ��� �� �� �߰�
//<!-- Mapper Interface -->
//<mybatis-spring:scan base-package="edu.bit.ex.*"/>
//����° ����� ȥ���ؼ� ����� �� �ִ�. xml�� ������ �ֱ� ������ �������̽��� ���������� �־ �ȴ�.
//������ �̰��� ���� �����.

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
