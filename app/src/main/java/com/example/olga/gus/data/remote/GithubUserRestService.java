package com.example.olga.gus.data.remote;

import com.example.olga.gus.data.remote.model.User;
import com.example.olga.gus.data.remote.model.UsersList;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by olga on 02.09.16.
 */
public interface GithubUserRestService {
    @GET("/search/users?per_page=2")
    Observable<UsersList> searchGithubUsers(@Query("q") String searchTerm);

    @GET("/users/{username}")
    Observable<User> getUser(@Path("username") String username);
}
