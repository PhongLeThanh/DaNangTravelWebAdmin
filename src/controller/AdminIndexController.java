package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import defines.Defines;

@Controller
public class AdminIndexController {
	@Autowired
	private Defines defines;
	
	@ModelAttribute
	public void addCommon(ModelMap modelMap){
		modelMap.addAttribute("defines", defines);
	}
	
	@RequestMapping(value="")
	public String index() {
		return "admin.admin.index";
	}
	
//	@RequestMapping(value="/place")
//	public String placeIndex() {
//		return "admin.place.index";
//	}

}
