package org.June.Controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

// First request will show home.jsp
@Controller
public class loginController 
{
	@RequestMapping("/")
	public String firstScreen()
	{
		return "hello"; //view name
	}
	

}
