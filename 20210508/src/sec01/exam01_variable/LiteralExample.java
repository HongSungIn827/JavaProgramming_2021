package sec01.exam01_variable;

public class LiteralExample {
	public static void main(String[] args) {
		int var1 = 10;							// 10 진수 : 10
		System.out.println(var1);
		
		int var2 = 010;							// 8진수 : 10
		System.out.println(var2);
		
		int var3 = 0x10;						// 16진수 : 10
		System.out.println(var3);
		
		double var4 = 0.25;
		System.out.println(var4);
		
		double var5 = 2E5;
		System.out.println(var5);
		
		char var6 = 'A';
		System.out.println(var6);
		
		char var7 = '나';
		System.out.println(var7);
		
		System.out.println('\t'+"들여쓰기");		
		System.out.println("대한"+'\n'+"민국");
		System.out.println("That"+'\''+"s Java");
		System.out.println("저것은"+'\"'+"중요" + '\"' + "합니다");
		System.out.println("가격이" + '\\' + "300입니다");
		
		char var8 ='\u0041';
		System.out.println(var8);
		
		System.out.println("대한" + "민국");
		System.out.println("java" + 8);
		
		String var9 = "자바";
		System.out.println(var9);
		
		boolean var10 = true;
		boolean var11 = false;
		System.out.println(var10);
		System.out.println(var11);
	}
}
