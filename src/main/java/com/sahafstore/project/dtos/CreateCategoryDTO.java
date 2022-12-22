package com.sahafstore.project.dtos;

import com.sahafstore.project.entities.Category;
import lombok.Data;

@Data
public class CreateCategoryDTO {

    private Long category_id;
    private String name;

    public Category toEntity(){
        Category category = new Category();
        category.setCategory_id(this.getCategory_id());
        category.setName(this.getName());
        return category;
    }
}
