package com.example.SaarDeveloper.model;


import com.example.SaarDeveloper.model.Enum.PlotBookingEnum;

import javax.persistence.*;

@Entity
@Table(name = "saar_plot_booking")
public class PlotBooking {

    @Id
    private long id;

    @Column(name = "plot_no", nullable = false)
    private long plotNo;


    @Enumerated(EnumType.STRING)
    @Column(name ="status")
    private PlotBookingEnum status;

    public PlotBooking() {
    }

    public PlotBooking(long id, long plotNo, PlotBookingEnum status) {

        this.id = id;
        this.plotNo = plotNo;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPlotNo() {
        return plotNo;
    }

    public void setPlotNo(long plotNo) {
        this.plotNo = plotNo;
    }

    public PlotBookingEnum getStatus() {
        return status;
    }

    public void setStatus(PlotBookingEnum status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PlotBooking{" +
                "id=" + id +
                ", plotNo=" + plotNo +
                ", status=" + status +
                '}';
    }
}
