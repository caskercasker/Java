import java.util.*;
public class ����Ǯ��2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor,eng,mat;
		double avg;
		String inputname = "";
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("�̸� :");
		inputname = scan.nextLine();
		System.out.println("kor");
		kor = scan.nextInt();
		System.out.println("eng");
		eng = scan.nextInt();
		System.out.println("mat");
		mat = scan.nextInt();
		
		avg = (kor+eng+mat)/3.0;
		
		
		System.out.println("�̸� : " +inputname);
		System.out.println("�հ����� : " + (kor+eng+mat));
		System.out.printf("������� :%.1f",avg +"\n");
		
		
		
		
		
		
		int numOfApples = 138;
		int sizeOfBucket = 10;
		int numOfBucket = ((numOfApples%sizeOfBucket)>0? numOfApples/sizeOfBucket+1:numOfApples/sizeOfBucket);
		
		System.out.println("�ʿ��� �ٱ����� �� : " + numOfBucket);
		
	}

}
