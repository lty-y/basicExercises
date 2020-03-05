package thisKeyWord;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TestTransForm1 {

	public static void main(String[] args) {
		try {

			FileOutputStream outputStream = new FileOutputStream(
					new File("‪‪D:\\gitHub\\test.txt"));
			String string = "adfaflkjoihawef";
			outputStream.write(string.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
