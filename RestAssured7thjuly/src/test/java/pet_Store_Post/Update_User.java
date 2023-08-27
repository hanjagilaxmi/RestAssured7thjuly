package pet_Store_Post;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Update_User {
	public static void main(String[] args) {
		RestAssured.baseURI="https://petstore.swagger.io/";
		RequestSpecification r = RestAssured.given();
		JSONObject obj=new JSONObject();
		obj.put("id", 345);
		obj.put("username", "laxmih");
		obj.put("firstName", "laxmi12");
		obj.put("lastName", "H");
		obj.put("email", "lax234@gmail.com");
		obj.put("password", "lax@123");
		obj.put("phone", "9876543215");
		obj.put("userStatus",0);
		r.contentType(ContentType.JSON);
		r.body(obj.toJSONString());
		Response res = r.request(Method.PUT,"/v2/user/laxmih");
		System.out.println(res.asString());
		res.prettyPrint();
		System.out.println(res.headers());
		System.out.println(res.getStatusCode());
		System.out.println(res.getTime());
	}
}
