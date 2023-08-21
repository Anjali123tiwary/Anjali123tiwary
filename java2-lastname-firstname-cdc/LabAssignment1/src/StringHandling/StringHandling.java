package StringHandling;

public class StringHandling {

	public static void main(String[] args) {
		String name="Anjali";
		String nam="anjali";
		System.out.println(name.length());
		System.out.println(name.substring(3, 5));
		System.out.println(name.concat(" kumari"));
		System.out.println(name.equals(nam));
		System.out.println(name.compareTo(nam));
		System.out.println(name.equalsIgnoreCase(nam));
		System.out.println(name.contains("j"));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.replace("j", "t"));
	}

}
