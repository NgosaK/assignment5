package za.ca.cput.ngosa.designpatterns.structural.Composite; /**
 * Created by User on 2015/03/10.
 */

import za.ca.cput.ngosa.designpatterns.structural.Composite.SongComponent;

import java.util.ArrayList;
public class SongPlaylist extends SongComponent {

   private ArrayList<SongComponent> songs= new ArrayList<SongComponent>();

    private String Artist;
    private String ArtistDescription;


    public String getArtist() {
        return Artist;
    }

    public void setArtist(String artist) {
        Artist = artist;
    }

    public String getArtistDescription() {
        return ArtistDescription;
    }

    public void setArtistDescription(String artistDescription) {
        ArtistDescription = artistDescription;
    }

    public void addSong(SongComponent songComponent)
    {
        songs.add(songComponent);
    }

    public void removeSong(SongComponent songComponent)
    {
        songs.remove(songComponent);
    }

    public SongComponent getSong(int songIndex)
    {
       return  (SongComponent)songs.get(songIndex);
    }







}
