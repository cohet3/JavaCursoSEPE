package DataBaseRepaso11_12.modelo;

import java.util.Objects;

public class categories {
    private int category_id;
    private String category_name;
    private String description;

    public categories(int category_id, String category_name, String description) {
        this.category_id = category_id;
        this.category_name = category_name;
        this.description = description;
    }

    public categories() {
    }

    @Override
    public String toString() {
        return "categories{" +
                "category_id=" + category_id +
                ", category_name='" + category_name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        categories that = (categories) o;
        return category_id == that.category_id && Objects.equals(category_name, that.category_name) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category_id, category_name, description);
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
