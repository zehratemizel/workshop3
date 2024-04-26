
//Kodlamaio sitesindeki Kurs, Kategori ve eğitmen
//nesnelerini modelleyip koda dökünüz.
//Tüm nesneler için CRUD (listeleme, ekleme, silme, güncelleme, id ye göre getirme)
// kodlarını yazınız. Kodlarınızı githuba atıp paylaşınız.

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create some example categories
        Categories programmingCategory = new Categories(1, "Programming");
        Categories designCategory = new Categories(2, "Design");

        // Create some example instructors
        Instructors instructor1 = new Instructors(1, "Engin Demiroğ");
        Instructors instructor2 = new Instructors(2, "Halit Enes Kalaycı");

        // Create some example courses
        Courses course1 = new Courses(1, "Yazılım Geliştirici Yetiştirme Kampı",
                "2 ay sürecek ücretsiz ve profesyonel bir programla, sıfırdan yazılım geliştirme öğreniyoruz.",
                programmingCategory, instructor1);
        Courses course2 = new Courses(2, "(2023) Yazılım Geliştirici Yetiştirme Kampı (Python & Selenium)\n",
                "Profesyonel bir programla, sıfırdan yazılım geliştirme öğreniyoruz.",
                programmingCategory, instructor2);

        // Create managers for Course, Category, and Instructor
        CourseManager courseManager = new CourseManager();
        CategoryManager categoryManager = new CategoryManager();
        InstructorManager instructorManager = new InstructorManager();

        // Add example courses, categories, and instructors
        courseManager.addCourse(course1);
        courseManager.addCourse(course2);
        categoryManager.addCategory(programmingCategory);
        categoryManager.addCategory(designCategory);
        instructorManager.addInstructor(instructor1);
        instructorManager.addInstructor(instructor2);

        // CRUD operations for courses
        // Add a new course
        Courses newCourse = new Courses(3, "Senior Yazılım Geliştirici Yetiştirme Kampı",
                "Ücretsiz ve profesyonel bir programla, ileri seviye yazılım geliştirme öğreniyoruz.",
                programmingCategory, instructor1);
        courseManager.addCourse(newCourse);

        // Update a course
        Courses updatedCourse = new Courses(2, "Programlamaya Giriş İçin Temel Kurs",
                "Ücretsiz ve profesyonel bir programla, sıfırdan yazılım geliştirme öğreniyoruz.",
                programmingCategory, instructor1);
        courseManager.updateCourse(2, updatedCourse);

        // Delete a course
        //courseManager.deleteCourse(1);

        // Get all courses
        List<Courses> allCourses = courseManager.getAllCourses();
        System.out.println("All courses:");
        for (Courses course : allCourses) {
            System.out.println(course.getCourseName());
        }

        // CRUD operations for categories
        // Add a new category
        Categories newCategory = new Categories(3, "Data Science");
        categoryManager.addCategory(newCategory);

        // Update a category
        Categories updatedCategory = new Categories(2, "Graphic Design");
        categoryManager.updateCategory(2, updatedCategory);

        // Delete a category
        //categoryManager.deleteCategory(1);

        // Get all categories
        List<Categories> allCategories = categoryManager.getAllCategories();
        System.out.println("\nAll categories:");
        for (Categories category : allCategories) {
            System.out.println(category.getName());
        }

        // CRUD operations for instructors
        // Add a new instructor
        Instructors newInstructor = new Instructors(3, "Muhammed İnan");
        instructorManager.addInstructor(newInstructor);

        // Update an instructor
        Instructors updatedInstructor = new Instructors(3, "Engin Demiroğ");
        instructorManager.updateInstructor(3, updatedInstructor);

        // Delete an instructor
        instructorManager.deleteInstructor(3);

        // Get all instructors
        List<Instructors> allInstructors = instructorManager.getAllInstructors();
        System.out.println("\nAll instructors:");
        for (Instructors instructor : allInstructors) {
            System.out.println(instructor.getName());
        }
    }
}
