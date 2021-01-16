package Spectacle;

import java.time.LocalDate;
import java.util.List;
//import javax.management.AttributeNotFoundException;


public class Spectacle {
	private static int id = 0;
	private Integer idSpectacle;
	private String titleSpectacle;
	private String timetableSpectacle;
	private LocalDate dateSpectacle;
	static private List<Spectacle> spectacleList;
	public Transmission trans;
	public Integer numSeatsHall = 250;
	public String nameHall;
	
	public Spectacle(Integer idSpectacle, String titleSpectacle, String timetableSpectacle, LocalDate dateSpectacle) {
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
	
	public String getTimetableSpectacle() {
		return timetableSpectacle;
	}
	
	public LocalDate getDate() {
		return dateSpectacle;
	}
	
	static public Spectacle findSpectacle(String titleSpectacle) {
		for(Spectacle spectacle: spectacleList) {
			if(spectacle.getTitle().equals(titleSpectacle)) {
				return spectacle;
			}
		}
		return null;
	}
	/*
	public static Spectacle startTransmission(Transmission trans, Integer idSpectacle) throws AttributeNotFoundException {
		return trans.findById(idSpectacle).orElseThrow(() -> new AttributeNotFoundException("id spectacle: " + idSpectacle));
	}
	
	public Spectacle stopTransmission(Transmission trans, Integer idSpectacle) throws AttributeNotFoundException {
		return trans.findById(idSpectacle).orElseThrow(() -> new AttributeNotFoundException("id spectacle: " + idSpectacle));
	}
	*/
}
