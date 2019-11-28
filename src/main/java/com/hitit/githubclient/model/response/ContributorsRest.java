package com.hitit.githubclient.model.response;

public class ContributorsRest {
    private int total;
    private Author author;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
