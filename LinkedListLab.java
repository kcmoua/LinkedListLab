import java.util.LinkedList;

public class LinkedListLab {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        LinkedList<String> list2 = new LinkedList<String>();

        System.out.println(isItEmpty(list)); // method to check if the LinkedList is empty

        addNode(list, "Hello");
        System.out.println(list);

        System.out.println(makeEmpty(list));

        addNode(list, "Hello");
        addNode(list, "Keng");
        addNode(list, "Moua");
        printAList(list);

        removeAt(list, 2);
        System.out.println(list);

        addNode(list, "Keng");
        addNode(list, "Keng");
        addNode(list, "Hello");
        addNode(list, "Keng");
        // searchForRemove(list, "Keng");
        // System.out.println(list);

        addToHead(list, "Head");
        System.out.println(list);

        addAfterNode(list, 2, "Node");
        System.out.println(list);

        list2.add("List");
        list2.add("More");
        joinTwoList(list,list2);
        System.out.println(list);
        System.out.println(list2);

        printListReverse(list);
    }
    // 1
    public static boolean isItEmpty(LinkedList<String> list) {
        if(list.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
    // 2
    public static void addNode(LinkedList<String> list, String nodeData) {
        list.add(nodeData);
    }
    // 3
    public static String makeEmpty(LinkedList<String> list) {
        if(list.size() == 0) {
            return "The list is already empty.";
        } else {
            list.clear();
            return "The list was cleared.";
        }

    }
    // 4
    public static void printAList(LinkedList<String> list) {
        for(String index: list) {
            System.out.println(index);
        }
    }
    // 5
    public static void removeAt(LinkedList<String> list, int index) {
        list.remove(index);
    }
    // 6
    public static void searchForRemove(LinkedList<String> list, String word) {
        for(String index: list) {
            if(index.equals(word)) {
                list.remove(word);
            }
        }
    }
    // 7
    public static void addToHead(LinkedList<String> list, String word) {
        list.add(0, word);
    }
    // 8
    public static void addAfterNode(LinkedList<String> list, int index, String word) {
        list.add(index+1, word);
    }
    // 9
    public static void joinTwoList(LinkedList<String> list1, LinkedList<String> list2) {
        for(int i=0;i<list2.size();i++) {
            list1.add(list2.get(i));
            list2.remove(list2.get(i));
        }
    }
    // 10
    public static void printListReverse(LinkedList<String> list) {
        for(int i=list.size()-1;i>=0;i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}