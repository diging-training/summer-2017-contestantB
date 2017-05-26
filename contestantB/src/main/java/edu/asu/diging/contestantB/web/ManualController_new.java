package edu.asu.diging.contestantB.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.asu.diging.contestantB.domain.Manual;
import edu.asu.diging.contestantB.service.Sender;

@Controller
public class ManualController_new {
	@Autowired 
	private Manual man;
	
	@Autowired
	private Sender sender;
	
	@RequestMapping("/manual/new")
	public String manual_post(@RequestParam("input") Integer input, Model model) {
		man.setMax(input);
		if(man.getMax() == 0){
			model.addAttribute("winner", "Contestant B");
			model.addAttribute("lists", Manual.myList);
			man.setMax(-200);
			return "result";
		}
		man.setFlag(false);
		sender.sendMsg(man.getMax().toString());
		model.addAttribute("current_max", man.getMax());
		model.addAttribute("allowed_max", man.getMax()/2);
		return "manual";
	}

}
