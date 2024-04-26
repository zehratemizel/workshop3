public class Courses {

    private int courseId;
    private String courseName;
    private Categories courseCategory;
    private Instructors courseInstructor;
    private String courseDescription;

    public Courses(int id, String name, String description, Categories category, Instructors instructor) {
        this.courseId = id;
        this.courseName = name;
        this.courseDescription = description;
        this.courseCategory = category;
        this.courseInstructor = instructor;
    }

    public int getCourseId(){
        return this.courseId;
    }

    public void setCourseId(int id){
        this.courseId = id;
    }

    public String getCourseName(){
        return this.courseName;
    }

    public void setCourseName(String name){
        this.courseName = name;
    }

    public Categories courseCategory(){
        return this.courseCategory;
    }

    public void courseCategory(Categories name){
        this.courseCategory = name;
    }

    public Instructors courseInstructor(){
        return this.courseInstructor;
    }

    public void courseInstructor(Instructors name){
        this.courseInstructor = name;
    }

    public String courseDescription(){
        return this.courseDescription;
    }

    public void courseDescription(String name){
        this.courseDescription = name;
    }
}