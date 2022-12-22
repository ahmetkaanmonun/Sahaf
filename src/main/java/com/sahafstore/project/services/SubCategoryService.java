package com.sahafstore.project.services;

import com.sahafstore.project.dtos.CreateSubCategoryDTO;
import com.sahafstore.project.dtos.UpdateSubCategoryDTO;
import com.sahafstore.project.entities.SubCategory;
import com.sahafstore.project.repositories.SubCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubCategoryService{

    @Autowired
    private SubCategoryRepository subCategoryRepository;


    public SubCategory createSubCategory(CreateSubCategoryDTO createSubCategoryDTO) {
        return subCategoryRepository.save(createSubCategoryDTO.toEntity());
    }

    public SubCategory updateSubCategory(UpdateSubCategoryDTO updateSubCategoryDTO, Long id) {
        return subCategoryRepository.findById(id)
                .map(subCategory -> {
                    subCategory.setName(updateSubCategoryDTO.getName());
                    return subCategoryRepository.save(subCategory);
                })
                .orElseGet(() -> {
                    updateSubCategoryDTO.setName(updateSubCategoryDTO.getName());
                    return subCategoryRepository.save(updateSubCategoryDTO.toEntity());
                });
    }

    public void deleteSubCategory(Long id) {
        subCategoryRepository.deleteById(id);
    }
}
