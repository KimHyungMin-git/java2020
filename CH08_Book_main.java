public class CH08_Book_main {
	public static void main(String[] args) {
		CH08_Book book= new CH08_Book("Simple Book");
		CH08_Science science= new CH08_Science("Hello Physics!", "ScienceWorld"); // Name, Publisher
		CH08_History history = new CH08_History("What Is history?", "E.H.Carr");// Name, Author
		book.print();
		science.print();
		history.print();}
	}

