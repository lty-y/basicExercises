package thisKeyWord;

import java.io.File;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		String separator = File.separator;
		String fileName = "myfile.txt";
		String directory = "mydir1" + separator + "mydir2";
		File file = new File(directory, fileName);
		if (file.exists()) {
			System.out.println("ファイル名  : " + file.getAbsolutePath());
			System.out.println("ファイル大小 : " + file.length());
		} else {
			//取得副路径，创建文件
			file.getParentFile().mkdirs();
			file.createNewFile();
		}

	}

}
