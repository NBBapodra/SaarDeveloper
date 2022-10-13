package com.example.SaarDeveloper.controller;

import com.example.SaarDeveloper.Exeception.ResourceNotFoundException;
import com.example.SaarDeveloper.model.PlotBooking;
import com.example.SaarDeveloper.services.PlotBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PlotBookController {

    @Autowired
    private PlotBookingService plotBookingService;


    @PostMapping("/bookPlot")
    public PlotBooking bookPlot(@RequestBody PlotBooking plotBooking)
    {
        return plotBookingService.BookPlot(plotBooking);
    }

    @GetMapping("/getAllPlots")
    List<PlotBooking> getAllPlots()
    {
        return plotBookingService.getAllPlots();
    }

    @PutMapping("/updatePlot/{id}")
    public  PlotBooking updatePlot(@RequestBody PlotBooking plotBooking,
                                   @PathVariable("id") Long id)
    {
        PlotBooking plotBooking1;
        plotBooking1 = plotBookingService.updatePlot(id, plotBooking);
        return plotBooking1;
    }

}
