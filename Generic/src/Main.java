import Generic.Nullable;
import Generic.Test;

public class Main {
    public static void main(String[] args) {

        Nullable<Integer> a=new Nullable<>(10);

     //  a.run();
        Integer x=12;
        String s="Kerem";
        Double d=12.3;

       Test<Integer,String,Double> t=new Test(x,s,d);
       t.ShowInfo();

    }
}