package book;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Method {
	List<Book> list = new ArrayList<Book>();

	public void add(Book book) {
		list.add(book);
	}

	public void update(String name, Double price) {
		for (Book book : list) {
			if (book.getName().equals(name)) {
				book.setPrice(price);
			}
		}
	}

	public void delete(int id) {
		for(Book book:list) {
			if(book.getId()==id) {
				list.remove(book);
			}
		}
	}

	public List<Book> showAll() {
		return list;
	}

	public Book query(int id) {
		for (Book book : list) {
			if (book.getId() == id) {
				return book;
			}
		}
		return null;
	}

	public Book query(String author) {
		for (Book book : list) {
			if (book.getAuthor().equals(author)) {
				return book;
			}
		}
		return null;
	}

	public void toCsv() throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream("D:\\book.csv");
		
		String title ="id,name,price,author\n";
		fileOutputStream.write(title.getBytes());
		List<Book> list = showAll();
		String textString= null;
		for (Book book : list) {
			textString =book.getId() + "," + book.getName() + "," + book.getPrice() + "," + book.getAuthor()+",\n";
			
			fileOutputStream.write(textString.getBytes());
		}
		fileOutputStream.close();
	}

}
