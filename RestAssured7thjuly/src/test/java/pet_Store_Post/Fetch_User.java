package pet_Store_Post;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Fetch_User {
	public static void main(String[] args) {
		RestAssured.baseURI="https://petstore.swagger.io/";
		RequestSpecification r = RestAssured.given();
		Response res = r.request(Method.GET,"/v2/user/laxmih");
		res.prettyPrint();
	}
	
}
