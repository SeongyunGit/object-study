package ch10.playlist.step1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Playlist {
    private List<Song> tracks = new ArrayList<>();
    private Map<String,String> singers =new HashMap<>();

    private void append(Song song) {
        getTracks().add(song);
        singers.put(song.getSinger(),song.getTitle());
    }

    public List<Song> getTracks() {
        return tracks;
    }

    public Map<String, String> getSingers() {
        return singers;
    }
}
