package reqreswebsiteforgetmethod;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SingleUser_Get {
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification r = RestAssured.given();
		Response res = r.request(Method.GET,"/api/users/2");
		//System.out.println(res.asString());//output will be in single line
		res.prettyPrint();//output will be in as it is developer developed
	}
}
