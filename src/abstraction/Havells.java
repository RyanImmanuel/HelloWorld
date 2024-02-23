package abstraction;

public class Havells implements ISwitchBoardListener{
    @Override
    public void switchOne(){
        System.out.println("havells fan on");
    };

    @Override
    public void switchTwo(){
        System.out.println("havells AC on");
    };
}
