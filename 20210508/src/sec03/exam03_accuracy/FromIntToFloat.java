package sec03.exam03_accuracy;

public class FromIntToFloat {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		
		
		float num3 = num2; // float = ��ȣ(1��Ʈ)+����(8��Ʈ)+����(23��Ʈ)
		num2 = (int) num3; // 123456780 = 0111 0101 1011 1100 1101 0000 1100 <-28��Ʈ
		
		int result = num1 - num2;
		System.out.println(result);		// result = 4 
	}
}
