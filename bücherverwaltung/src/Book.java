// (c) Stix Daniel
public class Book
{
    private String author;
    private String title;
    private String issue;


    // Konstruktor

    public Book(String author, String title, String issue)
    {
        this.author = author;
        this.title = title;
        this.issue = issue;
    }

    // Getter & Setter Methoden

    public String getAuthor() { return author; }

    public void setAuthor(String author) { this.author = author; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getIssue() { return issue; }

    public void setIssue(String issue) { this.issue = issue; }


}