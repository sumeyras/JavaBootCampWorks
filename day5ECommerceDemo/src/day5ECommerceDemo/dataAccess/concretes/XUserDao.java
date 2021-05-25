package day5ECommerceDemo.dataAccess.concretes;



import java.util.ArrayList;
import java.util.List;

import day5ECommerceDemo.dataAccess.abstracts.UserDao;
import day5ECommerceDemo.entities.concretes.User;

public class XUserDao implements UserDao{
	
	//List Interface olduðu için new lenmez
	public List<String> eMailList = new ArrayList<String>();

	
	@Override
	public boolean search(String email ) {
		
		eMailList.add("shsahsja@hotmail.com");
		
		if (eMailList.contains(email))
		{
			System.out.println("Sistemde bu E mail ' e ait kullanýcý mevcuttur.");
			return false;
		}
		else {

			return true;
		}
			
		
	}


	@Override
	public void addToDb(User user) {
		System.out.println("Üyelik baþarýyla gerçekleþtirilmiþtir");
		
	}


	@Override
	public boolean loginControl(String email, String password) {
		User userxdao = new User(1,"Sümeyra","Çakmak","sumeyra@gmail.com","123456");
		if(!userxdao.geteMail().equals(email) || !userxdao.getPassword().equals(password)) {
			System.out.println("Email veya Parola hatalý girilmiþtir.");
			return false;
		}
		return true;
	}

}
