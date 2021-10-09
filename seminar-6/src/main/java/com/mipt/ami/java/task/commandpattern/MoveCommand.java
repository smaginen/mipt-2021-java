package com.mipt.ami.java.task.commandpattern;

public class MoveCommand implements Command {

    private final IODevice action;

    public MoveCommand(IODevice action) {
        this.action = action;
    }

    @Override
    public void execute() {
        action.move();
    }

}
