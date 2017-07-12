package jsonPath;

import com.jayway.jsonpath.JsonPath;

public class extractJsonPath {



	/*{
	    "access_token": "4b081e648c8be76788d75b68b4e2dc969898dfdd",
	    "expires_in": 3600,
	    "token_type": "Bearer",
	    "scope": "basic user web"
	}*/
	public static void main(String args[])
	{
		String json = "{\"access_token\":\"4b081e648c8be76788d75b68b4e2dc969898dfdd\","
				+ "\"expires_in\":3600,"
				+ "\"token_type\":\"Bearer\", "
				+ "\"scope\": \"basic user web\"}";

		System.out.println(json);
		
		String token = JsonPath.parse(json).read("$.access_token");
		
		System.out.println(token);
		
	}
}
