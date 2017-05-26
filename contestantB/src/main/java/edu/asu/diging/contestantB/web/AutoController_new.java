package edu.asu.diging.contestantB.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.asu.diging.contestantB.domain.Manual;
import edu.asu.diging.contestantB.service.Sender;

import java.util.Random;

@Controller
public class AutoController_new {
	@Autowired
	private Manual man;
	
	@Autowired
	private Sender sender_auto;

	@RequestMapping("/auto/new")
	public String auto_get(Model map) {
		Random rand = new Random();
		Integer max_new;
		Integer n = rand.nextInt(man.getMax()/2) + 1;
		map.addAttribute("Current_max",man.getMax());
		map.addAttribute("lists",Manual.myList);
		for (int ind=0; ind<Manual.myList.size();ind++ ){
			System.out.println(Manual.myList.get(0));
		}
		man.setMax(n);
		man.setFlag(false);
		sender_auto.sendMsg(man.getMax().toString());
		return "autonew";
	}

}
