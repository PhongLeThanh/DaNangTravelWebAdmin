package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dao.PlaceDao;
import entities.Hotel;
import entities.Place;
import entities.Restaurant;
import entities.TouristAttraction;

@Controller
@RequestMapping(value = "/place")
public class PlaceController {

	@RequestMapping(value = "")
	public String index(ModelMap modelMap) {
		PlaceDao placeDao = new PlaceDao();
		modelMap.addAttribute("list", placeDao.getList());
		return "admin.place.index";
	}
	@RequestMapping(value= "/add", method=RequestMethod.GET)
	public String add() {
		return "admin.place.add";
	}
	
	@RequestMapping(value= "/add", method=RequestMethod.POST)
	public String add(ModelMap modelMap, @ModelAttribute("place") Place place,@ModelAttribute Restaurant restaurant, @ModelAttribute("hotel") Hotel hotel,@ModelAttribute TouristAttraction touristAttraction) {
		System.out.println(place.getPlaceName());
		PlaceDao placeDao = new PlaceDao();
		if (placeDao.addItem(place)) {
			if(place.getCategoryId() == 1) {
				
			}
			if(place.getCategoryId() == 2) {
				
			}
			if(place.getCategoryId() == 3) {
				
			}
			System.out.println("Them ok");
			return "redirect:/place?msg=1";
		}
		return "redirect:/place?msg=0";
	}
	
	@RequestMapping(value = "edit/{id}")
	public String edit(ModelMap modelMap, @PathVariable("id") int id) {
		PlaceDao placeDao = new PlaceDao();
		Place place = placeDao.getItem(id);
		if (place == null) {
			return "redirect:/place";
		}
		modelMap.addAttribute("place", place);
		return "admin.place.edit";
	}
	@RequestMapping(value="edit/{id}", method=RequestMethod.POST)
	public String edit(ModelMap modelMap, @PathVariable("id") int id, @ModelAttribute("place") Place place) {
		PlaceDao placeDao = new PlaceDao();
		place.setId(id);
		if(placeDao.editItem(place)) {
			return "redirect:/place?msg=2";
		}
		return "redirect:/place?msg=0";
	}
}
