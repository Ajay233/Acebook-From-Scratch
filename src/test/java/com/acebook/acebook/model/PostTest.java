package com.acebook.acebook.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class PostTest {

    private Post post = new Post("Some content");

    @Test
    public void postHasContent(){
        assertEquals(post.getContent(), "Some content");
    }

    @Test
    public void postHasNewContent(){
        post.setContent("Something new");
        assertEquals(post.getContent(), "Something new");
    }
}