public class Categories {

    private int id;
    private String categoryName;

    public Categories(int id, String name) {
        this.id = id;
        this.categoryName = name;
    }

    // Getter and setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName(){
        return this.categoryName;
    }

    public void setName(String name){
        this.categoryName = name;
    }
}
