package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.vo.ProductDTO;

import java.util.Scanner;

public class ProductController {

    private ProductDTO[] pro = new ProductDTO[10];

    public static int count = 0;

    Scanner sc = new Scanner(System.in);

//    {
//        pro = new ProductDTO[10];
//    }

    public void mainMenu() {

        int no = 0;  // while에서 no 변수 쓰기 위해서 do 밖에서 선언 및 초기화 필요!!
        do {
            System.out.println("===== 제품 관리 메뉴 =====");
            System.out.println("1. 제품 정보 추가");
            System.out.println("2. 제품 전체 조회");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 선택 : ");
            no = sc.nextInt();

            switch (no) {
                case 1: productInput(); break;
                case 2: productPrint(); break;
                case 9:
                    System.out.println("프로그램을 종료합니다."); break;
                default:
                    System.out.println("잘못 입력하셨습니다. 메뉴에 있는 번호를 선택해주세요."); break;
            }
        } while (no != 9);
    }

    private void productInput() {

        System.out.println("제품 정보를 추가합니다.");
        System.out.print("제품 번호 : ");
        int pId = sc.nextInt();
        sc.nextLine();
        System.out.print("제품 이름 : ");
        String pName = sc.nextLine();
        System.out.print("제품 가격 : ");
        int price = sc.nextInt();
        System.out.print("제품 세금 : ");
        double tax = sc.nextDouble();

        pro[count] = new ProductDTO(pId, pName, price, tax);
    }

    private void productPrint() {

        for (int i = 0; i < count; i++) {
            System.out.println(pro[i].information());
        }
    }

}
