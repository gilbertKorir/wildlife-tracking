public class Rangers {
    private String name;
    private int id;
    private String phone_number;
    private String badge_number;

    public Rangers(String name, String phone_number, String badge_number) {
        this.name = name;
        this.phone_number = phone_number;
        this.badge_number = badge_number;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getBadge_number() {
        return badge_number;
    }
}
