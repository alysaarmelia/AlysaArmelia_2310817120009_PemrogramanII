package pemograman2_laprak;

import java.util.Scanner; 

public class PRAK102_2310817120009_AlysaArmelia {
	 public static void main(String[] args) { 
	        Scanner input = new Scanner(System.in); 
	        int angka = input.nextInt(); 
	         
	        int count = 0; 
	         
	        while (count <11){ 
	            if(count >0){ 
	                System.out.print(","); 
	            } 
	            if(angka % 5==0){ 
	                System.out.print(angka/5-1); 
	            } 
	            else { 
	                System.out.print(angka); 
	            } 
	            count ++; 
	            angka ++; 
	        } 
	    input.close(); 
	    } 
}