package edu.asu.diging.contestantB.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResultController {
	
	@RequestMapping(value = "/result")
	public String result(){
		return "result";
	}
}
