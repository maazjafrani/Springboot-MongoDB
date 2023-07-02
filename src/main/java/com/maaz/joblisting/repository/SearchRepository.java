package com.maaz.joblisting.repository;

import com.maaz.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}
