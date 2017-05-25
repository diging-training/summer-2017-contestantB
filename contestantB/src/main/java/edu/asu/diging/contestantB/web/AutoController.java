package edu.asu.diging.contestantB.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AutoController {

	@RequestMapping("/auto")
	public String auto() {
		return "auto";
	}
	
}
