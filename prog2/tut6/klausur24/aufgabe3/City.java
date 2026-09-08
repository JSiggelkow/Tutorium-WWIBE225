package prog2.tut6.klausur24.aufgabe3;

import java.util.List;

public record City(String name, double areaInKm2, int inhabitants, GeoLocation geoLocation, Major major, List<String> pointsOfInterests) {
}
