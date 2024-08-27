package song;

import java.util.Set;

public class Artist {
    private String artistName;
    private Set<String> songList;

    public Artist(String artistName, Set<String> songList) {
        this.artistName = artistName;
        this.songList = songList;
    }

    public String getArtistName() {
        return artistName;
    }

    public Set<String> getSongList() {
        return songList;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "artistName='" + artistName + '\'' +
                ", songList=" + songList +
                '}';
    }
}
