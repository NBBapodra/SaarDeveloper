package com.example.SaarDeveloper.repository;

import com.example.SaarDeveloper.model.PlotBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PlotBookingRepository extends JpaRepository<PlotBooking,Long> {
}
