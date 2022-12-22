package com.sahafstore.project.dtos;

import com.sahafstore.project.entities.Category;
import lombok.Data;

@Data
public class UpdateCategoryDTO {

    private String name;

    public Category toEntity(){
        Category category = new Category();
        category.setName(this.getName());
        return category;
    }
}
