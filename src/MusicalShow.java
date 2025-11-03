import java.util.ArrayList;

public class MusicalShow extends Show {
    private String musicAuthor;
    private String librettoText;

    public MusicalShow(String title, int duration, Director director,
                       ArrayList<Actor> listOfActors, String musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;

        if(listOfActors != null) {
            for (Actor actor : listOfActors) {
                addActor(actor);
            }
        }
    }

    public void printLibretto() {
        if (librettoText == null || librettoText.isEmpty()) {
            System.out.println("Либретто отсутствует.");
        } else {
            System.out.println(librettoText);
        }
    }

    public void printMusicAuthor() {
        if (musicAuthor == null) {
            System.out.println("Автор музыки не назначен");
        } else {
            System.out.println(musicAuthor);
        }
    }

    //Ниже сеттеры гетеры
    public String getMusicAuthor() {
        return musicAuthor;
    }

    public void setMusicAuthor(String musicAuthor) {
        this.musicAuthor = musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public void setLibrettoText(String librettoText) {
        this.librettoText = librettoText;
    }
}

