import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
/*
Book sınıfı kitap ismi, sayfa sayısı, yazarın ismi, yayın tarihi değişkenlerinden oluşmaktadır.

Book sınıfından 10 tane nesne üretip bunu bir ArrayList yapısında saklayınız. stream yapısını ve lambda ifadelerini kullanarak kitap isminin karşısında yazar ismi olacak şekilde yeni bir Map<String, String> oluşturacak şekilde yazınız.
        Bu 10 elemanlık Book listesinden sayfa sayısı 100'den fazla olan kitapları filtreleyen ve yeni bir liste olarak verecek geliştirmeyi yapınız. (Stream ve Lambda ifadeleri kullanabilirsiniz.)

*/

        ArrayList<Book> books = new ArrayList<>();
        books.add(Book.Kitap1);
        books.add(Book.Kitap2);
        books.add(Book.Kitap3);
        books.add(Book.Kitap4);

        books.stream().forEach(book -> System.out.println(book.getName()+" kitabını "+book.getAuthor()+" "+book.date()+" tarihinde yazmıştır\n.Kitap "+book.getPages()+". sayfa ile sonlanmıştır"));

        books.stream().forEach(book -> {
            System.out.println(book.getName()+" kitabını "+book.getAuthor()+" "+book.date()+" tarihinde yazmıştır\n.Kitap "+book.getPages()+". sayfa ile sonlanmıştır");

        });




    }
}