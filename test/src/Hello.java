class A{
	int a;
	int b;
	static int c;
}

public class Hello {
	public static void main(String[]args){
//		int a = 1;
//		for(int i = 0; i<10; i++) {
//			a += i;
//		}
//		System.out.println(a);
//	}
		
		A aa = new A();
		A bb = new A();
		aa.c = 1100;
		
		
		System.out.println(aa.c);
		System.out.println(bb.c);
	}


}
