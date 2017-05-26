package edu.asu.diging.contestantB.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import edu.asu.diging.contestantB.domain.Manual;

@Controller
public class ManualController {
	@Autowired 
	private Manual man;
	
	@RequestMapping("/manual")
	public String manual(Model model) {
		if(man.getMax() == 0){
			model.addAttribute("winner", "Contestant A");
			model.addAttribute("lists", Manual.myList);
			man.setMax(-200);
			return "result";
		}
		model.addAttribute("current_max", man.getMax());
		model.addAttribute("allowed_max", man.getMax()/2);
		return "manual";
	}

}
