package reqreswebsiteforgetmethod;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ListUserr_UsingJsonparser {
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification r = RestAssured.given();
		Response res = r.request(Method.GET,"/api/users?page=2");
		String val = res.asString();
		JsonPath path=new JsonPath(val);
		System.out.println(path.getString("data[3].email"));
	}
}
