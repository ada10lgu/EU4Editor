package data;

public class Setting extends Data {

	private String name;
	private String data;

	public Setting(String name, String data) {
		this.name = name;
		this.data = data;
	}

	@Override
	public String print(String tab) {
		return tab + name + "=" + data;
	}

}
