package reqreswebsiteforgetmethod;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SingleUser_get_JsonParsing {
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification r = RestAssured.given();
		Response res = r.request(Method.GET,"/api/users/2");
		String value = res.asString();//output will be in single line
		JsonPath path=new JsonPath(value);
		System.out.println(path.getString("data.id"));
	}
}
