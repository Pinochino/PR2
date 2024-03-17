public class Book {
    private String Title;
    private String Subject;
    private String Authors;
    private int numberOfPages;

    public Book(String Title, String Subject, String Authors, int numberOfPages){
        this.numberOfPages = numberOfPages;
        this.Title = Title;
        this.Authors = Authors;
        this.Subject = Subject;
    }

    public Book() {

    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getAuthors() {
        return Authors;
    }

    public void setAuthors(String authors) {
        Authors = authors;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }


}
