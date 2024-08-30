package com.example.springboot.repositories;

import com.example.springboot.domain.InhousePart;
import org.springframework.data.repository.CrudRepository;


public interface InhousePartRepository extends CrudRepository<InhousePart,Long> {
}
