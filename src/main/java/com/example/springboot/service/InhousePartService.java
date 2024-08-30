package com.example.springboot.service;

import com.example.springboot.domain.InhousePart;

import java.util.List;

public interface InhousePartService {
    public List<InhousePart> findAll();
    public InhousePart findById(int theId);
    public void save (InhousePart thePart);
    public void deleteById(int theId);
}
