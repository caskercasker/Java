import java.util.*;
public class ����Ǯ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money = 65430;
		int man = money/10000;
		int thou = (money%10000)/1000;
		int hund = (money%1000)/100;
		int ten = (money%100)/10;
		
		int sum = man + thou + hund + ten;
		
		System.out.println(sum);

		String s = 100+10.5+""+'A'+10f+100L;
		// "110.5A10100"
		
		////////////////2
		int payment = 1500000;
		int add = 55000;
		
		System.out.println((int)((payment+add)-(payment*0.1)));
		System.out.println("2������ ��");
		
		
		
		/////////////////3
		String name = "";
		String department = "";
		String position = "";
		int sal = 0;
		Scanner scan = new Scanner(System.in);
				
		System.out.println("�̸���?");
		name = scan.nextLine();
		System.out.printf("�μ���?");
		department = scan.nextLine();
		System.out.println("������?");
		position = scan.nextLine();
		System.out.println("�޿���?");
		sal = scan.nextInt();
		
		
		
		
		
		System.out.println("�̸� : "+ name);
		System.out.printf("�μ��� : "+ department + "\n");
		System.out.println("���� " + position + "\n" + "�޿���" + sal);
		
	}
}
