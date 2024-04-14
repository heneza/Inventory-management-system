package dto;

public class CategoryRequest {
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description,String name) {
        this.description = description;
        this.name = name;
    }
}
