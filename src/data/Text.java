package data;

public class Text extends Data {

	private String text;
	
	public Text(String text) {
		this.text = text;
	}
	
	@Override
	public String print(String tab) {
		return tab + text;
	}
}
