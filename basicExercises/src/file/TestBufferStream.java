package thisKeyWord;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestBufferStream {

	public static void main(String[] args) throws IOException {
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("‪‪C:\\Users\\63522\\Desktop\\qqq.txt")));
		int c = 0;
		System.out.println(bis.read());
		bis.mark(100);
		for (int i = 0; i < 10 && (c = bis.read()) != -1; i++) {
			System.out.println(c + "  ");
		}
		bis.reset();
		for (int i = 0; i < 10 && (c = bis.read()) != -1; i++) {
			System.out.println(c + "  ");
		}
		bis.close();
	}

}
