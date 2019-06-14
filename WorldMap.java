/******************************************************************************
 *  Compilation:  javac WorldMap.java
 *  Execution:    java WorldMap < input.txt
 *  Dependencies: StdDraw.java StdIn.java
 *  
 *
 *    Reads boundary information of a country (or other geographic entity) 
 *	 from standard input and plots the results to standard drawing.
 *	 A country consists of a set of regions (e.g., states, provinces, or other administrative divisions), 
 *	 each of which is described by a polygon
 *  % java WorldMap < USA.txt
 *
 *  Datafiles:    http://coursera.cs.princeton.edu/introcs/assignments/io/files/usa.txt
 *
 ******************************************************************************/
 
 public class WorldMap {
      public static void main (String [] args){
		
		int width = Integer.parseInt(args[0]);
		int height =Integer.parseInt(args[1]);
		
		StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);
	 
		while (!StdIn.isEmpty()) {
			
            String province = StdIn.readString();
			int n=StdIn.readInt();
			double[] x = new double[n];  
			double[] y = new double[n];
			
			for (int i=0; i<n; i++){
				x[i]=StdIn.readDouble();
				y[i]=StdIn.readDouble();
			}
			
            StdDraw.polygon(x, y);
        }
		 StdDraw.show();
	  }
 
 }