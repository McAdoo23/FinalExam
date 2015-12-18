package base;

import java.sql.ResultSet;
import java.util.ArrayList; 
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import domain.RateDomainModel;
import domain.StudentDomainModel;
import util.HibernateUtil;
import org.apache.poi.ss.formula.functions.FinanceLib;

public class RateDAL {
	public double rate;
	public int myCredit;
	

	public static RateDomainModel getRate(int myCredit) {
		//FinalExam - please implement
		Session session = HibernateUtil.getSessionFactory().openSession(); 
		Transaction tx = null; 
		RateDomainModel rateGet = null;
		
		try {
			// Create the SessionFactory from hibernate.cfg.xml
			tx = session.beginTransaction();
			Query query = session.createQuery("from RateDomainModel where TBLRATE = :rate ");
			
			List<?> list = query.list();
			rateGet = (RateDomainModel)list.get(0);
			
		} catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
		
		// Figure out which row makes sense- return back the 
		// right interest rate from the table based on the given credit score
		
		//FinalExam - obviously change the return value
		return rateGet;
	}

}