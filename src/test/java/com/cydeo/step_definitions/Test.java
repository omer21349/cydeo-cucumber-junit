package com.cydeo.step_definitions;

public class Test {

    public static void main(String[] args) {

    int a=123;
    int b=a;
    int result=0;

    while (b>0){//3 +0 result=3; 2 +30 result=32  1+320
        result=b%10+10*result;//result=3 result=32 result=321
        b=b/10;//123/10 b=12 12/10= 1 b=1
    }
    System.out.println(result);







    }

}
