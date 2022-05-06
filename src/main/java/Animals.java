public class Animals implements DatabaseManagement {
    public String name;
    public String health;
    public String age;
    public String type;
    public int id;
    public static final String ANIMAL_TYPE = "normal";

    public Animals(String name, String type) {
        this.name = name;
        this.type = ANIMAL_TYPE;
        this.age = "";
        this.health = "";
    }

    public String getName() {
        return name;
    }

    public String getHealth() {
        return health;
    }

    public String getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }
}
