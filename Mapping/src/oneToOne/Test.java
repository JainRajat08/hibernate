package oneToOne;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String args[])
	{
		UserDetails user = new UserDetails();
		user.setUserName("Rajat Jain");
		
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Jeep");
		
		user.setVehicle(vehicle);
		
		//creating session factory object
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		//creating session object  
	    Session session=factory.openSession();
	    
	   
	    session.beginTransaction();
		session.save(user);
		session.save(vehicle);
		session.getTransaction().commit();
	    System.out.println("successfully saved");
	    
	    session.close();
	}
}
