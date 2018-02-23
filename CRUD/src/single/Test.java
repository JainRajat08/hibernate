package single;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
	
	public static void main(String argsp[])
	{
		User user;
		
		//Save data model into database
				SessionFactory factory = new Configuration().configure().buildSessionFactory();
				Session session = factory.openSession();
				session.beginTransaction();
				
				for(int i=0;i<10;i++)
				{
					user = new User();
					user.setUserName("user" +i);
					session.save(user);
				}
				
				user = (User) session.get(User.class, 7);
				System.out.println("User Id: "+user.getUserId());
				System.out.println("User Name: "+user.getUserName());
				
				user.setUserName("Updated user");
				session.update(user);
				
				user = (User) session.get(User.class, 7);
				System.out.println("User Id: "+user.getUserId());
				System.out.println("User Name: "+user.getUserName());
				
				session.delete(user);
				
				
				session.getTransaction().commit();
				session.close();
				System.out.println("Successfully saved");
	}

}
