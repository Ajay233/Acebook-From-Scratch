package com.acebook.acebook.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Post {

    private @Id @GeneratedValue long postID;
    private String content;

    private Post() {}

    public Post(String content) {
        this.content = content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getPostID() {
        return postID;
    }

    public String getContent() {
        return content;
    }



}
