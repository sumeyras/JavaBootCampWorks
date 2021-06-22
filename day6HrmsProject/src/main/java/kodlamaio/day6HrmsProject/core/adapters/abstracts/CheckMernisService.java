package kodlamaio.day6HrmsProject.core.adapters.abstracts;

public interface CheckMernisService {
	
	public boolean checkIfRealPerson(String nationalIdentity, String firstName, String lastName, String yearOfBirth);

}
