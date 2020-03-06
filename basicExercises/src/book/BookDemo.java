package book;

import java.io.IOException;

public class BookDemo {
//	private Map<Integer, Book> bookMap = new HashMap<>();

	public static void main(String[] args) throws IOException {
		Book book1 = new Book(1, "三国演义", 100D, "罗贯中");
		Book book2 = new Book(2, "西游记", 80D, "吴承恩");
		Book book3 = new Book(3, "红楼梦", 50D, "曹雪芹");
		Book book4 = new Book(4, "水浒传", 20D, "施耐庵");

		Method method = new Method();
		method.add(book1);
		method.add(book2);
		method.add(book3);
		method.add(book4);
		System.out.println(method.showAll());
		System.out.println();

		method.update("三国演义", 50D);
		System.out.println(method.showAll());
		System.out.println("!!!!!!!!");

		method.delete(3);
		System.out.println(method.showAll());
		System.out.println();

		System.out.println(method.query(1));
		System.out.println("---------");

		System.out.println(method.query("吴承恩"));
		System.out.println();

		System.out.println(method.showAll());
		
		method.toCsv();
	}

}
