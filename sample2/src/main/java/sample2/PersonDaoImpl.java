package sample2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

public class PersonDaoImpl implements PersonDao {
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	
	public void save(PersonDetails pdetails) {
		System.out.println(pdetails.toString());
		Session session = this.sessionFactory.getCurrentSession();
		session.save(pdetails);
		System.out.println("Person saved successfully, Person Details="+pdetails);
	}

}
