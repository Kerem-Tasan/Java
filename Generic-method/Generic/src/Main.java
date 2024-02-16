public class Main {
    public static void main(String[] args) {
      String[] a={"Kerem","Tuğçe","Emir","Samet"};
      Integer[] b={12,16,65,24};
      Character[] c={'J','A','V','A'};

        System.out.println("Generic olmadan böyle yapardık.");

      for(String i:a){
          System.out.println(i);
      }

        for(Integer i:b){
            System.out.println(i);
        }

        for(Character i:c){
            System.out.println(i);
        }
        System.out.println("--------------------------------");
//Generic metodlar ile böyle yaparız.
        System.out.println("Generic metodlar ile böyle yaparız.");
       Print.printArray(a);
         Print.printArray(b);
         Print.printArray(c);


    }
}