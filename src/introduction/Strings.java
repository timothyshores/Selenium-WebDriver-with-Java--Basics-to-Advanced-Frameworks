package introduction;

public class Strings {

	public static void main(String[] args) {
		// String Literal
		String str1 = "Tim";
		String str2 = "Tim";
		
		// String Object
		String str3 = new String("Tim");
		String str4 = new String("Tim");
		
		// Split a given string by whitespaces " "
		// E.g. "Selenium WebDriver with Java" -> ["Selenium", "WebDriver", "with", Java"]
		
		String courseName = "Selenium WebDriver with Java";
		String[] courseNameArray = courseName.split(" ");
		System.out.println(courseNameArray[0]);
		System.out.println(courseNameArray[1]);
		System.out.println(courseNameArray[2]);
		System.out.println(courseNameArray[3]);
	}

}
