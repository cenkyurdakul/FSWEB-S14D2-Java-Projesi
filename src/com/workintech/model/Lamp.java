package com.workintech.model;
import com.workintech.model.enums.LampType;


public class Lamp {
    private LampType style;
    private boolean battery;
    private int globRating;

    public Lamp(LampType style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public LampType getStyle() {
        return style;
    }

    public void setStyle(LampType style) {
        this.style = style;
    }

    public boolean isBattery() {
        return battery;
    }

    public void setBattery(boolean battery) {
        this.battery = battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    public void setGlobRating(int globRating) {
        this.globRating = globRating;
    }

    public void turnOn(){
        System.out.println("Lamp is being turnd on.");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n***************************\n");
        builder.append("LAMP\n");
        builder.append("Style: " + style + "\n");
        builder.append("Battey: " + battery + "\n");
        builder.append("GlobRating: " + globRating + "\n");
        return builder.toString();
    }
}
