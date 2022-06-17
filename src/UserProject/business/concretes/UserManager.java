package UserProject.business.concretes;

import java.util.List;

import UserProject.business.abstracts.UserCheckService;
import UserProject.business.abstracts.UserService;
import UserProject.entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class UserManager implements UserService {

	private UserCheckService userCheckService;

	
	public UserManager(UserCheckService userCheckService) {
		super();
		this.userCheckService = userCheckService;
	}

	
	@Override
	public void add(User user) {
		if(userCheckService.CheckIfRealPerson(user))  {
			
			System.out.println("User added");
		
		}else {
		
			System.out.println("Not a valid person");
		}
		
	}
	
	

	
}
