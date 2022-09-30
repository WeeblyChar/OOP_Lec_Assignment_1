/* 
 * Kelompok 10
 * AMSAL ANUGRAH | 2502048666
 * KEVIN LAURENT OKTAVIAN PUTRA | 2540123044
 * LOVINA ANABELLE CITRA | 2540121322
 * MATTHEW AVEL WILEM | 2201826632
 */


public class Assignment_1 {

	public static void main(String[] args) {
		//Nomor 1.1
		System.out.println("Nomor 1.1");
		System.out.println("Welcome to Java");
		System.out.println("Welcome to Computer Science");
		System.out.println("Programming is fun");
		System.out.println();
		
		//Nomor 1.2
		System.out.println("Nomor 1.2");
		int x = 0;
		while (x<5) {
			System.out.println("Welcome to Java");
			x++;
		}
		System.out.println();
		
		//Nomor 1.3
		//Cara 1
		System.out.println("Nomor 1.3");
		System.out.println("Cara 1");
		System.out.println("    J      A     V     V     A");
		System.out.println("    J     A A     V   V     A A");
		System.out.println("J   J    AAAAA     V V     AAAAA");
		System.out.println(" J J    A     A     V     A     A");
		System.out.println();
		
		//Cara 2
		System.out.println("Cara 2");
		for (int i=0; i<4; i++) {
			for(int j=0; j<=32; j++) {
				if((i<3 && j==4) || (i==2 && (j==0 || j==4)) || (i==3 && (j==1 || j==3))) {
					System.out.print("J");
				}else if ((i==0 && (j==11 || j==29)) || (i==1 && (j==10 || j==12 || j==28 || j==30)) || (i==2 && ((j>=9 && j<=13) || (j>=27 && j<=31))) || (i==3 && (j==8 || j==14 || j==26 || j==32))){
					System.out.print("A");
				}else if((i==0 && (j==17 || j==23)) || (i==1 && (j==18 || j==22)) || (i==2 && (j==19 || j==21)) || (i==3 && j==20)) {
					System.out.print("V");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		//Nomor 1.4
		System.out.println("Nomor 1.4");
		for (int i=0; i<5; i++) {
			if (i==0) {
				System.out.println("a    " + "a^2   " + "a^3");
			}else {
				System.out.printf("%-4d %-4d  %-4d\n", (i), (i*i), (i*i*i));				
			}
			
		}
		System.out.println();
		
		//Nomor 1.5
		System.out.println("Nomor 1.5");
	    System.out.println(((9.5 * 4.5) - (2.5 * 3)) / (45.5 - 3.5));
	    System.out.println();
	    
	    //Nomor 1.6
	    System.out.println("Nomor 1.6");
	    //Cara 1
	    System.out.println("Cara 1");
	    System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9);
		
	    //Cara 2
	    System.out.println("Cara 2");
	    int sum = 0 ;
	    for (int i=1; i<10; i++) {
	    	sum = sum + i;
	    }
	    System.out.println(sum + "\n");
		
	    //Nomor 1.7
	    System.out.println("Nomor 1.7");
	    double four = 4.0, Check = 0, sum1 = 1.0, sum2 = 1.0;
	    for (double div=3; div<=13; div++) {
	    	if(div<=11) {
		    	if(Check==0) {
		    		sum1 = sum1 - (double)(1/div);
		    		sum2 = sum2 - (double)(1/div);
		    		Check = 1;
		    	}else {
		    		sum1 = sum1 + (double)(1/div);
		    		sum2 = sum2 + (double)(1/div);
		    		Check = 0;
		    	}
	    	}else {
	    		sum2 = sum2 + (double)(1/div);
	    	}
	    	div++;
	    }
	    System.out.print("First result: " + four * sum1 + "\n");
	    System.out.print("Second result: " + four * sum2);
	    System.out.println("\n");
	    
	    //Nomor 1.8
	    System.out.println("Nomor 1.8");
	    double pi = 3.14, radius = 5.5;
	    double parameter = (double)2 * radius * pi;
	    double area = radius * radius * pi;
	    System.out.println("Perimeter= " + parameter);
	    System.out.println("Area= " + area);
	    System.out.println();
	    
	    //Nomor 1.9
	    System.out.println("Nomor 1.9");
	    double width = 4.5, height = 7.9;
	    System.out.println("Perimeter= " + (2*(width+height)));
	    System.out.println("Area= " + (width*height));
	    System.out.println();
	    
	    //Nomor 1.10
	    System.out.println("Nomor 1.10");
	    double distanceKM = 14.0, time = 45.5;
	    double distanceMile = (double)(distanceKM/1.6);
	    double hour = (double)(time/60);
	    System.out.println("Distance = " + distanceMile + " miles");
	    System.out.println("Time = " + hour + " hour");
	    System.out.println("Speed = " + (double)(distanceMile/hour) + " miles/hour");
	    System.out.println();
	    
	    //Nomor 1.11
	    System.out.println("Nomor 1.11");
	    float[] cases = {7, 13, 45};
	    int day = 3600*24, year = day*365, leap_year = day*366;
	    int population = 312032486;
	    double total_birth = 0, total_death = 0, total_NewImmigrant = 0;
	    double leap_year_birth, leap_year_death, leap_year_NewImmigrant;
	    
		// Code Includes Leap Year!
		// Kode Menghitung Tahun Kabisat!
	    for (int i=1; i<6; i++) {
	    	if(i%4==0) {
	    		leap_year_birth = (double)(leap_year)/cases[0];
		    	leap_year_death = (double)(leap_year)/cases[1];
		    	leap_year_NewImmigrant = (double)(leap_year)/cases[2];
		    	population = population + (int)leap_year_birth - (int)leap_year_death + (int)leap_year_NewImmigrant;
		    	
//		    	System.out.println("Estimated Total Births in year " + i + " = " + leap_year_birth); 
//		    	System.out.println("Estimated Total Deaths in year " + i + " = " + leap_year_death); 
//		    	System.out.println("Estimated Total New Immigrants in year " + i + " = " + leap_year_NewImmigrant); 
		    	System.out.println("Estimated Total Population in year " + i + " = " + population); 
		    }else {
		    	total_birth = (double)(year)/cases[0];
		    	total_death = (double)(year)/cases[1];
		    	total_NewImmigrant = (double)(year)/cases[2];
		    	population = population + (int)total_birth - (int)total_death + (int)total_NewImmigrant;
		    	
//		    	System.out.println("Estimated Total Births in year " + i + " = " + total_birth); 
//		    	System.out.println("Estimated Total Deaths in year " + i + " = " + total_death); 
//		    	System.out.println("Estimated Total New Immigrants in year " + i + " = " + total_NewImmigrant); 
		    	System.out.println("Estimated Total Population in year " + i + " = " + population); 
		    }
	    	

	    }
		System.out.println("PS: Calculation Also Includes Leap Year."); 
		System.out.println("PS: Perhitungan Juga Menghitung Tahun Kabisat.");
	    System.out.println(); 
	    
	    //Nomor 1.12
	    System.out.println("Nomor 1.12");
	    double dist = 24.0/1.6, time_2 = ((60.0*60.0)+(45.0*60.0)+35.0)/3600.0;
	    System.out.println("Distance = " + (float)dist + " kilometers");
	    System.out.println("Time = " + (float)time_2 + " hour");
	    System.out.println("Speed = " + (float)(dist/time_2) + " kilometers/hour");
	    System.out.println();
	    
	}	
}
