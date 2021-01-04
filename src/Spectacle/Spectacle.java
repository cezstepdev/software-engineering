package Spectacle;

import java.time.LocalDate;
import java.util.List;

public class Spectacle {
	private static int id = 0;
	private Integer idSpectacle;
	private String titleSpectacle;
	private String timetableSpectacle;
	private String dateSpectacle;
	private List<Spectacle> spectacleList;

	public Spectacle(Integer idSpectacle) {
		this.idSpectacle = idSpectacle;
	}
	public Spectacle(Integer idSpectacle, String titleSpectacle, String timetableSpectacle, String dateSpectacle) {
		id++;
		idSpectacle = id;
		this.idSpectacle = idSpectacle;
		this.titleSpectacle = titleSpectacle;
		this.timetableSpectacle = timetableSpectacle;
		this.dateSpectacle = dateSpectacle;
	}
	
	public Integer getId() {
		return idSpectacle;
	}
	
	public String getTitle() {
		return titleSpectacle;
	}
	
	public String viewSpectacleTimeTable() {
		return timetableSpectacle;
	}
	
	public String getDate() {
		return dateSpectacle;
	}
	
	public Spectacle findSpectacle() {
		for(Spectacle spectacle: spectacleList) {
			if(spectacle.getTitle().equals(titleSpectacle)) {
				return spectacle;
			}
		}
		return null;
	}
}
