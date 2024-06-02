import java.util.Date;

public enum Book {
    Kitap1("Kralların Yolu",718,"08-09-2011","Brandon Sanderson"),
    Kitap2("Ay Bahçeleri",712,"15-04-2011","Steven Erikson"),
    Kitap3("Ölühane Kapıları",850,"16-05-2014","Steven Erikson"),
    Kitap4("OatBringer",816,"17-05-2020","Brandon Sanderson"),;



    private String name;
    private int pages;
  private String date;
  private String author;


    Book(String name, int pages, String  date, String author) {

        this.name = name;
        this.pages = pages;
        this.date = date;
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String date() {
        return date;
    }


}




