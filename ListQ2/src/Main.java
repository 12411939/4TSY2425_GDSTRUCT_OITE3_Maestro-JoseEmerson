//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {PlayerLinkedList playerLinkedList= new PlayerLinkedList();
        playerLinkedList.addToFront(new Player(1, "Saitama", 999));
        playerLinkedList.addToFront(new Player(2, "Jamal", 500));
        playerLinkedList.addToFront(new Player(3, "Goku", 100));

        playerLinkedList.removeFirst();
        playerLinkedList.printLinkedList();
        playerLinkedList.countLinkedList();

        System.out.println(playerLinkedList.containsLinkedList(new Player(1, "Saitama", 999)));
        System.out.println(playerLinkedList.indexOfPlayer(new Player(1,"Saitama", 999)));
    }
}