package Spectacle;

public class Scenario {
	private Integer idScenario;
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
	
	public Scenario showAllScenario() {
        return this;
    }

	public int getId() {
		return idScenario;
	}

	public void updateInfo(String titleScenario, String textScenario) {
		this.titleScenario = textScenario;
		this.textScenario = textScenario;
	}
}
