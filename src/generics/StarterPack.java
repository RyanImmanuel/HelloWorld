package generics;

public class StarterPack<T, U> {
    T obj1;
    U obj2;

    public StarterPack(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void print(){
        System.out.println(obj1 + " : " + obj2);
    }
}

class Main{
    public static void main(String[] args) {
        StarterPack<String, Integer> sp = new StarterPack<String, Integer>("Ryan", 21);
        sp.print();
    }
}
