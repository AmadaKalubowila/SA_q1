package org.example;

public class LightOnCommand implements Command{
    Light light;//---Light object reference---

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute(){//---execute method override from Command---
        light.on();
    }
    @Override
    public void undo(){//---undo method override from Command---
        light.off();
    }
}
