
public class ����Ǯ��3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfApples = 138;
		int sizeOfBucket = 10;
		int numOfBucket = ((numOfApples%sizeOfBucket)>0? numOfApples/sizeOfBucket+1:numOfApples/sizeOfBucket);
		
		System.out.println("�ʿ��� �ٱ����� �� : " + numOfBucket);
	}

}
