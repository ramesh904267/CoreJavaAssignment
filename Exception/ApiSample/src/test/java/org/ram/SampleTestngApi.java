package org.ram;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class SampleTestngApi {
	
	@Test
	private void getRequest() {
		
		Response response = RestAssured.get("https://dummy.restapiexample.com/api/v1/employee/1");
		ResponseBody responseBody = response.body();
		System.out.println(responseBody.asPrettyString());
		
		
	}

}
