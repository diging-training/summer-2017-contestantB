package edu.asu.diging.contestantB.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.asu.diging.contestantB.domain.Manual;

@Controller
public class HomeController {
	@Autowired 
	private Manual man;
	
	@RequestMapping(value = "/")
	public String home() {
		Manual.myList.clear();
		return "home";
	}	

}
