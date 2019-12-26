package test;

class MovieVO{
	String title;
	
	public MovieVO(String a){
		this.title = a;
	}
	
}

class Calculator {
    int left, right;
 
    public Calculator(int left, int right) {
        this.left = left;
        this.right = right;
    }
}

public class home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator c1 = new Calculator(10,20);
		Calculator c2 = new Calculator (10,30);
		MovieVO m1 = new MovieVO("aa");
		MovieVO m2 = new MovieVO("bb");
		MovieVO m3 = new MovieVO("cc");
		
//		System.out.println(c1.left);
//		System.out.println(m3.title); //716361
//		System.out.println(m2.title); //6ff3c5b5
//		System.out.println(m1.title); //3764951d
		//System.out.println(c1);
		//System.out.println(m2);
		//System.out.println(m1);
		System.out.println(c2);
		System.out.println(c1);
		
		//System.out.println(m3);
		/*
		 *  test.MovieVO@6ff3c5b5
			test.MovieVO@3764951d
			test.MovieVO@4b1210ee
		 * 
		 * 
		 */
	} 

}