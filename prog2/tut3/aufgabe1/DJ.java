package prog2.tut3.aufgabe1;

import java.util.*;
import java.util.stream.Collectors;

public class DJ {
	private Map<String, List<Music>> playlists;
	private final String name;

	DJ(String name) {
		playlists = new HashMap<>();
		this.name = name;
	}

	public boolean createEmptyPlaylist(String playlistName) {
		if (playlists.containsKey(playlistName)) return false;
		playlists.put(playlistName, new ArrayList<>());
		return true;
	}

	public boolean addMusicToPlaylist(String playlistName, Music music) {
		if (!playlists.containsKey(playlistName)) return false;
		playlists.get(playlistName).add(music);
		return true;
	}

	public List<Music> getAllUniqueSongsByInterpretFromPlaylist(Interpret interpret, String playlistName) {
		return playlists.get(playlistName).stream()
				.filter(m -> m.interpret().equals(interpret))
				.distinct()
				.toList();
	}

	public List<Music> getSongsByGenreSortedByBpmDesc(Genre genre, String playlistName) {
		return playlists.get(playlistName).stream()
				.filter(m -> m.genre().equals(genre))
				.sorted(Comparator.comparing(Music::bpm).reversed())
				.toList();
	}

	public double getAverageRatingFromMusicInPlaylist(String playlistName) {
		return playlists.get(playlistName).stream()
				.mapToDouble(Music::rating)
				.average()
				.orElseThrow(PlaylistEmptyException::new);
	}

	public Map<Genre, List<Music>> getMusicByGenreFromPlaylist(String playlistName) {
		return	playlists.get(playlistName).stream()
				.collect(Collectors.groupingBy(Music::genre));
	}


}
