import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(8, "Nurjigit", 22);
        User user2 = new User(2, "Aidai", 18);
        User user3 = new User(3, "Pysbek", 25);
        User user4 = new User(4, "Aleriza", 19);
        User user5 = new User(9, "Ruslan", 26);
        User user6 = new User(6, "Begimai", 18);
        User user7 = new User(7, "Nurtegin", 17);
        User user8 = new User(1, "Nazgul", 27);
        LinkedList<User> userLinkedList = new LinkedList<>();
        userLinkedList.add(user1);
        userLinkedList.add(user2);
        userLinkedList.add(user3);
        userLinkedList.add(user5);
        userLinkedList.add(user4);

        userLinkedList.add(user6);
        userLinkedList.add(user7);
        userLinkedList.add(user8);
         //  userLinkedList.sort(User.getGetById);
          userLinkedList.sort(User.getByName);
       // userLinkedList.sort(User.getGetGetByAge);
        for (User user : userLinkedList) {
            System.out.println(user);

        }


    }
}