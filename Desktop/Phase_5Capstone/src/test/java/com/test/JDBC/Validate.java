package com.test.JDBC;

public class Validate {

	public int Validate_DB() {
		
	 
		// TODO Auto-generated method stub
		
		 Flyaway flyaway = new Flyaway();
		 JDBC jdbc = new JDBC();
		 
		 String[] exp_details = flyaway.exp_details();
		 String[] act_details = jdbc.Jdbc();
		 int ret =0;
		 System.out.println("printing act_details and exp_details");
		 for (int i = 0; i < act_details.length; i++) {
			 System.out.println(act_details[i]);
			 System.out.println(exp_details[i]);
			 
			 if (exp_details[i].contains(act_details[i])) {
//				 return 1;
				 System.out.println("Details are Validated");
				 ret=1;
				
			}else {
//				return 0;
				System.out.println("Details are not Validated");
//				return 0;
			}
			
		}

		 
		 
//		 flyaway.Login_SearchFlight();
		return ret;
		 
	}
	
	
	
	public int Validating_Table() {
		Flyaway flyaway = new Flyaway();
		int login_SearchFlight_Validate = flyaway.Login_SearchFlight_Validate();
		return login_SearchFlight_Validate;
		
		
	}
	
	
	public int BookShowValidate() {
		Flyaway flyaway = new Flyaway();
		int book_Show_and_Validate = flyaway.Book_Show_and_Validate();
		return book_Show_and_Validate;
		
	}
	
	

}
