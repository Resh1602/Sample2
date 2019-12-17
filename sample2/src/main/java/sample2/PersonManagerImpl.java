package sample2;

import org.springframework.transaction.annotation.Transactional;

public class PersonManagerImpl implements PersonManager {

	private PersonDao pd;
	
	public void setPd(PersonDao pd) {
		this.pd = pd;
	}
	
	@Transactional
	public void save(PersonDetails pdetails) {
		pd.save(pdetails);
		
	}


}
