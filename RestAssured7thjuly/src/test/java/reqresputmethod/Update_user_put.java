package reqresputmethod;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Update_user_put {
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification r = RestAssured.given();
		JSONObject obj=new JSONObject();
		obj.put("name", "laxmi");
		obj.put("job", "CEO");
		r.contentType(ContentType.JSON);
		r.body(obj.toJSONString());
		Response res = r.request(Method.PUT,"/api/users/2");
		System.out.println(res.asString());
		res.prettyPrint();
		System.out.println(res.headers());//head request of http protocol
		System.out.println(res.getStatusCode());
		System.out.println(res.getTime());
	}
}
