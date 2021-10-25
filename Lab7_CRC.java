import java.io.*;
import java.util.*;

class Lab7_CRC{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int [] data;
		int [] msg;
		int [] generator;
		int [] rem;
		int [] crc;
		int data_bits, generator_bits, tot_length;
		System.out.println("Enter number of data bits:");
		data_bits = s.nextInt();
		data = new int[data_bits];
		System.out.println("Enter data bits:");
		for(int i = 0; i<data_bits; i++)
			data[i] = s.nextInt();
		System.out.println("Enter number of bits in generator:");
		generator_bits = s.nextInt();
		generator = new int[generator_bits];
		System.out.println("Enter generator bits:");
		for(int i=0; i<generator_bits; i++)
			generator[i] = s.nextInt();
		tot_length = data_bits + generator_bits - 1;
		msg = new int[tot_length];
		rem = new int[tot_length];
		crc = new int[tot_length];
		
		// CRC Generation
		for(int i = 0; i<data.length; i++)
			msg[i] = data[i];
		System.out.println("Message after appending 0s is:");
		for(int i=0; i<msg.length; i++)
			System.out.print(msg[i]);
		System.out.println();
		for(int j=0; j<msg.length; j++)
			rem[j] = msg[j];
		rem = xor(generator, rem);
		for(int i=0; i<msg.length; i++)
			crc[i] = (msg[i]^rem[i]);		// appends message & remainder
		System.out.println();
		System.out.println("CRC code:");
		for(int i=0; i<crc.length; i++)
			System.out.print(crc[i]);
		System.out.println();
		
		//Error Detection
		System.out.println("Enter CRC code of " + tot_length + " bits:");
		for(int i=0; i<crc.length; i++)
			rem[i] = s.nextInt();
		rem = xor(generator, rem);
		for(int i=0; i<rem.length; i++){
			if(rem[i] != 0){
				System.out.println("Error!");
				break;
			}
			if(i == rem.length - 1)
				System.out.println("No Error");
		}
		System.out.println("Thank You...");
	}
	
	static int [] xor(int generator[], int rem[]){
		int cur = 0;
		while(true){
			for(int i=0; i<generator.length; i++)
				rem[cur+i] = (rem[cur+i]^generator[i]);
			while(rem[cur] == 0 && cur != rem.length-1)
				cur++;
			if((rem.length-cur)<generator.length)
				break;
			}
		return	rem;
	}
}	
