package in.vk.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@GetMapping("/hellopage")
	public ModelAndView openHellopage() {
		 ModelAndView mav = new  ModelAndView();
		 mav.setViewName("hello");
		return mav;
	}

}
