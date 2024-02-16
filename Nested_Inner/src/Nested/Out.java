package Nested;
//outer class
public class Out {
    public int a=5;


    //inner class start
    public static class In {
        public int a=10;

        public static void run(){
            System.out.println("İn sınıfına ait run metodu çalıştı!");
            int a=1;
            System.out.println(a);
          //  System.out.println(this.a);
        //    System.out.println(Out.this.a);

        }
    }   //inner class end


    public void run(){
In.run();

    }



    /*
    public In getIn(){

        return new In();
    }
*/
}
