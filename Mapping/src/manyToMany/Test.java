package manyToMany;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String args[])
	{
		UserDetails user = new UserDetails();
		user.setUserName("Rajat Jain");
		
		UserDetails user2 = new UserDetails();
		user2.setUserName("Abhishek");
		
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Jeep");
		vehicle.getUser().add(user);
		vehicle.getUser().add(user2);
		
		Vehicle vehicle2 = new Vehicle();
		vehicle2.setVehicleName("Car");
		vehicle2.getUser().add(user);
		vehicle2.getUser().add(user2);
		
		user.getVehicle().add(vehicle);
		user.getVehicle().add(vehicle2);
		user2.getVehicle().add(vehicle);
		user2.getVehicle().add(vehicle2);
		
		//creating session factory object
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		//creating session object  
	    Session session=factory.openSession();
	    
	   
	    session.beginTransaction();
		session.save(user);
		session.save(user2);
		session.save(vehicle);
		session.save(vehicle2);
		session.getTransaction().commit();
	    System.out.println("successfully saved");
	    
	    session.close();
	}
}
