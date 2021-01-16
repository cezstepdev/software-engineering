package Spectacle;

//import java.util.List;
//import java.util.Optional;

public interface Transmission {
	/*
	Optional<Spectacle> startTransmission(Spectacle idSpectacle);
	Optional<Spectacle> stopTransmission(Spectacle idSpectacle);
	Optional<Spectacle> findById(Integer idSpectacle);
	*/
	public Boolean startTransmission(Spectacle titleSpectacle);
	public Boolean stopTransmission(Spectacle titleSpectacle);
	public Boolean pausetTransmission(Spectacle titleSpectacle);
}