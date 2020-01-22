package edu.bit.ex.board3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//세번째 방법
//인터페이스 위에 어노테이션(@)을 붙이는 형식임
//xml이 필요없음. sqlSession개체 필요없음(root-context.xml에 아래의 한 줄 추가 했기 때문에)
//root-context.xml에 아래의 한 줄 추가
//<!-- Mapper Interface -->
//<mybatis-spring:scan base-package="edu.bit.ex.*"/>
//쿼리가 길어지면 사용하기 힘듦. 그래서 잘 사용안함.

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
