import java.util.*;
public class 문제풀이 {

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
		System.out.println("2번문제 끝");
		
		
		
		/////////////////3
		String name = "";
		String department = "";
		String position = "";
		int sal = 0;
		Scanner scan = new Scanner(System.in);
				
		System.out.println("이름은?");
		name = scan.nextLine();
		System.out.printf("부서는?");
		department = scan.nextLine();
		System.out.println("직위는?");
		position = scan.nextLine();
		System.out.println("급여는?");
		sal = scan.nextInt();
		
		
		
		
		
		System.out.println("이름 : "+ name);
		System.out.printf("부서는 : "+ department + "\n");
		System.out.println("직위 " + position + "\n" + "급여는" + sal);
		
	}
}
