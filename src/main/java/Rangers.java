//import java.sql.Connection;
import java.util.List;
import org.sql2o.Connection;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
    public static List<Rangers> all(){
        try(Connection con = DB.sql2o.open()){
            String sql="SELECT * FROM rangers";
            return con.createQuery(sql)
                    .throwOnMappingFailure(false)
                    .executeAndFetch(Rangers.class);
        }
    }
    // save the ranger
    public void save(){
        try(Connection con = DB.sql2o.open()){
            String sql = "INSERT INTO rangers (name,badge_number,phone_number) VALUES (:name,:badge_number,:phone_number)";
            if(name.equals("")||badge_number.equals("")||phone_number.equals("")){
                throw new IllegalArgumentException("Check all the fields");
            }
            this.id = (int) con.createQuery(sql, true)
                    .addParameter("name", this.name)
                    .addParameter("badge_number", this.badge_number)
                    .addParameter("phone_number", this.phone_number)
                    .executeUpdate()
                    .getKey();
        }
    }
    public static Rangers find(int id){
        try(Connection con = DB.sql2o.open()){
            String sql = "SELECT * FROM rangers WHERE id=:id";
            return con.createQuery(sql)
                    .addParameter("id", id)
                    .executeAndFetchFirst(Rangers.class);
        }
    }
}














