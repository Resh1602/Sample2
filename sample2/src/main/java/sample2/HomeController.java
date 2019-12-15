package sample2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public void save(HttpServletRequest req, HttpServletResponse res) {
		String name = req.getParameter("name");
		System.out.println("Name: "+name);
	}

}
