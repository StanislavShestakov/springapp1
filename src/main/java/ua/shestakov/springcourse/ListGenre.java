package ua.shestakov.springcourse;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListGenre {
    private List<Music> listGenre;

    ListGenre(Music ... music){
        this.listGenre = new ArrayList<>(Arrays.asList(music));
    }
    ListGenre(List<Music> listGenre){
        this.listGenre = listGenre;
    }


    public List<Music> getListGenre() {
        return listGenre;
    }
}
