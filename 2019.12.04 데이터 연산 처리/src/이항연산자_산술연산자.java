/*
 *		���������(+,-,*,/,%) : �ٸ� ���������� ������� ���
 *		1) int ���� ��������(byte,shor,char) => ����ó�� => int
 * 			byte + byte => int
 * 			char + byte => int
 * 			short + byte + char => int
 * 
 * 			byte + int => int
 * 			short + char + int => int
 * 
 * 			short + char + int + double => double   => String
 * 			"" + 77 
 * 
 * 
 */
public class ���׿�����_��������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=10;
		byte c=20;
		int d=b+c;
		
		
		String bb = "a";
		int gg = 77;
		System.out.println(bb+gg);
		int a = 5;
		String fig = bb+gg;
		//int cab = bb+gg;
		System.out.println(fig);
		
		//a = (bb+gg) + a 
		System.out.println(a);
	}

}
