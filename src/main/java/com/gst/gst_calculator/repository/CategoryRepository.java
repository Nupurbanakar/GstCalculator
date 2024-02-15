package com.gst.gst_calculator.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.gst.gst_calculator.models.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}