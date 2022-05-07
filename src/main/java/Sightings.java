//import java.sql.Connection;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import org.sql2o.Connection;

public class Sightings {
    private int animal_id;
    private int ranger_id;
    private int location_id;
    private int id;
    private Date date = new Date();
    private Timestamp time;

    // constructor
    public Sightings(int location_id, int ranger_id, int animal_id) {
        this.location_id = location_id;
        this.ranger_id = ranger_id;
        this.animal_id = animal_id;
        this.time = new Timestamp(date.getTime());
    }
    //getters


    public int getAnimal_id() {
        return animal_id;
    }

    public int getRanger_id() {
        return ranger_id;
    }

    public int getLocation_id() {
        return location_id;
    }

    public int getId() {
        return id;
    }
    public Timestamp getTime() {
        return time;
    }
    // list all the sites
    public static List<Sightings> all(){
        try(Connection con =DB.sql2o.open()){
            String sql = ("SELECT * FROM sightings");
            return  con.createQuery(sql)
                    .executeAndFetch(Sightings.class);
        }
    }

}















