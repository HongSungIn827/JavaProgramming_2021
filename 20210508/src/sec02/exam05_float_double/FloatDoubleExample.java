package sec02.exam05_float_double;

public class FloatDoubleExample {
	public static void main(String[] args) {
		double var1 = 3.14;
		float var2 = 3.14F;
		
		// 정밀도 검사
		double var3 = 0.1234567890123456789;
		float var4 = 0.1234567890123456789F;
		
		System.out.println(var3);
		System.out.println(var4);
		
		// e 사용하기
		int var5 = 3000000;
		double var6 = 3e6;
		float var7 = 3e6F;
		double var8 = 2e-3;
		
		System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);
	}
}
