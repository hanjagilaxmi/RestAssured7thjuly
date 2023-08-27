package reqrespostmethod;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Login_Unsuccessfull {
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification r = RestAssured.given();
		JSONObject obj=new JSONObject();
		obj.put("email", "peter@klaven");
		r.contentType(ContentType.JSON);
		r.body(obj.toJSONString());
		Response res = r.request(Method.POST,"/api/login");
		System.out.println(res.asString());
		res.prettyPrint();
		System.out.println(res.headers());
		System.out.println(res.getStatusCode());
		System.out.println(res.getTime());
	}
}
