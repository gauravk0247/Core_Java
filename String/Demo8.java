// 17/10/23
// Q. equalIgnoreCase and compareToIgnoreCase
class Demo8{
	public static void main(String[] args){
		// Simple Way
		String s1 = "Cyber";
		String s2 = "Cyber";
		// equals
		System.out.println(s1.equals(s2));
		System.out.println("Cyber".equals("cyber"));
		// equalsIgnoreCase
		System.out.println(s1.equalsIgnoreCase(s2));
		// Another same way
		System.out.println("Cyber".equalsIgnoreCase("cyber"));
		String s11 = "Cyber";
		String s22 = "Cyber";
		// compareTo
		System.out.println(s11.compareTo(s22));
		System.out.println("Cyber".compareTo("Cyber"));
		System.out.println("Ayber".compareTo("Cyber"));
		System.out.println("Cyber".compareTo("Ayber"));
		// compareToIgnoreCase --> only ignore case and compare
		System.out.println("Cyber".compareToIgnoreCase("Cyber"));
		System.out.println("cyber".compareToIgnoreCase("Cyber"));
		
	}
}