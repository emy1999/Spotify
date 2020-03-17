import java.util.List;
import java.io.*;


public class MusicFile {

    String trackName;
    String artistName;
    String albumInfo;
    String genre;
    byte[] musicFileExtract;

    MusicFile(String trackName,String artistName,String albumInfo,String genre,byte[] musicFileExtract){
        this.trackName = trackName;
        this.artistName =  artistName;
        this.albumInfo = albumInfo;
        this.genre = genre;
        this.musicFileExtract = musicFileExtract;
    }

    public void setTrackName(String trackName){
        this.trackName = trackName;
    }

    public void setAlbumInfo(String albumInfo) {
        this.albumInfo = albumInfo;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setMusicFileExtract(byte[] musicFileExtract) {
        this.musicFileExtract = musicFileExtract;
    }

    public String getTrackName() {
        return trackName;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getAlbumInfo() {
        return albumInfo;
    }

    public String getGenre() {
        return genre;
    }

    public byte[] getMusicFileExtract() {
        return musicFileExtract;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
