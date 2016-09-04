package com.example.olga.gus.data;

import com.example.olga.gus.data.remote.model.User;

import java.util.List;

import rx.Observable;

/**
 * Created by olga on 02.09.16.
 */
public interface UserRepository {
    Observable<List<User>> searchUsers(final String searchTerm);
}
