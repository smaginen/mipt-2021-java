package com.mipt.ami.java.task.commandpattern;

public class DeleteCommand implements Command {

    private final IODevice action;

    public DeleteCommand(IODevice action) {
        this.action = action;
    }

    @Override
    public void execute() {
        action.delete();
    }

}
