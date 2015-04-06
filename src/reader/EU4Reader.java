package reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import data.Group;
import data.Root;
import data.Setting;
import data.Text;

public class EU4Reader {

	private File f;

	public EU4Reader(File f) {
		this.f = f;
	}

	public Root create() throws FileNotFoundException {
		Scanner s = new Scanner(f);
		Root root = new Root();

		create(root, s);

		return root;
	}

	private void create(Root root, Scanner s) {

		while (s.hasNext()) {
			String line = s.nextLine().trim();
			if (line.equals("}"))
				return;
			int i = line.indexOf("=");

			if (i == -1) {
				root.add(new Text(line));
			} else {
				String[] temp = line.split("=");

				if (temp.length == 2) {
					root.add(new Setting(temp[0], temp[1]));
				} else {

					Group g = new Group(temp[0]);
					line = s.nextLine().trim();
					if (!line.equals("{"))
						throw new IllegalArgumentException(line);
					create(g, s);
					root.add(g);
				}
			}
		}
	}

}
