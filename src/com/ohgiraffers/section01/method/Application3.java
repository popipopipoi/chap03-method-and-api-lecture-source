package com.ohgiraffers.section01.method;

public class Application3 {

    public static void main(String[] args) {
        /* 메소드 전달 인자(argument)와 매개변수(parameter)에 대해 이해하고 메소드 호출 시 사용할 수 있다.*/
        /* 1. 전달 인자로 값 전달 테스트
        * 호출하려는 메소드의 매개변수 선언부에 미리 선언해둔 자료형과, 갯수, 순서가 일치하게 값을 넣어 호출해야 한다. */
        Application3 app3 = new Application3();
        app3.testMethod(40); //(age:40) -> argument : 전달 인자
        // app3.testMethod("40"); int가 아니기때문에 오류
        // app3.testMethod(20, 30); 하나만 전달받기로 입력했는데 두개라서 오류
        // app3.testMethod(); 아무것도 없어도 오류

        /* 2. 변수에 저장한 값 전달 테스트*/
        int age = 20;
        app3.testMethod(age);

        /* 3. 자동 형변환을 이용한 값 전달 테스트 */
        byte byteAge = 10;
        app3.testMethod(byteAge);

    }
    public void testMethod(int age) {   // (int age) -> parameter : 매개변수
        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }
}
