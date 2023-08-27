package pojo_PetStore;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post_Op1 {
	public static void main(String[] args) {
		RestAssured.baseURI="https://petstore.swagger.io/";
		RequestSpecification r = RestAssured.given();
		JSONObject ob=new JSONObject();
		ob.put("id", 234);
		ob.put("username", "laxmi");
		ob.put("firstName", "lax1");
		ob.put("lastName", "CEO");
		ob.put("email", "laxmih123@gmail.com");
		ob.put("password", "12345");
		ob.put("phone", "9874563215");
		ob.put("userStatus",0);
		r.contentType(ContentType.JSON);
		r.body(ob.toJSONString());
		Response res = r.request(Method.POST,"/v2/user");
		Create_User c = res.as(Create_User.class);
		System.out.println(c.getCode());
		System.out.println(c.getType());
		System.out.println(c.getMessage());
	}
}
