import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.*;
//import static spark.Spark.staticFileLocation;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
        get("/", (request, response) ->{
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());
        // animal
        get("/create/animal", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "animal-form.hbs");
        }, new HandlebarsTemplateEngine());
        post("/create/animal/new",(request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String type = request.queryParams("type");
            System.out.println(type);
            String health = request.queryParams("health");
            System.out.println(health);
            String age = request.queryParams("age");
            System.out.println(age);
            String name = request.queryParams("name");
            System.out.println(name);
            if(type.equals(EndangeredAnimals.ANIMAL_TYPE)){
                EndangeredAnimals endangered=new EndangeredAnimals(name,EndangeredAnimals.ANIMAL_TYPE,health,age);
                endangered.save();
            }
            else {
                Animals animal=new Animals(name,Animals.ANIMAL_TYPE);
                animal.save();
            }
            return new ModelAndView(model,"animal-form.hbs");
        }, new HandlebarsTemplateEngine());
        get("/create/animal/endangered",(request, response) -> {
            Map<String,Object> model=new HashMap<String, Object>();
            List<String> health= new ArrayList<String>();
            health.add(EndangeredAnimals.HEALTH_HEALTHY);
            health.add(EndangeredAnimals.HEALTH_ILL);
            health.add(EndangeredAnimals.HEALTH_OKAY);
            List<String> age= new ArrayList<String>();
            age.add(EndangeredAnimals.AGE_ADULT);
            age.add(EndangeredAnimals.AGE_NEWBORN);
            age.add(EndangeredAnimals.AGE_YOUNG);
            model.put("health",health);
            model.put("age",age);
            String typeChosen="endangered";
            model.put("endangered",typeChosen);
            return new ModelAndView(model,"animal-form.hbs");
        },new HandlebarsTemplateEngine());

        get("/view/animals",(request, response) -> {
            Map<String,Object> model=new HashMap<String, Object>();
            model.put("animals",Animals.all());
            return new ModelAndView(model,"animal-view.hbs");
        },new HandlebarsTemplateEngine());
    }
}











