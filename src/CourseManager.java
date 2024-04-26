import java.util.ArrayList;
import java.util.List;

class CourseManager {
    private List<Courses> courses;

    public CourseManager() {
        this.courses = new ArrayList<>();
    }

    public void addCourse(Courses course) {
        courses.add(course);
    }

    public void deleteCourse(int id) {
        courses.removeIf(course -> course.getCourseId() == id);
    }

    public void updateCourse(int id, Courses newCourse) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseId() == id) {
                courses.set(i, newCourse);
                break;
            }
        }
    }

    public Courses getCourseById(int id) {
        for (Courses course : courses) {
            if (course.getCourseId() == id) {
                return course;
            }
        }
        return null;
    }

    public List<Courses> getAllCourses() {
        return courses;
    }
}
