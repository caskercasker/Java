/*
 * 
 * 		쉬프트연산자(비트이동연산자)
 * 			<<(왼쪽이동)    >>(오른쪽 이동)
 * 				00 채우기	     
 * 
 * 14 <<3							14 >>3
 * 	1110 = 112 =(14*8)				1110
 * 									   1(110)
 * 									14/8 = 1 
 * 
 */									
public class 이항연산자_쉬프트연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 14<<3;
		int b = 14>>3;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}
