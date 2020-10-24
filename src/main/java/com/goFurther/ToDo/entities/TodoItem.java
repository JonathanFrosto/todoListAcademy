package com.goFurther.ToDo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.Instant;
import java.time.LocalDate;

@Entity
public class TodoItem {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="created_at")
    private Instant created_at = Instant.now();

    @Column(name="content")
    private String content;

    @Column(name="is_done")
    private boolean isDone;

    public Instant getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Instant created_at) {
        this.created_at = created_at;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
