package com.example.SaarDeveloper.services;


import com.example.SaarDeveloper.model.PlotBooking;

import java.util.List;

public interface PlotBookingService {


    List<PlotBooking> getAllPlots();
    PlotBooking BookPlot(PlotBooking plotBooking);

    PlotBooking  updatePlot(Long id, PlotBooking plotBooking);


}