package edu.asu.diging.contestantB.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.asu.diging.contestantB.domain.Manual;

@Controller
public class AutoController_update {
	@Autowired
	private Manual man;
	
	@RequestMapping(value="/auto/update", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<String> auto_get() {
		return  new ResponseEntity<String>( String.valueOf(man.isNew()), HttpStatus.OK);
	}

}
