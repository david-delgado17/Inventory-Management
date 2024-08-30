package com.example.springboot.repositories;

import com.example.springboot.domain.OutsourcedPart;
import org.springframework.data.repository.CrudRepository;

public interface OutsourcedPartRepository extends CrudRepository<OutsourcedPart,Long> {
}
