package thisKeyWord;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {

	public static void main(String[] args) throws IOException {
		int b = 0;
		FileInputStream in = new FileInputStream(
				"D:\\eclipse-workspace\\basicExercises\\src\\file\\TestFileOutputStream.java");
		FileOutputStream out = new FileOutputStream("D:\\\\eclipse-workspace\\\\basicExercises\\\\src\\\\file\\\\AAA.java");
		while ((b = in.read()) != -1) {
			out.write(b);
		}
		in.close();
		out.close();

	}

}
