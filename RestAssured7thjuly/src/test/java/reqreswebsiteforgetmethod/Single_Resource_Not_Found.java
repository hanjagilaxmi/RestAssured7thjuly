package reqreswebsiteforgetmethod;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Single_Resource_Not_Found {
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification r = RestAssured.given();
		Response res = r.request(Method.GET,"/api/unknown/23");
		res.prettyPrint();
	}
}
