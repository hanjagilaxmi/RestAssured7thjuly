package pojo_Single_resource;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_Op1 {
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification r = RestAssured.given();
		Response res = r.request(Method.GET,"/api/unknown/2");
		Single_Resource s = res.as(Single_Resource.class);
		Data data = s.getData();
		String c = data.getColor();
		System.out.println(c);
		int y = data.getYear();
		System.out.println(y);
	}
}
