package thisKeyWord;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestFileInputStream {

	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream("‪D:\\gitHub\\basicExercises\\basicExercises\\src\\file\\TestFileInputStream.java");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("error");
			System.exit(-1);
		}
	}

}
