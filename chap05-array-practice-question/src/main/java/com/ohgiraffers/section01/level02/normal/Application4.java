package com.ohgiraffers.section01.level02.normal;

import java.util.Random;

public class Application4 {

    public static void main(String[] args) {

     /*
		  로또 번호 자동 생성기 프로그램을 작성하세요.
		  단, 중복 값 없이 오름차순으로 정렬하여 출력하세요.

		  Random 클래스 사용 혹은 Math.random() 메소드를 사용
	 */

        /* 번호 6개씩 5줄 출력 */
        int[] lotto = new int[6];
        Random r = new Random();

        for (int k = 0; k < 5; k++) {
            for (int i = 0; i < lotto.length; i++) {
                lotto[i] = r.nextInt(45) + 1;
                for (int j = 0; i < j; j++) {
                    if (lotto[i] == lotto[j]) {
                        i--;
                        break;
                    }
                }
            }

            for (int i = 1; i < lotto.length; i++) {

                for (int j = 0; j < i; j++) {

                    if (lotto[i] < lotto[j]) {
                        int temp;
                        temp = lotto[i];
                        lotto[i] = lotto[j];
                        lotto[j] = temp;
                    }
                }
            }

            for (int i = 0; i < lotto.length; i++) {

                System.out.print(lotto[i] + "  ");
            }
            System.out.println();
        }








        /* 번호 6개씩 5줄 출력 - 실패 */
//        int[][] arr = new int[5][6];
//        Random r = new Random();
//
//        for (int i = 0; i < arr.length; i++) {
//
//            for (int j = 0; j < arr[i].length; j++) {
//
//                arr[i][j] = r.nextInt(45) + 1;
//                for (int k = 0; k < j; k++) {
//                    if (arr[i][j] == arr[i][k]) {
//                        j--;
//                        if (i > 0) {
//                            i--;
//                        }
//                        break;
//                    }
//                }
//            }
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//
//            for (int j = 1; j < arr[i].length; j++) {
//
//                for (int k = 0; k < j; k++) {
//
//                    if (arr[i][j] < arr[i][k]) {
//                        int temp;
//                        temp = arr[i][j];
//                        arr[i][j] = arr[i][k];
//                        arr[i][k] = temp;
//                    }
//                }
//
//            }
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//
//            for (int j = 0; j < i; j++) {
//
//                System.out.print(arr[i][j] + " ");
//            }
//
//            System.out.println();
//        }


        /* 번호 6개 한 줄 출력 */
//        int[] lotto = new int[6];
//        Random r = new Random();
//
//        for (int i = 0; i < lotto.length; i++) {
//
//            lotto[i] = r.nextInt(45) + 1;
//
//            for (int j = 0; j < i; j++) {
//
//                if (lotto[i] == lotto[j]) {
//
//                    i--;
//                    break;
//                }
//
//                }
//            }
//
//        for (int i = 1; i < lotto.length; i++) {
//
//            for (int j = 0; j < i; j++) {
//
//                if (lotto[i] < lotto[j]) {
//                    int temp;
//                    temp = lotto[i];
//                    lotto[i] = lotto[j];
//                    lotto[j] = temp;
//                }
//            }
//        }
//
//        for (int i = 0; i < lotto.length; i++) {
//
//            System.out.print(lotto[i] + " ");
//        }

//    }
    }
}
