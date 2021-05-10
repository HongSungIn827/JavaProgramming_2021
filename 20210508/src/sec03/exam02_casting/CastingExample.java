package sec03.exam02_casting;

public class CastingExample {
	public static void main(String[] args) {
		
		int intValue = 44032;			// 유니코드 번호
		char charValue = (char)intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);
	}
}
