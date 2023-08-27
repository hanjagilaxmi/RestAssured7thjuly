package reqrespostmethod;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateUser_UsingJsonParser {
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification r = RestAssured.given();
		JSONObject obj=new JSONObject();
		obj.put("name", "laxmi");
		obj.put("job", "founder");
		r.contentType(ContentType.JSON);
		r.body(obj.toJSONString());
		Response res = r.request(Method.POST,"/api/users?page=2");
		String val = res.asString();
		JsonPath path=new JsonPath(val);
		System.out.println(path.getString("name"));
	}
}
