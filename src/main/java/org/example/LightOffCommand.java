package org.example;

public class LightOffCommand implements Command{
    Light light;//---Light object reference---

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute(){//---execute method override from Command---
        light.off();
    }
    @Override
    public void undo(){//---undo method override from Command---
        light.on();
    }
}
