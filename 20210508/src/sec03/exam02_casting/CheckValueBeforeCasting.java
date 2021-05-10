package sec03.exam02_casting;

public class CheckValueBeforeCasting {
	public static void main(String[] args) {
		
		int i = 125;		// 128은 byte type 범위( -128 ~ 127 )에 속하지 않는 수
		
//		byte b = i;			// compile error : i는 4byte 이므로 b(2byte)에 저장할 수 없다.
		
		if(i<Byte.MIN_VALUE||i>Byte.MIN_VALUE) {
			System.out.println("byte 타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 확인해주세요.");
		} else {
			byte b = (byte) i;
			System.out.println(b);
		}
		
//		byte b = (byte) i;   // 'i'가 byte type 범위를 벗어나기 때문에 'b'에는 쓰레기값이 저장된다.
//		System.out.println(b);
	}
}
