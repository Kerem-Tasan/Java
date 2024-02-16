package Generic;

public class Test<T1,T2,T3>{
    private T1 OBJ1;
    private T2 OBJ2;
    private T3 OBJ3;

    public Test(T1 OBJ1, T2 OBJ2, T3 OBJ3) {
        this.OBJ1 = OBJ1;
        this.OBJ2 = OBJ2;
        this.OBJ3 = OBJ3;
    }

    public T1 getOBJ1() {
        return OBJ1;
    }

    public void setOBJ1(T1 OBJ1) {
        this.OBJ1 = OBJ1;
    }

    public T2 getOBJ2() {
        return OBJ2;
    }

    public void setOBJ2(T2 OBJ2) {
        this.OBJ2 = OBJ2;
    }

    public T3 getOBJ3() {
        return OBJ3;
    }

    public void setOBJ3(T3 OBJ3) {
        this.OBJ3 = OBJ3;
    }
    public void ShowInfo(){
        System.out.println("T1  : " + OBJ1 + " : " + this.OBJ1.getClass().getSimpleName() );
        System.out.println("T2  : " + OBJ2 + " : " + this.OBJ2.getClass().getSimpleName() );
        System.out.println("T3  : " + OBJ3 + " : " + this.OBJ3.getClass().getSimpleName() );
    }
}
