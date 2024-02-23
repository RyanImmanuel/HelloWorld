package abstraction;

public class Wiring {
    public static void main(String[] args) {
        ISwitchBoardListener isbl = new Havells();
//        ISwitchBoardListener isbl = new Anchor();

        isbl.switchOne();
        isbl.switchTwo();
    }
}
