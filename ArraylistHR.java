import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArraylistHR {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        List<List<Integer>> listoflist=new ArrayList<>();

        Scanner inp=new Scanner(System.in);

        int col=inp.nextInt();


        for(int i=0;i<col;i++){
           List<Integer> list=new ArrayList<>();
            int count=inp.nextInt();

           for(int j=0;j<count;j++ ){

              list.add(inp.nextInt());

           }
         listoflist.add(list);

        }
           int q=inp.nextInt();

        for(int a=0;a<q;a++){
            int x=inp.nextInt();
            int y=inp.nextInt();
            try{
                System.out.println(listoflist.get(x-1).get(y-1));
            }catch (Exception e){
                System.out.println("ERROR!");
            }
        }


    }
}
