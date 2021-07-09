package com.intern.AUSF.ue;

import java.util.ArrayList;

public class _links {
    private ArrayList<String> link;
    private String href;

    public _links(ArrayList<String> link) {
        this.link = link;
    }

    public _links(String href) {
        this.href = href;
    }

    public ArrayList<String> getLink() {
        return link;
    }

    public void setLink(ArrayList<String> link) {
        this.link = link;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    @Override
    public String toString() {
        return "_links{" +
                "link=" + link +
                ", href='" + href + '\'' +
                '}';
    }
}
