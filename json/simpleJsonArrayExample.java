import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

//https://www.lynxbee.com/example-of-creating-json-array-in-java/

public class simpleJsonArrayExample {
	public static void main(String args[]) {
		JSONObject myObject = new JSONObject();
		myObject.put("myname", "lynxbee");
		myObject.put("myurl", "www.lynxbee.com");

		JSONArray myArray = new JSONArray();
		JSONObject firstObjectInsideArray = new JSONObject();
		firstObjectInsideArray.put("cms", "wordpress");
		myArray.add(firstObjectInsideArray);
		JSONObject secondObjectInsideArray = new JSONObject();
		secondObjectInsideArray.put("platform", "linux");
		myArray.add(secondObjectInsideArray);

		myObject.put("technology", myArray);

		System.out.println("We created JSON Array as example : " + myObject);
	}
}
