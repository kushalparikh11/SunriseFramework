package sunrise.qa.dummy;

import com.github.javafaker.Faker;

public class Testmethods {

	public static void  main(String[] args) {
		Faker faker = new Faker();
		String random_id = "@"+faker.name().username(); 
		
		
		System.out.println(random_id); 

	}

}
