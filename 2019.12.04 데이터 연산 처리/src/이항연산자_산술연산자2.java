import java.util.*; //Scanner => scanf
public class ���׿�����_���������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� => ���� ���� => ���� �Է� int a = 10
		/*
		 *  int a; //����
		 *  a=10 
		 *  
		 *  int a = 10; ����� ���ÿ� ���� ����
		 *  
		 *  �Է��� ���� �޾Ƽ� ����
		 *  ���� (����) => ������ ���� ����
		 *  
		 */
		/*
		int a=(int)(Math.random()*100)+1;
		//Math.random() => 0.0 ~ 0.99 ==> 0.0 ~ 99.0 =>  ������ 0.99 +1
		//1~100 ������ ����
		 System.out.println("a="+a);
		 
		 Scanner scan = new Scanner(System.in);
		 
		 // ���� �޸� �Ҵ� new   ������(�ʱ�ȭ)
		 // System.in =>  Ű���� �Է°��� �޴´�.
		 System.out.print("���� �Է�:");
		 int b = scan.nextInt(); //nextBoolean, nextDouble
		 System.out.println("b="+b);*/
		
		//��������� ==> +, /
		//����,����,����,������ �޾Ƽ� ���� ����� ���϶� => �Ҽ��� 2�ڸ� ���
		
		int kor,eng,math,sum;
		double avg;
		
		//�Է��� �� �ִ� ����� Ŭ������ ������ �´�.
		Scanner scan = new Scanner(System.in);
		System.out.print("��������:");
		kor = scan.nextInt();
		System.out.print("��������:");
		eng = scan.nextInt();
		System.out.print("��������:");
		math = scan.nextInt();
		
		// �������ϱ� 
		sum = kor + eng + math;
		//���
		avg = sum/3.0;
		//������
		System.out.println("��������:"+kor);
		System.out.println("��������:"+eng);
		System.out.println("��������:"+math);

		System.out.println("����:"+sum);

		System.out.printf("���:%.2f",avg);
		
	}

}
