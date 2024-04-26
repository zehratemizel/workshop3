import java.util.ArrayList;
import java.util.List;

class CategoryManager {
    private List<Categories> categories;

    public CategoryManager() {
        this.categories = new ArrayList<>();
    }

    public void addCategory(Categories category) {
        categories.add(category);
    }

    public void deleteCategory(int id) {
        categories.removeIf(category -> category.getId() == id);
    }

    public void updateCategory(int id, Categories newCategory) {
        for (int i = 0; i < categories.size(); i++) {
            if (categories.get(i).getId() == id) {
                categories.set(i, newCategory);
                break;
            }
        }
    }

    public Categories getCategoryById(int id) {
        for (Categories category : categories) {
            if (category.getId() == id) {
                return category;
            }
        }
        return null;
    }

    public List<Categories> getAllCategories() {
        return categories;
    }
}