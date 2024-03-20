import java.awt.print.Book;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Kitap> list=new TreeSet<Kitap>();




          list.add(new Kitap("Kralların Yolu",450));
          list.add(new Kitap("Demir ALtın",665));
          list.add(new Kitap("Kızıl Yükseliş",443));
          list.add(new Kitap("Bilge Adamın Korkusu",1137));
          list.add(new Kitap("Kızıl Gökler Altında Kızıl Denizler",637));
          list.add(new Kitap("Rüzgarın Adı",741));

        System.out.println("Kitap adına göre sıralama##");
        System.out.println("###############");

          for(Kitap i: list){
              System.out.println(i.getName()+"|"+i.getPage());
          } System.out.println();
        System.out.println("##Sayfa sayısına göre sıralama##");
        System.out.println("###############");



        TreeSet<Kitap> listbypage=new TreeSet<>(new SayfaComparator());
        listbypage.addAll(list);
        for(Kitap i: listbypage){
            System.out.println(i.getPage()+"|"+i.getName());
        } System.out.println();
    }
}class SayfaComparator implements Comparator<Kitap> {
    @Override
    public int compare(Kitap kitap1, Kitap kitap2) {
        return kitap1.getPage() - kitap2.getPage();

    }
}