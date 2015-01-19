package ba.bitcamp.Benjo.exercise.StreamsReadersAndWriters;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Streams {

	public static void main(String[] args) {
		
		InputStream dis  =  new DataInputStream(System.in);
		Reader read = new InputStreamReader(System.in);
		BufferedInputStream  bis = new BufferedInputStream(dis);
		dis.markSupported();
		
		try {
			dis.reset();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		byte [] buffer = new byte[4];
		
		int numByteReads;
		
		try {
			while ( (numByteReads = dis.read(buffer)) >= 0){
				System.out.println("Procili ste byte "+ numByteReads + "\n" + new String(buffer));

//				buffer =  new byte [buffer.length];
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
