package com.example.olga.gus.data.remote.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class UsersList {

    @SerializedName("total_count")
    @Expose
    private Integer totalCount;
    @SerializedName("items")
    @Expose
    private List<User> items = new ArrayList<User>();

    public UsersList() {

    }

    public UsersList(List<User> githubUsers) {
        this.items = githubUsers;
        this.totalCount = githubUsers.size();
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<User> getItems() {
        return items;
    }

    public void setItems(List<User> items) {
        this.items = items;
    }

}