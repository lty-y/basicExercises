package thisKeyWord;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferStream2 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("‪‪‪C:\\Users\\63522\\Desktop\\qqq.txt"));
		BufferedReader br = new BufferedReader(new FileReader("‪C:\\Users\\63522\\Desktop\\qqq.txt"));
		String string = null;
		for (int i = 0; i <= 100; i++) {
			string = String.valueOf(Math.random());
			bw.write(string);
			bw.newLine();
		}
		bw.flush();
		while ((string = br.readLine()) != null) {
			System.out.println(string);
		}
		bw.close();
		br.close();
	}

}
