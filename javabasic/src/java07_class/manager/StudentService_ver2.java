package java07_class.manager;

import java.util.Scanner;
/*
 * 
�߰�   - ���° �л��� �������� �Է¹ޱ�
      getIdx()

����   - ���� ���� 1�� �Է�
      insertInfo()
�߰�   - ���� ���� 1�� �Է�(����)
      insertInfoIdx()

     ����)   insertInfoIdx() {
        int idx = getIdx();
        insertInfo(stuArr[idx], idx);
      }
�߰�   - ���� ���� 3�� �Է�(�������)
      insertInfoAll()

����   - ���� 1�� �Է�
      insertScore()
�߰�   - ���� 1�� �Է�(����)
      insertScoreIdx()
     ����)   insertScoreIdx() {
        int idx = getIdx();
        insertScore(stuArr[idx], idx);
      }
�߰�   - ���� 3�� �Է�(�������)
      insertScoreAll()

�߰�   - ����+���� 1�� �Է�(����)
      insertStu()
�߰�   - ����+���� 3�� �Է�(�������)
      insertStuAll()

����   - �л� ��� 1��(����)
      printStuIdx()
�߰�   - �л� ��� 3��(�������)
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
      System.out.print("���° �л� : ");
      int num = sc.nextInt();
      return num;
   }
   
   private void insertInfo(Student i, int num) {
      System.out.println("++"+(num)+"��° �л� ���� �Է�++");
      System.out.print("�̸��� �Է��ϼ��� : ");
      String name = this.sc.next();
      i.setName(name);
      System.out.print("���̸� �Է��ϼ��� : ");
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
      System.out.println("++"+(num)+"��° �л� ���� �Է�++");
       System.out.print("���� �Է��ϼ��� : ");
       int kor = this.sc.nextInt();
       i.setKor(kor);
       System.out.print("���� �Է��ϼ��� : ");
       int Eng = this.sc.nextInt();
       i.setEng(Eng);
       System.out.print("���� �Է��ϼ��� : ");
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
      System.out.println("++ "+num+"�л� ��� ++");
      System.out.println("�̸� : "+i.getName());
      System.out.println("���� : "+i.getAge());
      System.out.println("Kor : "+i.getKor());
      System.out.println("Eng : "+i.getEng());
      System.out.println("Math : "+i.getMath());      
      System.out.println("���� : "+i.getSum());      
      System.out.printf("��� : %.2f",i.getAvg());
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