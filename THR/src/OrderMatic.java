public class OrderMatic implements Runnable{

    private int orderNo;
    private final Object LOCK = new Object();

    public OrderMatic(){ this.orderNo = 0;}

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public Object getLOCK() {
        return LOCK;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
        // İşlemlerde bir işlem devam ederken diğer işleme başladığımızda önceki işlem verilerine
        //ulaşamaması için yani 1 arttırdığımızda diğer veri için arttırılmış olmaması için
        // senkron işlemi uygulanır.
        //1. yöntem
//        synchronized (LOCK) {
//            this.orderNo++;
//            System.out.println(Thread.currentThread().getName() + ": Order no: " + this.orderNo);
//        }
 //2.yöntem
        increaseOrder();


    }
//Metoda synchronized ekleyebiliriz böylelikle işlemler sıralı çalışır.
    public synchronized void increaseOrder(){
        this.orderNo++;
        System.out.println(Thread.currentThread().getName() + ": Order no: " + this.orderNo);
    }



}
