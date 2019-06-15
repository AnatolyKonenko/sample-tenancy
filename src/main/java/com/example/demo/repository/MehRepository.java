package com.example.demo.repository;

import com.example.demo.entities.Meh;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MehRepository extends PagingAndSortingRepository<Meh,Long> {
}
