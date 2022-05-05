package com.company.oopss;

public class encapsul {
//     int value;
      private int value;
    public void setValue(int x) {
        value=x;
    }
    public int getValue(){
        return value;
    }
}
   class B {
       public static void main(String[] args) {
           encapsul as=new encapsul();
//           as.value=12;
           as.setValue(12);
           System.out.println(as.getValue());
//           System.out.println(as.value);
       }
   }
