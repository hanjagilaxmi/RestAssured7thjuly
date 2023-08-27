package pojo_Create_User;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post_op1 {
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification r = RestAssured.given();
		JSONObject ob=new JSONObject();
		r.contentType(ContentType.JSON);
		r.body(ob.toJSONString());
		Response res = r.request(Method.POST,"/api/users");
		Create_User p = res.as(Create_User.class);
		System.out.println(p.getCreatedAt());
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getJob());
	}
}
