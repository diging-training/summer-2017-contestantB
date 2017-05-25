package edu.asu.diging.contestantB.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ManualController {
	
		@RequestMapping("/manual")
		public String manual(Model model) {
			return "manual";
		}

}
