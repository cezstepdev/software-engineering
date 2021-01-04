package Spectacle;

public class Scenario {
	private String titleScenario;
	private String textScenario;
	
	public Scenario(String titleScenario,String textScenario) {
		this.titleScenario = titleScenario;
		this.textScenario = textScenario;
	}
	
	public String getTitle() {
		return titleScenario;
	}
	
	public String getText() {
		return textScenario;
	}
}
