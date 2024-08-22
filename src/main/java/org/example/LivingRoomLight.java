package org.example;

public class LivingRoomLight implements Light{
    private int brightLevel;//---create property to store bright level---
    @Override
    public void on(){//---create light on method---
        brightLevel=100;
        System.out.println("Living Room light is ON at full brightness.");
    }

    @Override
    public void off(){//---create light off method---
        brightLevel=0;
        System.out.println("Living Room light is OFF.");
    }

    @Override
    public void dim(int level){//---create light dim method---
        brightLevel=level;
        System.out.println("Living Room light dimmed to"+level+"%.");
    }

    public int getBrightLevel(){
        return brightLevel;
    }//---create getter for property ---
}
