package edu.asu.diging.contestantB.domain;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class Manual {

	static public List<Integer> myList = new ArrayList<Integer>();
	static private Integer max=200;
	private boolean flag = false;
	

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public Integer getMax(){
		return Manual.max;
	}
	
	public void setMax(Integer input){
		Manual.max = Manual.max-input;
		Manual.myList.add(Manual.max);
		this.flag = !this.flag;
		
	}
	
	public boolean isNew(){
		return this.flag;
	}
}
