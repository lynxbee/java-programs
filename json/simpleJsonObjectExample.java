import org.json.simple.JSONObject;

// https://www.lynxbee.com/example-of-creating-simple-json-in-java/

public class simpleJsonObjectExample {
	public static void main(String args[]) {
		JSONObject myObject = new JSONObject();
		myObject.put("myname", "lynxbee");
		myObject.put("myurl", "https://www.lynxbee.com");
		System.out.println("We created JSON as example : " + myObject);
	}
}
