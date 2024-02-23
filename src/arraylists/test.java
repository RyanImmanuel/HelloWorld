package arraylists;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(3);
        al.add(3);
        al.add(3);

        for (Integer i:al){
            System.out.println(i);
        }
    }
}
