package com.company;
import java.util.Scanner;

public class AccountClass {

        String owner, accountNumber;
        int balance;
        Scanner input = new Scanner(System.in);

        public AccountClass(String owner, String accountNumber, int balance) {
            this.owner = owner;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public AccountClass() {

        }

        public String getOwner() {
            System.out.println("Enter your name");
            return owner=input.nextLine();
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }

        public String getAccountNumber() {
            System.out.println("Enter your account number");
            return accountNumber= String.valueOf(input.nextInt());
        }

        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public int getBalance() {
            System.out.println("Enter your balance");
            return balance= input.nextInt();
        }

        public void setBalance(int balance) {
            this.balance = balance;
        }


        public void print() {
            System.out.println( "Accountowner='" + this.getOwner() + '\'' +
                    ", accountNumber='" + this.getAccountNumber() + '\'' +
                    ", balance=" + this.getBalance());
        }
    }

    class MoneyTransferException extends Exception{

        @Override
        public String toString(){
            return "You have insufficient funds";
        }
    }
    public class Account {
        public static void main(String[] args) {
            AccountClass acc = new AccountClass();
            acc.print();
            Scanner input = new Scanner(System.in);
            System.out.println("Would like to make a transfer? yes/no");
            String choice = input.nextLine();
            if(choice.equals("yes")) {
                System.out.println("How much would you like to transfer?");
                int transfer = input.nextInt();
                try {
                    if (transfer > acc.balance) {
                        throw new MoneyTransferException();
                    } else {
                        int newBalance = acc.balance - transfer;
                        acc.balance = newBalance;
                        System.out.println("This is your new balance " + acc.balance);
                    }
                } catch (MoneyTransferException e) {
                    System.out.println(e);
                }
            }else {
                System.out.println("Happy saving");
            }
        }
    }

