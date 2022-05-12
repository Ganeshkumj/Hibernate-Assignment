package example.configuration.demo6;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class MainClass {
	public static void main(String[] args){
		
		StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();
		SessionFactory factory=new MetadataSources(registry).buildMetadata().buildSessionFactory();
		Session session=factory.openSession();
		
		Transaction tx=session.beginTransaction();
		
		Author author=new Author();
		author.setName("John");
		author.setEmail("john@gmail.com");
		
		Book book=new Book();
		book.setTitle("Learning Hibernate");
		book.setAuthor(author);
		book.setPrice(2342);
		
		
		session.save(author);
		session.save(book);
		tx.commit();
		session.close();
	}
}
