package com.company;

class Tasktwo{
    public static void dependant(int val){
        int array[]=new int[5];

        try{
            if(val==0){
                int p= 3/val;
            }else if (val==1){
                array[6]=6;
            }else {
                return;
            }
        }catch (ArithmeticException e){
            System.out.println("You can not divide by 0");
            return;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("That index does not exist");
        }finally {
            System.out.println("We are all good");
        }
    }
}
public class Task2 {

        public static void main(String[] args) {
            for(int i =0; i<3; i++){
                Tasktwo.dependant(i);
                System.out.println();
            }
        }
    }
