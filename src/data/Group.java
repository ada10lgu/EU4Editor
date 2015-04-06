package data;


public class Group extends Root {
	private String name;

	public Group(String name) {
		super();
		this.name = name;
	}

	@Override
	public String print(String tab) {
		StringBuilder sb = new StringBuilder();
		sb.append(tab).append(name).append("=").append(NL);
		sb.append(tab).append("{").append(NL);
		sb.append(super.print(tab + "\t"));
		sb.append(tab).append("}");
		return sb.toString();
	}

}
