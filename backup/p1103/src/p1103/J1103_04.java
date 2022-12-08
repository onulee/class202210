package p1103;

public class J1103_04 {

	public static void main(String[] args) {
		int[] score = {100,88,91,95,90,85,77,93,80,65};
		// score배열의 모든 수의 합,평균 소수점2자리까지 구하시오.
		// int total, double avg
		// total = total + score[i]
		// avg = total/10.0
		// (힌트) 1개씩 값을 뽑아서 더하면 합이 구해짐.
		// (힌트) 합계에 개수를 나눔.
		int total = 0;
		double avg = 0;
		
		//배열 합계
		for(int i=0;i<score.length;i++) {
			total = total + score[i];
		}
		//배열 평균
		avg = total/(double)score.length;
		
		System.out.println("합계 : "+total);
		System.out.printf("평균 : %.2f \n",avg);
		
		

	}

}
