package com.arnaldojsfilho.myfristproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arnaldojsfilho.myfristproject.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
