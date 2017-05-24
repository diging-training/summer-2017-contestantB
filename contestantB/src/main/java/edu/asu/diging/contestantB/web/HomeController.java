package edu.asu.diging.contestantB.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public String home() {
		return "home";
	}

	@RequestMapping("/auto")
	public String auto() {
		return "auto";
	}

	@RequestMapping("/manual")
	public String manual(Model model) {
		return "manual";
	}
}
