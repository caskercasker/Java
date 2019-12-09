/*
 *		산술연산자(+,-,*,/,%) : 다른 데이터형을 사용했을 경우
 *		1) int 이하 데이터형(byte,shor,char) => 연산처리 => int
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
public class 이항연산자_산술연산자 {

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
