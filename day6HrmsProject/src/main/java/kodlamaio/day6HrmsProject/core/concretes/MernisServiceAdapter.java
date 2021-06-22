package kodlamaio.day6HrmsProject.core.concretes;

import java.rmi.RemoteException;

import org.springframework.stereotype.Service;

import kodlamaio.day6HrmsProject.core.adapters.abstracts.CheckMernisService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Service
public class MernisServiceAdapter implements CheckMernisService {

	@Override
	public boolean checkIfRealPerson(String nationalIdentity, String firstName, String lastName, String yearOfBirth) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			
			result = client.TCKimlikNoDogrula(Long.parseLong(nationalIdentity),firstName.toUpperCase(),lastName.toUpperCase(),Integer.parseInt(yearOfBirth));
			
		}catch (RemoteException e) {
			
			return result;
		
		}

		return result; 
	}

}
