package com.facudev.webscrapper.repository;

import com.facudev.webscrapper.models.Webpage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebpageRepository extends CrudRepository<Webpage, Integer> {
}
