/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author kohli
 */
public class UberDetails {
    private String manufacture;
    private String model;
    private int manuyear;
    private String serialno;
    private int minseats;
    private int maxseats;
    private String location;
    private Date dateofupdate;
    private boolean available;
    private boolean manucerti;
    private Double time;
    private String carname;

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getManuyear() {
        return manuyear;
    }

    public void setManuyear(int manuyear) {
        this.manuyear = manuyear;
    }

    public String getSerialno() {
        return serialno;
    }

    public void setSerialno(String serialno) {
        this.serialno = serialno;
    }

    public int getMinseats() {
        return minseats;
    }

    public void setMinseats(int minseats) {
        this.minseats = minseats;
    }

    public int getMaxseats() {
        return maxseats;
    }

    public void setMaxseats(int maxseats) {
        this.maxseats = maxseats;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDateofupdate() {
        return dateofupdate;
    }

    public void setDateofupdate(Date dateofupdate) {
        this.dateofupdate = dateofupdate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isManucerti() {
        return manucerti;
    }

    public void setManucerti(boolean manucerti) {
        this.manucerti = manucerti;
    }

    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }
    
    @Override
    public String toString(){
        return manufacture;
    }
   
    
}
