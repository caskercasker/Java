// % => 나머지 연산자
/*
 *  연산자 ==> 형변환
 *  		산술 : /, %
 *  				/ => 0으로 나눌 수 없다
 *  					정수/정수 = 정수     ====> 정수/실수
 *  				% => 왼쪽편값의 부호를 따라간다.
 *  					 양수%양수(음수) == > 양수
 *  					음수%음수(양수) == > 음수
 *  
 *  					5%2 => 1
 *  					-5%2 => -1
 *  					-5%-2 => -1
 *  					5%-2 => 1
 */
public class 이항연산자_산술연산자3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 30;
		double b = 4.0;
		double c = a/b;
		System.out.println("c="+c);
		
		//나머지 
		int d1 = 5%2;
		int d2 = -5%2;
		int d3 = -5%-2;
		int d4 = 5%-2;
		
		System.out.println("d1="+d1);
		System.out.println("d2="+d2);
		System.out.println("d3="+d3);
		System.out.println("d4="+d4);
		
		
		int e = 369;
		int h100 = e/100;
		int h10 = (e%100)/10;
		int h1 = e%10;
		
		System.out.println("100짜리:" + h100);
		System.out.println("10짜리:" + h10);
		System.out.println("1짜리:" + h1);
		
		System.out.println();
		
		
	}

}
