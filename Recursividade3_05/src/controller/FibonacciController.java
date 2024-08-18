package controller;

public class FibonacciController
{
 public FibonacciController()
 {
 super();
 }
 public int RecFib(int numero, int fib, int n1, int n2, int i)
 {
//caso o numero seja 1 ou 2, o resultado será automaticamente 1,
//caso contrário, até o contador se igualar ao número, o sistema irá realizar a somatória dos 2 últimos resultados da série e retirar o excesso 
  if (numero == 1 || numero == 2)
  {
  return 1;
  }
   else
   {
    if (i == numero)
     {
     return fib - n1;
     }
      else
      {
      n2 = n1 ;
      n1 = fib;
      fib = n1 + n2;
      return RecFib(numero, fib, n1, n2, i + 1);
      }
   }
 }
}