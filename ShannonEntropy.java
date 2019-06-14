/******************************************************************************
 *  Compilation:  javac-introcs ShannonEntropy.java
 *  Execution:    java-introcs ShannonEntropy  < data.txt
 *  
 *  Takes a command-line integer m; reads a sequence of integers between 1 and m from standard input; 
 *  and prints the Shannon entropy to standard output, using 4 digits after the decimal point.
 *
 *  % java-introcs ShannonEntropy 2 < fair-coin.txt
 *   1.0
 *
 ******************************************************************************/



public class ShannonEntropy
{
 public static void main(String[] args)
 {
 double Entropy = 0.0; 
 
 while (!StdIn.isEmpty())
 {
 double x = StdIn.readDouble();
 Entropy = Entropy  - x*Math.log(x);
  }
 
	System.out.printf( "%.4f%n", Entropy);
  }
 }