package com.workintech.main;

import com.workintech.model.*;
import com.workintech.model.enums.LampType;
import com.workintech.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {

        Lamp lamp = new Lamp(LampType.LAVA, true, 5);
        Ceiling ceiling = new Ceiling(3, PaintColor.WHITE);
        Bed bed = new Bed("Çift Kişilik", 4,1, 2, 3);
        Wardrobe wardrobe =new Wardrobe(2, 3, 30);
        Carpet carpet = new Carpet(4, 3, PaintColor.RED);

        Bedroom bedroom = new Bedroom("Bedroom" , lamp, ceiling, bed, wardrobe, carpet);

        bedroom.getCarpet().lying();
        bedroom.getLamp().turnOn();
        bedroom.getCeiling().create();

        for (Wall wall : bedroom.getWalls()){
            wall.create();
        }

        System.out.println(bedroom);
    }
}
