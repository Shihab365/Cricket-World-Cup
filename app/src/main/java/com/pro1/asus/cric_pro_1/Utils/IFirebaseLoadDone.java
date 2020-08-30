package com.pro1.asus.cric_pro_1.Utils;

import com.pro1.asus.cric_pro_1.Model.Movie;

import java.util.List;

public interface IFirebaseLoadDone {
    void onFirebaseLoadSuccess(List<Movie> movieList);
    void onFirebaseLoadFailed(String message);
}
