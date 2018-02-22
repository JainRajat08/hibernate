package oneToMany.manyToOne;
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
		vehicle.setUser(user);
		
		Vehicle vehicle2 = new Vehicle();
		vehicle2.setVehicleName("Car");
		vehicle2.setUser(user);
		
		user.getVehicle().add(vehicle);
		user.getVehicle().add(vehicle2);
		
		//creating session factory object
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		//creating session object  
	    Session session=factory.openSession();
	    
	   
	    session.beginTransaction();
		session.save(user);
		session.save(vehicle);
		session.save(vehicle2);
		session.getTransaction().commit();
	    System.out.println("successfully saved");
	    
	    session.close();
	}
}
