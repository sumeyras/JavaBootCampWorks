package day4CoffeShop.Adapters;

import java.rmi.RemoteException;

import day4CoffeShop.Abstracts.ICustomerCheckService;
import day4CoffeShop.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			
			result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(),customer.getDateOfBirth().getYear());
		
		} catch ( RemoteException e) {
			
			System.out.println("Invalid user");
		}
		return result;
	}

}
