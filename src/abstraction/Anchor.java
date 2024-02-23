package abstraction;

public class Anchor implements ISwitchBoardListener{
    @Override
    public void switchOne(){
        System.out.println("Anchor fan on");
    };

    @Override
    public void switchTwo(){
        System.out.println("Anchor AC on");
    };
}
