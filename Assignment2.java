/* Starting code for Assignment 2
 * Student: Richard Jean-Baptiste
 * CISC 3115
 * Brooklyn College
*/

class BookObj 
{

    private String title,author,publisher;
    private int copiesSold;

    // create book object
    public BookObj(String title, String author, String publisher, int copiesSold)
    {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.copiesSold = copiesSold;
    }
    // get book title
    public String getTitle()
    {
        return title;
    }
    // get book author
    public String getAuthor()
    {
        return author;
    }
    // get book publisher
    public String getPublisher()
    {
        return publisher;
    }
    // get number of copies sold
    public int getCopiesSold()
    {
        return copiesSold;
    }

    // method to set book title
    void setTitle(String newTitle)
    {
        title = newTitle;
    }

    // method to set book author
    void setAuthor(String newAuthor)
    {
        author = newAuthor;
    }

    // method to set book publisher
    void setPublisher(String newPublisher)
    {
        publisher = newPublisher;
    }
    // set copies sold
    void setCopiesSold(int newCopiesSold)
    {
        copiesSold = newCopiesSold;
    }
}

class Book{
    public static void main(String[] args)
    {
        BookObj book1 = new BookObj("abc","rich","print",5);

        System.out.println(book1.getTitle()+ " " + book1.getAuthor() + " " + book1.getPublisher() + " " + book1.getCopiesSold());

        book1.setTitle("def");
        book1.setAuthor("jean");
        book1.setPublisher("press");
        book1.setCopiesSold(10);

        System.out.println(book1.getTitle()+ " " + book1.getAuthor() + " " + book1.getPublisher() + " " + book1.getCopiesSold());
    }
}
