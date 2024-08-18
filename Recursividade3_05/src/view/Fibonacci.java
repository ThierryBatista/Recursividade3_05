package view;

import controller.FibonacciController;

public class Fibonacci
{
 public static void main(String Args[])
 {
 FibonacciController Fibon = new FibonacciController();
 int numero = 7;
 int fib = 1;
 int n1 = 1;
 int n2 = 1;
 int i = 0;

 fib = Fibon.RecFib(numero, fib, n1, n2, i);
 System.out.println(fib);
 }
}