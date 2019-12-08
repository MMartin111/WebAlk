package com.course.WebApp.DAO;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.course.WebApp.Stock;


public interface StockRepository extends JpaRepository<Stock, Integer>{

	List<Stock> findAll();

}
