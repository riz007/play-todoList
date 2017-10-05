package models;

import controllers.routes;
import play.data.validation.Constraints;

import java.util.*;

import play.db.ebean.*;

import play.data.validation.Constraints.*;

import javax.persistence.*;
import javax.xml.transform.Result;

@Entity
public class Task extends Model {

    @Id
    public Long id;

    @Constraints.Required
    public String label;

    public static Finder<Long, Task> find = new Finder(
            Long.class, Task.class
    );

    public static List<Task> all() {
        return find.all();
    }

    public static void create(Task task) {
        task.save();
    }

    public static void delete(Long id) {
        find.ref(id).delete();
    }




}
