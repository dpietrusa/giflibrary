package com.detroitlabs.giflibrary.data;

import com.detroitlabs.giflibrary.model.Category;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CategoryRepository {

    private static final List<Category> CATEGORY_LIST = Arrays.asList(
            new Category(10, "Funny"),
            new Category(11, "Kanye"),
            new Category(12, "Dogs")
    );

    public List<Category> getAllCategories() {
        return CATEGORY_LIST;
    }

    public Category findById(int idNumber) {
        for (Category category : CATEGORY_LIST) {
            if (category.getId() == idNumber) {
                return category;
            }
        }return null;
    }
}








