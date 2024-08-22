package org.example;

public class RemoteControl {
    Command[] onCommands;//---array to hold on command---

    Command[] offCommands;//---array to hold off command---
    Command undoCommand;
    public RemoteControl(){
        onCommands=new Command[5];//---- initialize array for 5 commands---
        offCommands=new Command[5];
        undoCommand=null;
    }
    public void setCommand(int command,Command onCommand,Command offCommand){//---set off on commands---
        onCommands[command]=onCommand;
        offCommands[command]=offCommand;
    }
    public void onButtonWasPressed(int command){//--- method for on button---
        if(onCommands[command]!=null) {
            onCommands[command].execute();
            undoCommand = onCommands[command];
        }else{
            System.out.println("No light level assigned");
        }
    }
    public void offButtonWasPressed(int command){//--- method for off button---
        if(offCommands[command]!=null) {
            offCommands[command].execute();
            undoCommand = offCommands[command];
        }else{
            System.out.println("No light level assigned");
        }
    }
    public void undoButtonWasPressed(){//--- method for undo button---
        if(undoCommand!=null) {
            undoCommand.undo();
        }else{
            System.out.println("No light level assigned");
        }
    }

}
