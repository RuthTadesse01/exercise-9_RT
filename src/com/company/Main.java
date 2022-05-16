package com.company;

class Method{
    static void nullPointer(){
        int y = (Integer)null;
        int x =6;
        int z = y+x;
        System.out.println(z);
    }
}

public class Main {


        public static void main(String[] args) {
            // write your code here
            try {
                Method.nullPointer();
            }catch(NullPointerException e){
                System.out.println("There's a null value");
                e.printStackTrace();
            }
        }
    }

