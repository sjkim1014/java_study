package java06_array.array2D;

import java.util.Scanner;

public class Array2DEx_03 {
	public static void main(String[] args) {
		//1~3학년
		//2개반
		//4명의학생
		//3과목 점수
//		int[][][][] score = new int[3][2][4][3]; //72개의 int
//		
//		int[][][] sco1=new int[2][4][3];
//		int[][][] sco2=new int[2][4][3];
//		int[][][] sco3=new int[2][4][3];
		
		int[][] sco=new int[2][3];
		int[] sum=new int[2];
		double[] avg=new double[2];
		String[] subject = {"국어","수학","영어"};
		Scanner sc=new Scanner(System.in);		
		
		for(int i=0; i<sco.length; i++) {
			System.out.println((i+1)+"학생 성적입력");
			for(int j=0; j<sco[i].length; j++) {				
				System.out.print(subject[j]+" : ");
				sco[i][j]=sc.nextInt();
				sum[i]+=sco[i][j];
				avg[i]=sum[i]/3.0;
			}
		}
		System.out.println("번호\t국어\t수학\t영어\t총점\t평균\t");
		for(int i=0; i<sco.length; i++) {
			System.out.print(i+"번호\t");
			for(int j=0; j<sco[i].length; j++) {
				System.out.print(sco[i][j]+"\t");
			}
			System.out.print(sum[i]+"\t");
			System.out.printf("%.2f\n",avg[i]);
		}
		
		
		
		
		
	}
}
