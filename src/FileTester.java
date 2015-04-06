import java.io.FileNotFoundException;

import reader.EU4Reader;
import data.Root;
import files.Folder;

public class FileTester {
	public static void main(String[] args) throws FileNotFoundException {

		EU4Reader r = new EU4Reader(new Folder().listFiles()[1]);

		Root root = r.create();

		System.out.println(root);
	}
}
