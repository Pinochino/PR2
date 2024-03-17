public class BookLending {
    private int dueDate;
    private int returnDate;
    private Account person;
    private statusBookLending statusBook;
    public BookLending(BookStatus Status, Account person, int dueDate, int returnDate){
        this.person = person;
        this.dueDate = dueDate;
        this.returnDate = returnDate;
        this.statusBook = statusBookLending.Available;
    }

    public int getDueDate() {
        return dueDate;
    }

    public void setDueDate(int dueDate) {
        this.dueDate = dueDate;
    }

    public Account getPerson() {
        return person;
    }

    public void setPerson(Account person) {
        this.person = person;
    }

    public int getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(int returnDate) {
        this.returnDate = returnDate;
    }

    public statusBookLending getStatusBook() {
        return statusBook;
    }

    public void setStatusBook(statusBookLending statusBook) {
        this.statusBook = statusBook;
    }

}
