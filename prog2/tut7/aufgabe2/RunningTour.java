package prog2.tut7.aufgabe2;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
public class RunningTour extends Tour {
	RunningShoes runningShoes;

	public RunningTour(String name, double lengthInKm, double elevationGainInM, List<WayPoint> wayPoints, RunningShoes runningShoes) {
		super(name, lengthInKm, elevationGainInM, wayPoints);
		this.runningShoes = runningShoes;
	}
}
