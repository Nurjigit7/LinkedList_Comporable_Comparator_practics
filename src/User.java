import java.util.Comparator;

public class User {
    private int Id;
    private String name;
    private int age;

    public User() {
    }

    public User(int id, String name, int age) {
        Id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User : " +
                "Id : "+ Id +
                ", name : " + name +
                ", age : " + age +
                "";
    }
     static Comparator<User> getByName = new Comparator<User>() {
        @Override
        public int compare(User o1, User o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
    static Comparator<User> getGetById = new Comparator<User>() {
        @Override
        public int compare(User o1, User o2) {
            return o1.getId() - o2.getId();
        }
    };
    static Comparator<User>getGetGetByAge=new Comparator<User>() {
        @Override
        public int compare(User o1, User o2) {
            return o1.getAge()-o2.getAge();
        }
    };
}
