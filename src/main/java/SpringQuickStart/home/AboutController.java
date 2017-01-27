package SpringQuickStart.home;

import SpringQuickStart.home.about.AboutBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class AboutController {

	@ModelAttribute("module")
	AboutBean module() {
		return new AboutBean();
	}

	@GetMapping("/about")
	String about() {
		return "home/about";
	}
}
