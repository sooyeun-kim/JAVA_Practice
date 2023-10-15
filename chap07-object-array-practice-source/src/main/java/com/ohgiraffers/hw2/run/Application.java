package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        StudentDTO[] stu = new StudentDTO[10];

        Scanner sc = new Scanner(System.in);

        int i = 0;
        while (true) {
            System.out.print("학년 : ");
            int grade = sc.nextInt();
            System.out.print("반 : ");
            int classroom = sc.nextInt();
            sc.nextLine();
            System.out.print("이름 : ");
            String name = sc.nextLine();
            System.out.print("국어점수 : ");
            int kor = sc.nextInt();
            System.out.print("영어점수 : ");
            int eng = sc.nextInt();
            System.out.print("수학점수 : ");
            int math = sc.nextInt();

            stu[i] = new StudentDTO(grade, classroom, name, kor, eng, math);

            i++;

            System.out.print("계속 추가하시려면 'y', 멈추려면 'n'를 누르고 엔터를 치세요 : ");
            char ch = sc.next().charAt(0);
            if (ch == 'n' || ch == 'N') {
                break;
            }

        }

        for (int j = 0; j < stu.length; j++) {

            if (stu[j] == null) {
                break;
            }

            int sum = stu[j].getKor() + stu[j].getEng() + stu[j].getMath();

            System.out.println(stu[j].information() + ", 평균 = " + (sum / 3));


        }

    }
}
