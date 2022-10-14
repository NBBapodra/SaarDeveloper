package com.example.SaarDeveloper.services;


import com.example.SaarDeveloper.Exeception.ResourceNotFoundException;
import com.example.SaarDeveloper.model.PlotBooking;
import com.example.SaarDeveloper.repository.PlotBookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlotBookingServiceImpl implements PlotBookingService {

    @Autowired
    private PlotBookingRepository plotBookingRepository;


    @Override
    public List<PlotBooking> getAllPlots() {
        return (List<PlotBooking>)plotBookingRepository.findAll(Sort.by(Sort.Direction.ASC,"id"));
    }

    @Override
    public PlotBooking BookPlot(PlotBooking plotBooking) {

        return plotBookingRepository.save(plotBooking);

    }

    @Override
    public PlotBooking updatePlot(Long id, PlotBooking plotBooking) {

        PlotBooking plotBooking1=null;
        try {
            plotBooking1= plotBookingRepository.findById(id)
                    .orElseThrow(() -> new ResourceNotFoundException("Plot not found", HttpStatus.NOT_FOUND));
        } catch (ResourceNotFoundException e) {
            throw new RuntimeException(e);
        }

        plotBooking1.setPlotNo(plotBooking.getPlotNo());
        plotBooking1.setStatus(plotBooking.getStatus());

        return plotBookingRepository.save(plotBooking1);
    }
}