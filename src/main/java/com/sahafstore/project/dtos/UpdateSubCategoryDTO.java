package com.sahafstore.project.dtos;

import com.sahafstore.project.entities.SubCategory;
import lombok.Data;

@Data
public class UpdateSubCategoryDTO {

    private String name;

    public SubCategory toEntity(){
        SubCategory subCategory = new SubCategory();
        subCategory.setName(this.getName());
        return subCategory;
    }
}
