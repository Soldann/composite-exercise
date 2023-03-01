package ca.uwaterloo.cs446.designpatterns.composite;

public class HiddenFile implements Component {
	private String name;

    @Override
	public String ls() {
		return "";
	}
}
