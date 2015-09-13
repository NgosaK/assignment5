package za.ca.cput.ngosa.designpatterns.structural.Composite;

/**
 * Created by User on 2015/03/10.
 */
public abstract class SongComponent {

    public void addSong(SongComponent newSongComponent)
    {
        throw new UnsupportedOperationException();
    }

    public SongComponent getComponent(int componentIndex )
    {
        throw new UnsupportedOperationException();

    }

    public String getSong( )
    {
        throw new UnsupportedOperationException();
    }

    public String getSongArtist()
    {
        throw new UnsupportedOperationException();
    }

}

