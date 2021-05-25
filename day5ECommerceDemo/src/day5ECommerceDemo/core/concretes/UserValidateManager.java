package day5ECommerceDemo.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import day5ECommerceDemo.core.abstracts.UserValidateService;
import day5ECommerceDemo.entities.concretes.User;


public class UserValidateManager implements UserValidateService{

	
	private String regex = "^(.+)@(.+)$";
	
	public boolean eMailValidate(String email) {
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
	
	
	@Override
	public boolean validate(User user) {
			
		if(user.getFirstName()!= null && user.getLastName()!= null && user.geteMail()!= null && user.getPassword()!= null ) {
					
			if(user.getFirstName().length()<2 || user.getLastName().length()<2 ) {
				System.out.println("Ad Soyad en az 2 karakterden oluþmalýdýr. ");
				return false;
				
			}
			
			if(!eMailValidate(user.geteMail())){
				
				System.out.println("Girdiðiniz e-mail adresi e-mail formatýna uygun deðildir.");
				return false;
			}
			if(user.getPassword().length() < 6) {
				System.out.println("Parola 6 karakterden küçük olamaz");
				return false;
			}
			
		}else {
				
			if(user.getFirstName()== null) {
				System.out.println("Ýsim kýsmý boþ býrakýlamaz");
				return false;
			}

			if(user.getLastName()== null) {
				System.out.println("Soyisim kýsmý boþ býrakýlamaz");
				return false;
			}

			if(user.geteMail()== null) {
				System.out.println("E-mail kýsmý boþ býrakýlamaz");
				return false;
			}

			if(user.getPassword()== null) {
				System.out.println("Parola kýsmý boþ býrakýlamaz");
				return false;
			}
		}
		
		return true;
		
	}


	@Override
	public boolean signInControl(String email, String password) {
		if(email != null && password != null )
		{
			return true;
		}else {
			System.out.println("E mail ve þifre boþ býrakýlamaz");
			return false;
		}
		
	}
}
