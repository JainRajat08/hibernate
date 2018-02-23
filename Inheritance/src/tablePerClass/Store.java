package tablePerClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Store {

	public static void main(String[] args) {
		
	//Set data model
		
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Car");
		
		TwoWheeler bike = new TwoWheeler();
		bike.setVehicleName("Bike");
		bike.setSteeringHandle("bike handle");
		
		FourWheeler car = new FourWheeler();
		car.setVehicleName("maruti");
		car.setSteeringWheel("maruti wheel");
		
	//Save data model into database
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(vehicle);
		session.save(bike);
		session.save(car);
		session.getTransaction().commit();
		session.close();
		System.out.println("Successfully saved");
	//Get data model from database
		/*session = factory.openSession();
		user = null;
		user = session.get(Employee.class, 1);
		session.close();
		System.out.println(user.getId());
		System.out.println(user.getFirstname());*/
		}
}
