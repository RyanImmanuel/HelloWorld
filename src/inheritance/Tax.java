package inheritance;

public class Tax {
    public double taxCalc(double salary){
        return salary*1.1;
    }

    public double taxCalcNew(double salary) {
        salary = taxCalc(salary);
        salary += 100;
        return salary;
    }

    public static void main(String args[]){
        Tax obj = new Tax();
        System.out.println(obj.taxCalcNew(1000));
    }
}
