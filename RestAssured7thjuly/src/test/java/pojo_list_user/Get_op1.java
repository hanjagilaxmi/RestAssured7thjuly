package pojo_list_user;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_op1 {
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification r = RestAssured.given();
		Response res = r.request(Method.GET,"/api/users?page=2");
		List_Users l = res.as(List_Users.class);
		Support s = l.getSupport();
		System.out.println(s.getText());
		List<Data> d = l.getData();
		
		for(Data d1:d)
		{
			String a = d1.getAvatar();
			System.out.println(a);
			System.out.println(d1.getId());
		}
	}
}
