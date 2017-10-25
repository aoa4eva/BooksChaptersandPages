package me.aoa4eva;

import java.util.ArrayList;

public class Chapter {
    private String title;
    ArrayList<Page> pages;

    public Chapter()
    {
        pages = new ArrayList<Page>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Page> getPages() {
        return pages;
    }

    public void setPages(ArrayList<Page> pages) {
        this.pages = pages;
    }

    public void addPage(Page aPage)
    {
        pages.add(aPage);
    }


}
