package co.grandcircus.Lab28;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WeatherController {

	@Autowired
	private ApiService apserve;
	
	@RequestMapping("/")
	public ModelAndView index() {
		List<String> days = apserve.getTime();
		
		return new ModelAndView("request", "days", days);
	}
	
	@RequestMapping("/fore")
	public ModelAndView forecast(@RequestParam("day") int day,
			@RequestParam("lat") Double lat, 
			@RequestParam("longi") Double longi
			) {
		ModelAndView mav = new ModelAndView("forecast");
		List<String> days = apserve.getTime();
		
		
		
		String[] forecast = apserve.getForecast(lat, longi);
		if (forecast==null) {
			
			return new ModelAndView("redirect:/");
		}
		else {
			mav.addObject("day", days.get(day));
			mav.addObject("area", apserve.getArea(lat, longi));
			mav.addObject("fore", forecast[day]);
			return mav;
		}
		
		
	}
	
}
