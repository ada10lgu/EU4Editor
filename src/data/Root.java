package data;

import java.util.ArrayList;

public class Root extends Data {
	private ArrayList<Data> data;

	public Root() {
		data = new ArrayList<>();
	}

	public void add(Data d) {
		data.add(d);
	}

	@Override
	public String print(String tab) {
		StringBuilder sb = new StringBuilder();
		for (Data d : data)
			sb.append(tab).append(d.print(tab)).append(NL);
		return sb.toString();
	}
	
	@Override
	public String toString() {
		return print("");
	}

}
