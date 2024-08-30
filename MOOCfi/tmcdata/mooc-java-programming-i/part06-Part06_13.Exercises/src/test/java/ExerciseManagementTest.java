import java.util.ArrayList;
import java.util.List;

public class ExerciseManagementTest {
    public class ExerciseManagement{    private ArrayList<String> exercises;    private ArrayList<String> completedExercises;    public ExerciseManagement() {        this.exercises = new ArrayList<>();        this.completedExercises = new ArrayList<>();    }    public List<String> exerciseList() {        return this.exercises;    }    public void add(String exercise) {        this.exercises.add(exercise);    }    public void markAsCompleted(String exercise) {        this.completedExercises.add(exercise);    }    public boolean isCompleted(String exercise) {        return this.completedExercises.contains(exercise);    }}  


}
