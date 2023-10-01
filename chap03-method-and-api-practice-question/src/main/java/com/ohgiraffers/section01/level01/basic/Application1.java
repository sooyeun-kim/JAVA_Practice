package com.ohgiraffers.section01.level01.basic;

public class Application1 {

    /* 실행용 메소드*/
    public static void main(String[] args) {
        
        /* Calculater 클래스의 메소드를 호출해서 실행 */
        Calculator calc = new Calculator();
        calc.checkMethod();

        int first = 10;
        int second = 20;

        System.out.println(calc.sumTwoNumber(first, second));
        System.out.println(calc.multiTwoNumber(first, second));
        System.out.println(first + "과 " + second + "의 곱은 " + calc.multiTwoNumber2(first, second) + "입니다.");


    }
}
