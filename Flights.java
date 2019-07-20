import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Flights {

	private String flightId, airline, from, to, departure, arrival;
	
	public Flights(String flightId, String airline, String from, String to, String departure, String arrival)
	{
		this.flightId = flightId;
		this.airline = airline;
		this.from = from;
		this.to = to;
		this.departure = departure;
		this.arrival = arrival;
	}

	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
}
