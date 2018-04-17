package models;

public class Book {
    private String title;
    private Author author;
    private String publisher;
    private int yearOfPublishing;
    private float cost;

    public Book(String title, Author author, String publisher, int yearOfPublishing, float cost) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublishing = yearOfPublishing;
        this.cost = cost;
    }

    public Book(String title, String authorFirstName, String authorSecondName, String authorLastName, String publisher, int yearOfPublishing, float cost) {
        this.title = title;
        this.author = new Author(authorFirstName, authorSecondName, authorLastName);
        this.publisher = publisher;
        this.yearOfPublishing = yearOfPublishing;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
