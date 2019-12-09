/*
 *		데이터 저장(변수) ===== 데이터 가공
 *							(연산자,제어문) => 메소드 
 *		변수 + 메소드 ===> 클래스(객체지향프로그래밍)
 * 						===================
 * 						재사용(상속),수정(override),추가(overloading) 가능한 다형성을 유지
 * 
 * 						====> 설계(인터페이스)
 * 						====> 데이터 여러개 저장 ===> 자료구조
 * ============================================ 라이브러리
 * 
 * 	연산자 (자바에서 제공하는 연산자)
 * 	단항연산자 증감 : ++ , --
 * 			전치 ++a, 증가를 먼저학 다른 연산 수행
 * 			후피 a++ 다른 연산 수행후에 증가
 * 
 * 		boolean = ! 
 * 		=(type) : cast  연산자(형변환 연산자)
 * 		byte < char < int < long < float < double
 * 				short 
 * 		자동형변환 (upcasting)
 * 		강제형변환 (downcasting)
 * 
 * 		연산 => 같은 데이터형만 연산이 가능
 * 				int + int
 * 				double + double
 * 				10.5 + 10
 * 		이항연산자
 * 		= 산술연산자 (+,-.*,/,%)
 * 		= 비트연산자 ( & , | ,  ^)
 * 					&게이트,직렬 * 
 * 					|게이트 병렬  +
 * 				
 */
public class 연산자_종합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d =123456.89;
		int a = (int)((d-123456)*100);
		
		System.out.println(a);
	}
	
}
