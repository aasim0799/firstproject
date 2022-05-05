package com.company.oopss;

 public  class abstractclass {

     abstract static class bike {
         abstract void run();
     }
    static  class honda extends bike{
         void run(){
             System.out.println("running bike");
         }
     }

     public static void main(String[] args) {
         bike rrr=new honda();
         rrr.run();
     }
 }