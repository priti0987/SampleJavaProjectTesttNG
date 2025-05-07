package org.example;

public class may_7 {
    public class Cal{
        public static void sum(int a ,int b){
            System.out.println(a+b);

        }
        public static void sum(int a ,int b,int c){
            System.out.println(a+b+c);
        }

        public static void main(String[] args) {
            Cal.sum(5,2);
            Cal.sum(8,4,1);
        }
    }
}
