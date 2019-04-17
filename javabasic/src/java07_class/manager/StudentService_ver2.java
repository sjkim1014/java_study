package java07_class.manager;

import java.util.Scanner;
/*
 * 
추가   - 몇번째 학생을 선택할지 입력받기
      getIdx()

수정   - 인적 정보 1명 입력
      insertInfo()
추가   - 인적 정보 1명 입력(선택)
      insertInfoIdx()

     예시)   insertInfoIdx() {
        int idx = getIdx();
        insertInfo(stuArr[idx], idx);
      }
추가   - 인적 정보 3명 입력(순서대로)
      insertInfoAll()

수정   - 점수 1명 입력
      insertScore()
추가   - 점수 1명 입력(선택)
      insertScoreIdx()
     예시)   insertScoreIdx() {
        int idx = getIdx();
        insertScore(stuArr[idx], idx);
      }
추가   - 점수 3명 입력(순서대로)
      insertScoreAll()

추가   - 인적+점수 1명 입력(선택)
      insertStu()
추가   - 인적+점수 3명 입력(순서대로)
      insertStuAll()

수정   - 학생 출력 1명(선택)
      printStuIdx()
추가   - 학생 출력 3명(순서대로)
      printStuAll()
 * */
public class StudentService_ver2 {
   private Scanner sc = new Scanner(System.in);
   private Student[] stuArr = new Student[3]; 
   
   public StudentService_ver2() {
      for(int i = 0; i < this.stuArr.length; i++) {
         stuArr[i] = new Student();
       }
   }
   
   private int getIdx() {
      System.out.print("몇번째 학생 : ");
      int num = sc.nextInt();
      return num;
   }
   
   private void insertInfo(Student i, int num) {
      System.out.println("++"+(num)+"번째 학생 정보 입력++");
      System.out.print("이름을 입력하세요 : ");
      String name = this.sc.next();
      i.setName(name);
      System.out.print("나이를 입력하세요 : ");
      int age = this.sc.nextInt();
      i.setAge(age);
   }
   
   public void insertInfoAll() {      
      for(int num=0; num<stuArr.length; num++) {
         insertInfo(stuArr[num], num+1);
      }
      
   }
   
   public void insertInfoIdx() {
      int idx = getIdx();
      insertInfo(stuArr[idx-1], idx);      
   }
   
   private void insertScore(Student i, int num) {
      System.out.println("++"+(num)+"번째 학생 성적 입력++");
       System.out.print("국어 입력하세요 : ");
       int kor = this.sc.nextInt();
       i.setKor(kor);
       System.out.print("영어 입력하세요 : ");
       int Eng = this.sc.nextInt();
       i.setEng(Eng);
       System.out.print("수학 입력하세요 : ");
       int Math = this.sc.nextInt();
       i.setMath(Math);
       calcSum(i);
       calcAvg(i);
   }
   
   public void insertScoreAll() {
      for(int num=0; num<stuArr.length; num++) {
        insertScore(stuArr[num], num+1);
       }
   }
   
   public void insertScoreIdx() {
      int idx = getIdx();
      insertScore(stuArr[idx-1], idx); 
   }
   
   public void insertStu(int idx) {
      insertInfo(stuArr[idx-1], idx);
      insertScore(stuArr[idx-1], idx);
   }
   
   public void insertStuAll() {
      for(int num=0; num<stuArr.length; num++) {
        insertInfo(stuArr[num], num+1);
        insertScore(stuArr[num], num+1);
       }
   }
   
   private void calcSum(Student i) {
      i.setSum(i.getKor()+i.getEng()+i.getMath());
   }
   
   private void calcAvg(Student i) {
       i.setAvg(i.getSum()/3.0);
   }
   
   private void printStu(Student i, int num) {
      System.out.println("++ "+num+"학생 출력 ++");
      System.out.println("이름 : "+i.getName());
      System.out.println("나이 : "+i.getAge());
      System.out.println("Kor : "+i.getKor());
      System.out.println("Eng : "+i.getEng());
      System.out.println("Math : "+i.getMath());      
      System.out.println("총점 : "+i.getSum());      
      System.out.printf("평균 : %.2f",i.getAvg());
      System.out.println();
   }
   
   public void printStuAll() {
      for(int num=0; num<stuArr.length; num++) {
         printStu(stuArr[num], num+1);
      }
   }
   
   public void printStuIdx() {
      int idx = getIdx();
      printStu(stuArr[idx-1], idx);
   }
   
}