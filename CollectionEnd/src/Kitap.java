import java.util.Comparator;

public class Kitap implements Comparable<Kitap> {
    private String name;
    private int page;

    public Kitap(String name, int page) {
        this.name = name;
        this.page = page;
    }

    public String getName() {
        return name;
    }

    public int getPage() {
        return page;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public int compareTo(Kitap other) {

   return this.name.compareTo(other.getName());

    }

}
