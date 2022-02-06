package tests;

import java.net.MalformedURLException;

public class Entity {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		Login_Module login_Module = new Login_Module();
		login_Module.Login();
		
		OtherTransaction_Module otherTransaction_Module = new OtherTransaction_Module();
		otherTransaction_Module.OtherTransaction();
	}

}
