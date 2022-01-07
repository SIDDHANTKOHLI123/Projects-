/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author kohli
 */
public class VitalSigns {
    private int lowbloodPressure;
    private int highbloodPressure;
    private int heartRate;

    public void setLowbloodPressure(int lowbloodPressure) {
        this.lowbloodPressure = lowbloodPressure;
    }

    public void setHighbloodPressure(int highbloodPressure) {
        this.highbloodPressure = highbloodPressure;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }
  

    public int getLowbloodPressure() {
        return lowbloodPressure;
    }

    public int getHighbloodPressure() {
        return highbloodPressure;
    }


    public int getHeartRate() {
        return heartRate;
    }
    
}
