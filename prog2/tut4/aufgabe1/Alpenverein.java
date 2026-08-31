package prog2.tut4.aufgabe1;

import java.util.*;
import java.util.stream.Collectors;

public class Alpenverein {
    private Map<MountainGuide, List<Hike>> hikes;
    private final String name;

    public Alpenverein(String name) {
        this.name = name;
        hikes = new HashMap<>();
    }

    public boolean createNewMountainGuide(MountainGuide mountainGuide) {
        if (hikes.containsKey(mountainGuide)) return false;
        hikes.put(mountainGuide, new ArrayList<>());
        return true;
    }

    public boolean addHikeToMountainGuide(MountainGuide mountainGuide, Hike hike) {
        if (!hikes.containsKey(mountainGuide)) return false;
        hikes.get(mountainGuide).add(hike);
        return true;
    }

    public List<Hike> getHikesSortedByLengthFromMountainGuide(MountainGuide mountainGuide) {
        return hikes.get(mountainGuide).stream()
                .sorted(Comparator.comparing(Hike::lengthInM))
                .toList();
    }

    public List<Hike> getMountainsAbove3000FromMountainGuide(MountainGuide mountainGuide) {
        return hikes.get(mountainGuide).stream()
                .filter(h -> h.mountain().elevation() > 3000)
                .toList();
    }

    public OptionalDouble getAverageRatingFromMountainGuide(MountainGuide mountainGuide) {
        return hikes.get(mountainGuide).stream()
                .mapToDouble(Hike::rating)
                .average();
    }

    public List<Hike> getHikesSortedByElevationWithDifficultyT3FromMountainGuide(MountainGuide mountainGuide) {
        return hikes.get(mountainGuide).stream()
                .filter(h -> h.difficulty().equals(Difficulty.T3))
                .sorted(Comparator.comparing(Hike::elevationGainInM))
                .toList();
    }

    public List<Hike> getHikesWithMountainFromMountainGuide(MountainGuide mountainGuide, Mountain mountain) {
        return hikes.get(mountainGuide).stream()
                .filter(h -> h.mountain().equals(mountain))
                .toList();
    }

    public Map<Difficulty, List<Hike>> groupHikesByDifficultyFromMountainGuide(MountainGuide mountainGuide) {
        return hikes.get(mountainGuide).stream()
                .collect(Collectors.groupingBy(Hike::difficulty));
    }

}
