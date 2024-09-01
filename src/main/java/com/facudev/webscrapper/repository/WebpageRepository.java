package com.facudev.webscrapper.repository;

import com.facudev.webscrapper.models.Webpage;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WebpageRepository extends CrudRepository<Webpage, Integer> {
    @Query("SELECT w FROM Webpage w WHERE w.domain LIKE %:text% OR w.description LIKE %:text% OR w.title LIKE %:text% OR w.url LIKE %:text% order by rank DESC")
    List<Webpage> findByText(@Param("text") String text);
}
