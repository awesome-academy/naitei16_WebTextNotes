package app.controller;

import app.dto.LoginDto;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import app.model.Student;
import app.service.UserService;

@Controller
public class UserController {
	private static final Logger logger = Logger.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/")
	public ModelAndView index() {
		logger.info("home page");
		ModelAndView model = new ModelAndView("views/students/index");
		return model;
	}

	@RequestMapping(value = "/login",method=RequestMethod.GET)
	public String login(Model model) {
		model.addAttribute("user", new LoginDto());
		return "views/students/login";
 	}

	@RequestMapping(value = "/login", method=RequestMethod.POST)
	public String login(@ModelAttribute(value="user") LoginDto user) {
		boolean result = userService.findByUsername(user);
		if(!result){
			System.out.println("ko co user");
			return "views/students/login";
		}
		return "redirect:/";
	}

}
