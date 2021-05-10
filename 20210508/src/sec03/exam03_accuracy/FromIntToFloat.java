package sec03.exam03_accuracy;

public class FromIntToFloat {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		
		
		float num3 = num2; // float = 부호(1비트)+지수(8비트)+가수(23비트)
		num2 = (int) num3; // 123456780 = 0111 0101 1011 1100 1101 0000 1100 <-28비트
		
		int result = num1 - num2;
		System.out.println(result);		// result = 4 
	}
}
