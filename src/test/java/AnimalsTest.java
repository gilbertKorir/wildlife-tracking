import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

class AnimalsTest {
    @BeforeEach
    public void before(){
        DB.sql2o = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker_test", "postgres", "1234");  //Those with linux or windows use two strings for username and password
    }
    //empty animals
    @AfterEach
    public void after(){
        try(Connection con = DB.sql2o.open()) {
            String deleteAnimalQuery="DELETE FROM animals ";
            con.createQuery(deleteAnimalQuery).executeUpdate();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    @Test
    public void testInstanceofAnimals_true(){
        Animals testAnimals = setUpAnimal();
        assertEquals(true, testAnimals instanceof Animals);
    }
    // check if saving
    @Test
    public void instanceSaved(){
        Animals testAnimals = setUpAnimal();
        testAnimals.save();
        assertTrue(Animals.all().get(0).equals(testAnimals));
    }

    //deleted
    @Test
    public void deleteById(){
        Animals testAnimals = setUpAnimal();
        testAnimals.save();
        testAnimals.delete();
        assertEquals(null, Animals.find(testAnimals.getId()));
    }



    //
    private Animals setUpAnimal() {
        return new Animals("deer", "endangered");
    }
}








