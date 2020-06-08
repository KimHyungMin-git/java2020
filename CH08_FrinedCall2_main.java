public class CH08_FriendCall_main2 {
	public static void main(String[] args) {
		CH08_Book book= new CH08_Book("Simple Book");
		CH08_Science science= new CH08_Science("Hello Physics!", "ScienceWorld");// Name, Publisher
		CH08_History history1= new CH08_History("What Is history?", "E.H.Carr");//Name, Author
		CH08_History history2= new CH08_History("What Is history? ver 2", "E.H.Carr");//Name, Author
		book.print();
		science.print();
		history1.print();
		history2.print();}
	}

