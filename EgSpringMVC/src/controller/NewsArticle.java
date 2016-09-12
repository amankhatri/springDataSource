package controller;

import java.util.Date;

public class NewsArticle implements Comparable {

    private String id;
    private String title;
    private String author;
    private String summary;
    private String content;
    private Date date;

    public NewsArticle() {
        
    }

    public NewsArticle(String title, String author, Date date, String summary, String content ) {

        this.title = title;
        this.author = author;
        this.summary = summary;
        this.content = content;
        this.date = date;
    }

    public NewsArticle(String id, String title, String author, Date date, String summary, String content) {

        this.id = id;
        this.title = title;
        this.author = author;
        this.date = date;
        this.summary = summary;
        this.content = content;
    }

    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Sorts article by descending dates
     */
    public int compareTo(Object o) {
        
        // Comparing the other date to ours should order descending 
        int result = ( ( NewsArticle )o ).getDate().compareTo( date );
        if( result == 0 ) {
            // Ensure that we don't lose any articles that have the same date
            return 1;
        }
        return result;
    }
}
