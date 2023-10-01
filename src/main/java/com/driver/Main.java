package com.driver;

public class Main {

    public static void main(String[] args){
        B objB=new B();
        String ans=objB.meth();

        System.out.println(ans);
    }


    public static class A {
        public static String meth(){
            return "Invoking method from class A";
        }
    }
    public static class  B extends A{

        //@Override
        public static String meth(){
            return "Method is overridden in Extendend class B";
        }


    }

  
}