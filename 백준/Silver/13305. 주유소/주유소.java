import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt() ; //N개의 도시
        
        int[] km = new int[N-1]; //도로 길이 단위
        int[] price = new int[N]; //도시별 주유 금액
        
        //왼쪽에서 가장 오른쪽 도시로 이동하는 최소의 비용
        
        for(int i=0; i<km.length; i++) {
        	//도로 길이 입력받음
        	km[i]=scanner.nextInt();
        }
        
       for(int i=0; i<N; i++) {
    	   //기름 값 입력 받음
    	   price[i]=scanner.nextInt();
       }
       
       int sum = 0;
       
       //처음 출발할 때 자동차에는 기름이 없어서 주유소에서 기름을 넣고 출발하여야 한다
       int min = price[0];
       
       for(int i=0; i<km.length; i++) {
    	   if(price[i]<min) {
    		   min=price[i];
    	   }
    	   sum += (min*km[i]);
       }
       System.out.println(sum);
	}
}