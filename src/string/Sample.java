package string;

public class Sample {
	public static void main(String[]args) {
		String s ="Java programming";
		
		int length = s.length();
		System.out.println(length);
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		
		boolean startsWith = s.startsWith("Java");
		System.out.println(startsWith);
		
		boolean endswith = s.endsWith("programming");
		System.out.println(endswith);
		
		boolean contains = s.contains("Programming");
		System.out.println(contains);
		
		String substring = s.substring(5);
		System.out.println(substring);
		
		String substring2 = s.substring(8, 16);
		System.out.println(substring2);
		
		char charAt = s.charAt(5);
		System.out.println(charAt);
		
		int indexOf = s.indexOf('p');
		System.out.println(indexOf);
		
		int indexOf2 = s.indexOf('a');//print firstindex position of  'a'in string
		System.out.println(indexOf2);
		
		int lastIndexOf = s.lastIndexOf('m');
		System.out.println(lastIndexOf);
		
		int indexOf3 = s.indexOf('z'); //is we try to print unknown char it will(-1) 
		System.out.println(indexOf3);
		
//		char charAt2 = s.charAt(20);  //if try to print unknown index position it will return IndexOutof Bound exception
//		System.out.println(charAt2);
		
		String replace = s.replace('J', 'p');
		System.out.println(replace);
		
		String replace2 = s.replace("Java", "python");
		System.out.println(replace2);
		
		String replaceAll = s.replaceAll("programming", "Software testing");
		System.out.println(replaceAll);
		
		String replaceAll2 = s.replaceAll("programming","1");
		System.out.println(replaceAll2);
		
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
		String s1="   vikram      ";
		String trim = s1.trim();
		System.out.println(trim);
		
		String s2="HAPPY";
		String s3="Happy";
		
		boolean equals = s2.equals(s3);
		System.out.println(equals);
		
		boolean equalsIgnoreCase = s2.equalsIgnoreCase(s3); 
		System.out.println(equalsIgnoreCase);
		
		String concat = s1.concat(s2);
		System.out.println(concat);
		
		int compareTo = s.compareTo(s2);
		System.out.println(compareTo);
		
		int identityHashCode = System.identityHashCode(s);  //static method (System--class & identityHashcode ---method)
		System.out.println(identityHashCode);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
