package sec03.exam02_casting;

public class CheckValueBeforeCasting {
	public static void main(String[] args) {
		
		int i = 125;		// 128�� byte type ����( -128 ~ 127 )�� ������ �ʴ� ��
		
//		byte b = i;			// compile error : i�� 4byte �̹Ƿ� b(2byte)�� ������ �� ����.
		
		if(i<Byte.MIN_VALUE||i>Byte.MIN_VALUE) {
			System.out.println("byte Ÿ������ ��ȯ�� �� �����ϴ�.");
			System.out.println("���� �ٽ� Ȯ�����ּ���.");
		} else {
			byte b = (byte) i;
			System.out.println(b);
		}
		
//		byte b = (byte) i;   // 'i'�� byte type ������ ����� ������ 'b'���� �����Ⱚ�� ����ȴ�.
//		System.out.println(b);
	}
}
