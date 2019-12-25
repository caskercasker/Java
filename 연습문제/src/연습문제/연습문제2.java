package 연습문제;


class PlayingCard {
   int kind;
   int num;
   
   static int width;
   static int height;
   
   PlayingCard(int k, int n){
      kind = k;
      num = n;
      
   }
}
public class 연습문제2 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      PlayingCard card = new PlayingCard(1,1);
   }

}

/*
 * 클래스변수 (static 변수) : width, height;
 * 인스턴스 변수 : kind, num; 
 * 지역 변수 :  k, n , card
 * 
 * 
 */