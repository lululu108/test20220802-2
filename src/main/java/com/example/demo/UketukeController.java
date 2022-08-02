package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class UketukeController {
	
	    @RequestMapping(path = "/member", method = RequestMethod.GET)
	    String member(Model model) {
	    	return "/uketuke/member";
	    }
	
	    @RequestMapping(path = "/member", method = RequestMethod.POST)
	    String memberReg(Model model, @ModelAttribute UketukeForm uketukeForm ) {
	    	    this.uketukeService.insertUketuke(model, uketukeForm);
	      	List<Uketuke> list = this.uketukeService.getUketukeList();
	      	model.addAttribute("list", list);
	      	    return "/uketuke/index";
	    }
	    
	   @Autowired
	   private UketukeService uketukeService;
	   
	   @RequestMapping(path = "/uketuke", method = RequestMethod.GET)
	   String index(Model model) {
		       List<Uketuke> list = this.uketukeService.getUketukeList();
		   model.addAttribute("list", list);
		   return "uketuke/index";
	   }
}