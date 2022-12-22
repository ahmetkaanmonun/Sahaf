package com.sahafstore.project.dtos;

import com.sahafstore.project.entities.Category;
import com.sahafstore.project.entities.SubCategory;
import lombok.Data;

@Data
public class CreateSubCategoryDTO {

    private Long subCategory_id;
    private String name;

    public SubCategory toEntity(){
        SubCategory subCategory = new SubCategory();
        subCategory.setSubCategory_id(this.getSubCategory_id());
        subCategory.setName(this.getName());
        return subCategory;
    }
}
