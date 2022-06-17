package UserProject.adapter;

import UserProject.business.abstracts.UserCheckService;
import UserProject.entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisKpsAdapter implements UserCheckService {
	private UserCheckService userCheckService;
	 boolean isValid = false;

	@Override
	public boolean CheckIfRealPerson(User user) {
		
		try {
		KPSPublicSoapProxy kpsPublicSoapProxy= new KPSPublicSoapProxy();
		isValid = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(user.getIdentityNumber()), user.getFirstName(),
				user.getLastName(), user.getbirthYear());
		
	} catch (Exception exception) {
		
		
		System.out.println("Not a valid person");
	}
		return isValid;
	}

}
