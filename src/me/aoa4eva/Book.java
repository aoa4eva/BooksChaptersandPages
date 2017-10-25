package me.aoa4eva;

import java.util.ArrayList;

public class Book {
    private String title;
    private ArrayList<Chapter> chapters;

    public Book()
    {
        chapters = new ArrayList<>();
    }

    public Book(String aTitle)
    {
        this.title=aTitle;
        chapters = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(ArrayList<Chapter> chapters) {
        this.chapters = chapters;
    }

    public void addChapter(Chapter aChapter)
    {
        chapters.add(aChapter);
    }
}
