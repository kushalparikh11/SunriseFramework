package sunrise.qa.dummy;

import com.github.javafaker.Faker;

public class Testmethods {

	public static void  main(String[] args) {
		Faker faker = new Faker();
		String random_name =  faker.name().fullName()+","
				+ "\n" + faker.address().streetAddress()+","
				+"\n" + faker.address().cityName()+","
				+"\n" + faker.address().zipCode(); 
		
		System.out.println(random_name); 

	}

}
