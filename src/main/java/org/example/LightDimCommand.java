package org.example;

public class LightDimCommand implements Command{
    Light light;//---Light object reference---
    private int level; //---property create to store light level---
    private int beforeLevel;//---property create to store previous  light level---

    public LightDimCommand(Light light,int level) {
        this.light = light;
        this.level=level;
    }
    @Override
    public void execute(){//---execute method override from Command---
        beforeLevel=light.getBrightLevel();
        light.dim(level);
    }
    @Override
    public void undo(){//---undo method override from Command---
        light.dim(beforeLevel);
    }
}
