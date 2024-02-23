package exception;
import java.io.IOException;
public class Propogation {
    void m() throws IOException{
        int c = 10 + 20;
        throw new java.io.IOException("device error");
    }

    void n() throws IOException{
        m();
    }

    void p(){
        try{
            n();
        }catch(Exception e){System.out.println("exception handeled");}
    }
    public static void main(String args[]){
        Propogation obj=new Propogation();
        obj.p();
        System.out.println("normal flow");
    }
}

