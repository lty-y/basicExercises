package thisKeyWord;

import java.io.File;

public class FileList {

	public static void main(String[] args) {
		File file = new File("D:\\A");
		System.out.println(file.getName());
		tree(file, 1);
	}

	private static void tree(File f, int level) {
		String preSrtString = "";
		for (int i = 0; i < level; i++) {
			preSrtString += "    ";
		}
		File[] childs = f.listFiles();
		for (int i = 0; i < childs.length; i++) {
			System.out.println(preSrtString + childs[i].getName());
			if (childs[i].isDirectory()) {
				tree(childs[i], level+1);
			}
		}
	}

}