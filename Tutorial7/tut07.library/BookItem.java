public class BookItem extends Book {
    private  int dateOfPurchase;
    private int publicationDate;
    private int Price;
    private String Barcode;
    private BookFormat Format;
    private BookStatus Status;
    public BookItem(String Title, String Subject, String Authors, int dateOfPurchase, int publicationDate, int Price, BookStatus Status, String Barcode){
        super();
        this.Barcode = Barcode;
        this.Format = BookFormat.Newspaper;
        this.dateOfPurchase = dateOfPurchase;
        this.publicationDate = publicationDate;
        this.Price = Price;
        this.Status = BookStatus.Available;
    }

    public String getBarcode() {
        return Barcode;
    }

    public void setBarcode(String barcode) {
        Barcode = barcode;
    }

    public BookFormat getFormat() {
        return Format;
    }

    public void setFormat(BookFormat format) {
        Format = format;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        this.Price = price;
    }

    public int getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(int dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }

    public BookStatus getStatus() {
        return Status;
    }

    public void setStatus(BookStatus status) {
        this.Status = status;
    }
}
