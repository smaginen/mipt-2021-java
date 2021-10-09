package com.mipt.ami.java.task.commandpattern;

public class CopyCommand implements Command {

    private final IODevice action;
  
    public CopyCommand(IODevice action) {
        this.action = action;    
    }

    @Override
    public void execute() {
        action.copy();
    }

}
