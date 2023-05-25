import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double scoreSum = 0; //학점의 합계
		double scoreAvg = 0; //학점 * 과목평점
		
		for(int i=0; i<20; i++) {
			
			String subject = scanner.next();//과목명
			double score = scanner.nextDouble();//학점
			String grade = scanner.next();//등급
			
		
            if (grade.equals("A+")){
                scoreAvg += score*4.5;
                scoreSum += score;
            }if (grade.equals("A0")) {
                scoreAvg += score*4.0;
                scoreSum += score;
            }if (grade.equals("B+")) {
                scoreAvg += score*3.5;
                scoreSum += score;
            }if (grade.equals("B0")) {
                scoreAvg += score*3.0;
                scoreSum += score;
            }if (grade.equals("C+")) {
                scoreAvg += score*2.5;
                scoreSum += score;
            }if (grade.equals("C0")) {
                scoreAvg += score*2.0;
                scoreSum += score;
            }if (grade.equals("D+")) {
                scoreAvg += score*1.5;
                scoreSum += score;
            }if (grade.equals("D0")) {
                scoreAvg += score*1.0;
                scoreSum += score;
            }if (grade.equals("F")) {
                scoreAvg += score*0.0;
                scoreSum += score;
            }
		}
		
		// (학점 * 과목 평점) / 총 학점 = 전공 평점
		System.out.printf("%.6f",scoreAvg/scoreSum);
	}
}