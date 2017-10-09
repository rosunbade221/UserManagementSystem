package login;

import java.security.Principal;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {



	@RequestMapping(value = { "/login", "/" })
	public String login(Principal principal) {

		if (principal != null && ((Authentication) principal).isAuthenticated()) {
			return "home";
		} else {
			return "login";
		}
	}


	@RequestMapping(value = "/home")
	public String dashboard(Principal principal) {
		return "home";
	}

}
