package com.gst.gst_calculator.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gst.gst_calculator.repository.CategoryRepository;
import com.gst.gst_calculator.models.Category;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @SuppressWarnings("null")
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

}
