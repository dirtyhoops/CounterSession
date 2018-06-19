package com.codingdojo.countersession;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	Integer count = 0;
	
	@RequestMapping("/")
	public String index(HttpSession session) {
		count++;
		
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter(HttpSession session) {
		session.setAttribute("count", count);
		return "counter.jsp";
	}
}
