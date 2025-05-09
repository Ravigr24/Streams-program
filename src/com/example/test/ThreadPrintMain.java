package com.example.test;

/******************************************************************************

 Welcome to GDB Online.
 GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
 C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
 Code, Compile, Run and Debug online from anywhere in world.

 *******************************************************************************/
public class ThreadPrintMain
{
    public static void main(String[] args) {

        ThreadPrint print = new ThreadPrint();

        Thread t1 = new Thread(() -> print.printNumber(1), "THREAD-1");
        Thread t2 = new Thread(() -> print.printNumber(2), "THREAD-2");
        Thread t3 = new Thread(() -> print.printNumber(0), "THREAD-3");

        t1.start();
        t2.start();
        t3.start();

    }
}


class ThreadPrint{
    private int number =1;
    private int max =10;
    private int totalThread =3;

    public void printNumber(int res){
        synchronized(this){
            while(number<=max){

                while(number%totalThread != res){
                    try{
                        wait();
                    }catch (InterruptedException e){
                        Thread.currentThread().interrupt();
                    }
                }

                if(number>max){
                    break;
                }

                System.out.println(Thread.currentThread().getName() + ":" + number);
                number++;
                notifyAll();
            }
        }
    }
}