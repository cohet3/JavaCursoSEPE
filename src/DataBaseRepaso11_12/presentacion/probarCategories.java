package DataBaseRepaso11_12.presentacion;

import DataBaseRepaso11_12.modelo.categories;

import java.util.ArrayList;
import java.util.List;

public class probarCategories {
    public static void main(String[] args) {
        List<categories> categoriesArrayList= new ArrayList<>();
        categoriesArrayList.add( new categories(1, "categoria1", "categoria destinada para mayores de edad"));
        categoriesArrayList.add( new categories(2, "categoria2", "categoria destinada para mayores de edad"));
        categoriesArrayList.add( new categories(3, "categoria3", "categoria destinada para mayores de edad"));
        System.out.println(categoriesArrayList);

    }
}
