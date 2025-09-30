public class PlayerLinkedList {
    private PlayerNode head;
    private int count;

    public void addToFront(Player player) {
        PlayerNode newNode = new PlayerNode(player);
        newNode.setNextPlayerNode(head);
        head = newNode;
        count++;
    }

    public void printLinkedList() {
        System.out.print("[Head] ->");
        PlayerNode current = head;

        while (current != null) {
            System.out.print(current.getPlayer() +  " -> ");
            current = current.getNextPlayerNode();
        }

        System.out.print("NULL");
    }

    public void removeFirst() {
        if (head != null) {
            head = head.getNextPlayerNode();
            count--;
        }
    }

    public void countLinkedList() {
        System.out.print("\n" + count + "\n");
    }

    public boolean containsLinkedList(Player player) {
        PlayerNode current = head;
        while (current != null) {
            if (current.getPlayer().equals(player)){
                return true;
            }
            current = current.getNextPlayerNode();
        }
        return false;
    }

    public int indexOfPlayer(Player player) {
        PlayerNode current = head;
        int index = 0;
        while (current != null) {
            if (current.getPlayer().equals(player)){
                return index;
            }
            current = current.getNextPlayerNode();
            index++;
        }
        return -1;
    }
}

