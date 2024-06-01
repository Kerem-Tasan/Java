import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class isEven implements Runnable {
    private final List<Integer> list;
    public boolean isRun=true;
//even çift odd tek sayılar için oluşturduğumuz arraylistlerdir.
    private ArrayList<Integer> even=new ArrayList<>();
    private ArrayList<Integer> odd=new ArrayList<>();


    public isEven(List<Integer> list){

this.list=list;
    }
    @Override
    public void run() {
        for (int number : list) {


            if(number%2==0){
                even.add(number);

            }
            else{
                odd.add(number);
            }
            Iterator<Integer> itEven= even.iterator();
            System.out.println("10000 e kadar olan tek sayılar");
            while(itEven.hasNext()){
                System.out.println(itEven.next()+"sayısını "+Thread.currentThread().getName()+". Threadimiz buldu.");
            }
            System.out.println("<><><><><><><><><><><>");
            Iterator<Integer> itOdd= odd.iterator();
            System.out.println("10000 e kadar olan çift sayılar");
            while(itOdd.hasNext()){
                System.out.println(itOdd.next()+"sayısını "+Thread.currentThread().getName()+". Threadimiz buldu.");
            }

           // System.out.println("Sayı işleniyor: " + number + " işleyen thread: " + Thread.currentThread().getName());



        }



    }


    public boolean isRun() {
        return isRun;
    }

    public void setRun(boolean run) {
        isRun = run;
    }
}
