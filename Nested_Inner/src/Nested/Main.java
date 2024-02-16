package Nested;

public class Main {
    public static void main(String[] args) {
/* Non-static inner sınıflar
        Out o=new Out();

       o.run();

        Out o=new Out();
        Out.In in=o.new In();
             */
     /*       Out o=new Out();
             Out.In inNesnesi= o.getIn();
             inNesnesi.run();
*/
//Static inner sınıflar

       

 Out o =new Out();
 Out.In.run();


    }
}
