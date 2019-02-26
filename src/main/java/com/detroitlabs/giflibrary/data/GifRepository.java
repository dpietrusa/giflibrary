package com.detroitlabs.giflibrary.data;

import com.detroitlabs.giflibrary.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {


    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("toobad", LocalDate.of(2019, 2, 23), "Erika Languirand", true, 10),
            new Gif("exhausting", LocalDate.of(2019, 2, 23), "Jen Bloomer", false, 10),
            new Gif("headtilt", LocalDate.of(2019, 2, 23), "Dan Newport", true, 12),
            new Gif("headtilt2", LocalDate.of(2019, 2, 23), "Matt of Lansing", false, 12),
            new Gif("hugemistake", LocalDate.of(2019, 2, 23), "Erika Languirand", true,10),
            new Gif("whatisaid", LocalDate.of(2019, 2, 23), "Dan Newport", true,10),
            new Gif("wow", LocalDate.of(2019, 2, 23), "David Pietrusa", false, 10),
            new Gif("Kanye", LocalDate.of(2019, 2, 23), "David Pietrusa", true, 11)
    );

    public Gif findByName(String name){
        for(Gif gif : ALL_GIFS) {
            if(gif.getName().equals(name)) {
                return gif;
            }
        }
        return null;
    }

    public List<Gif> returnFavorites(){
        List<Gif> favoriteList = new ArrayList<>();
        for(Gif gif : ALL_GIFS) {
            if(gif.isFavorite()) {
                favoriteList.add(gif);
            }
        }
        return favoriteList;
    }

    public List<Gif> returnAll(){
        return ALL_GIFS;
    }


    public List<Gif> findByCategoryId(int id) {
        List<Gif> gifCategory = new ArrayList<>();
        for(Gif gif : ALL_GIFS) {
            if(gif.getId() == id) {
                gifCategory.add(gif);
            }
        }return gifCategory;
    }


    public List<Gif> searchResults(String searchString) {
        List<Gif> searchList = new ArrayList<>();
        for(Gif gif: ALL_GIFS) {
            if(gif.getName().contains(searchString)) {
                searchList.add(gif);
            }
        }return searchList;
    }

}
