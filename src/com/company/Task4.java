package com.company;
import java.io.*;
import java.util.Scanner;

class DivideByZeroException extends Exception{

    public DivideByZeroException(){

    }
    @Override
    public String toString(){
        return "You cannot divide by zero";
    }
}
class GreaterNumException extends Exception{
    int p,q;
    public GreaterNumException(int p , int q){
        this.p =p;
        this.q =q;
    }
    @Override
    public String toString(){
        return q +" is greater than "+ p;
    }
}
class RemainderException extends Exception{
    int p,q;
    public RemainderException(int p , int q){
        this.p =p;
        this.q =q;
    }
    @Override
    public String toString(){
        return p +" / "+ q +" is not perfectly divisible";
    }
}

class Number {
    public static void NumberMethod(int p, int q) throws DivideByZeroException, GreaterNumException, RemainderException {
        try {
            if (q == 0) {
                throw new DivideByZeroException();
            } else if (q > p) {
                throw new GreaterNumException(p, q);
            } else if ((p % q) != 0) {
                throw new RemainderException(p, q);
            } else {
                System.out.println(p / q);
            }
        } catch (DivideByZeroException e) {
            System.out.println(e);
        } catch (GreaterNumException e) {
            System.out.println(e);
        } catch (RemainderException e) {
            System.out.println(e);
        }
    }
}
public class Task4 {

        public static void main(String[] args) throws DivideByZeroException, GreaterNumException, RemainderException {
            System.out.println("Enter your first integer");
            Scanner p = new Scanner(System.in);
            int first = p.nextInt();
            System.out.println("Enter your second integer");
            Scanner q = new Scanner(System.in);
            int second = q.nextInt();

            Number.NumberMethod(first, second);
        }


    }

