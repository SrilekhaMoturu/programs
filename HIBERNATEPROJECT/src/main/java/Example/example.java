package Example;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mtc.app.entity.vendors;
import com.mtc.app.util.Hibernateutil;

public class example {

	public static void main(String[] args) {

		SessionFactory sessionFactory = Hibernateutil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
	
		vendors vendors = session.get(vendors.class,101);
		
		System.out.println("vendorsId   : "+vendors.getId());
		System.out.println("vendorsName : "+vendors.getName());
		System.out.println("vendorsQuantity   : "+vendors.getQuantity());
		System.out.println("vendorsArrivaldate   : "+vendors.getArrivalDate());
		System.out.println("vendorscost   : "+vendors.getCost());
		
		session.close();
		
		sessionFactory.close();

	}

}

