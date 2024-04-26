import java.util.ArrayList;
import java.util.List;

class InstructorManager {
    private List<Instructors> instructors;

    public InstructorManager() {
        this.instructors = new ArrayList<>();
    }

    public void addInstructor(Instructors instructor) {
        instructors.add(instructor);
    }

    public void deleteInstructor(int id) {
        instructors.removeIf(instructor -> instructor.getId() == id);
    }

    public void updateInstructor(int id, Instructors newInstructor) {
        for (int i = 0; i < instructors.size(); i++) {
            if (instructors.get(i).getId() == id) {
                instructors.set(i, newInstructor);
                break;
            }
        }
    }

    public Instructors getInstructorById(int id) {
        for (Instructors instructor : instructors) {
            if (instructor.getId() == id) {
                return instructor;
            }
        }
        return null;
    }

    public List<Instructors> getAllInstructors() {
        return instructors;
    }
}