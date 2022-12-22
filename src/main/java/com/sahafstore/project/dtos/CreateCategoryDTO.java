package com.sahafstore.project.dtos;

import com.sahafstore.project.entities.Category;
import lombok.Data;

@Data
public class CreateCategoryDTO {

    private Long id;
    private String name;

    public Category toEntity(){
        Category category = new Category();
        category.setCategory_id(this.getId());
        category.setName(this.getName());
        return category;
    }
}
