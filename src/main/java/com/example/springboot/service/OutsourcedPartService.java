package com.example.springboot.service;

import com.example.springboot.domain.OutsourcedPart;

import java.util.List;

public interface OutsourcedPartService {
        public List<OutsourcedPart> findAll();
        public OutsourcedPart findById(int theId);
        public void save (OutsourcedPart thePart);
        public void deleteById(int theId);
}
