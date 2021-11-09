package jp.co.sss.sagawa.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping(path = "/")
	public String top() {
		return "top";
	}

	@RequestMapping(path = "/login")
	public String login() {
		return "index";

	}

}
