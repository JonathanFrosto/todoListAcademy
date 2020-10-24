package com.goFurther.ToDo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.Instant;

@Entity
public class TodoItem {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="created_at")
    private final Instant created_at = Instant.now();

    @Column(name="content")
    private String content;

    @Column(name="is_done")
    private boolean done;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean getDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public int getId() {
        return id;
    }

    public Instant getCreated_at() {
        return created_at;
    }
}
