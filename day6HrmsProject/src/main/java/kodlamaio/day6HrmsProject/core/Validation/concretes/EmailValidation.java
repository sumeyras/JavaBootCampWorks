package kodlamaio.day6HrmsProject.core.Validation.concretes;

import java.util.UUID;

import org.springframework.stereotype.Service;

import kodlamaio.day6HrmsProject.core.Validation.abstracts.ValidationService;

@Service
public class EmailValidation implements ValidationService{

	@Override
	public void sendValidation(String email) {
		
		UUID uuid = UUID.randomUUID();
		String code =uuid.toString();
		
		System.out.println("Send validation code: " + code + "\nto: " + email);
	
	}

}
