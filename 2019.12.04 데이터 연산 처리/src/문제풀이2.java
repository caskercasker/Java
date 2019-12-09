import java.util.*;
public class 문제풀이2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor,eng,mat;
		double avg;
		String inputname = "";
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("이름 :");
		inputname = scan.nextLine();
		System.out.println("kor");
		kor = scan.nextInt();
		System.out.println("eng");
		eng = scan.nextInt();
		System.out.println("mat");
		mat = scan.nextInt();
		
		avg = (kor+eng+mat)/3.0;
		
		
		System.out.println("이름 : " +inputname);
		System.out.println("합계점수 : " + (kor+eng+mat));
		System.out.printf("평균점수 :%.1f",avg +"\n");
		
		
		
		
		
		
		int numOfApples = 138;
		int sizeOfBucket = 10;
		int numOfBucket = ((numOfApples%sizeOfBucket)>0? numOfApples/sizeOfBucket+1:numOfApples/sizeOfBucket);
		
		System.out.println("필요한 바구니의 수 : " + numOfBucket);
		
	}

}
