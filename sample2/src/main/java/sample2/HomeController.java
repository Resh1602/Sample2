package sample2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	private PersonManager pm;
	
	public void setPm(PersonManager pm) {
		this.pm = pm;
	}

	@RequestMapping(value="/home",method=RequestMethod.GET)
	public void save(HttpServletRequest req, HttpServletResponse res) {
		PersonDetails pdetails = new PersonDetails();
		pdetails.setName(req.getParameter("name"));
		pm.save(pdetails);
	}

}
