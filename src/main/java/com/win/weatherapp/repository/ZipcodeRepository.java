package com.win.weatherapp.repository;

import com.win.weatherapp.model.Zipcode;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ZipcodeRepository extends JpaRepository<Zipcode, Long> {
    public Zipcode findByZip(String zipCode);

}