package com.ohgiraffers.operatorPractice;

public class Application2 {

    public static void main(String[] args) {

        /*
         * 임의의 정수 한개를 선언하고 해당 숫자가 13세 이하이면 어린이, 13세초과 ~ 19세 이하이면
         * 청소년, 19세 초과이면 성인이라고 출력되도록 작성하세요
         *
         * 19
         *
         * ------ 출력 결과 --------
         * 청소년
         * */

        int inum = 19;
        //String result1 =((13>=inum)? "어린이": (13 < inum <= 19)? "청소년" : (19<inum)? "성인");
        String result1 =(13>=inum)? "어린이" : "어린이 아니다";
        String result2 = (13 < inum)? "청소년" : "청소년 아니다";
        String result3 = (inum <= 19)? "청소년" : "청소년 아니다";
        String result4 = (19<inum)? "성인" : "성인 아니다";
        /////////////////////////////////////////////////////////////////////////////
        String result5 = (13>=inum  && 19<inum)? "어린이" : "어른";
        String result56= (13 < inum  && inum <= 19 )? "청소년" : "청소년";

        //////////////////////////////////////////////////////////////////////////////
        System.out.println(13>=inum  && 19<inum? "어린이" : "어른");
        System.out.println(13 < inum  && inum <= 19 ? "청소년" : "청소년");
        System.out.println(result2);


    }
}
