package sec01.exam01_variable;

public class VariableScopeExample {
	public static void main(String[] args) {
		int var1;
		
		if(true) {
			int var2;
			
			var1 = 10;
			var2 = 20;
		}
		
		var1 = 10;
//		var2 = 20;			var2 는 if문 블록을 벗어났기 때문에 사용할 수 없다
		
		for(int i = 0; i < 1 ; i++) {
			int var3;
			
			var1 = 10;
			var3 = 30;
		}
		
		var1 = 10;
//		var3 = 30;			var3은 for문 블록을 벗어났기 때문에 사용할 수 없다
		
	}
}
