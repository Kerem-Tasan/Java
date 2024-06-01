import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list=new ArrayList<>();



        for (int i =1;i<=100;i++){

            list.add(i);


        }
        int numberOfThread=4;
        ExecutorService ex=Executors.newFixedThreadPool(numberOfThread);
        //part=25
      int part=list.size()/numberOfThread;

      //4 defa döner
      for(int j=0;j<numberOfThread;j++){
          //4 parçayı alır 1 2 3 4 diye
          int start=j*part;
         int end=(j==3)?list.size():(j+1)*part;

          List<Integer> sublist = list.subList(start, end);
      ex.execute(new isEven(sublist));

      }











    }
}