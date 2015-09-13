package za.ca.cput.ngosa.designpatterns.structural.Composite;

import za.ca.cput.ngosa.designpatterns.structural.Composite.SongComponent;

/**
 * Created by User on 2015/03/10.
 */
public class Song extends SongComponent {

    String songName;
    String artistName;
    int yearelease;

    public Song(int yearelease, String songName, String artistName) {
        this.yearelease = yearelease;
        this.songName = songName;
        this.artistName = artistName;
    }


    public String getSongName() {
        return songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public int getYearelease() {
        return yearelease;
    }
}

