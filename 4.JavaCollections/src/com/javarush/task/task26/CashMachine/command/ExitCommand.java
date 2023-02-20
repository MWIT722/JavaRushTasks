package com.javarush.task.task26.CashMachine.command;


import com.javarush.task.task26.CashMachine.CashMachine;
import com.javarush.task.task26.CashMachine.ConsoleHelper;
import com.javarush.task.task26.CashMachine.exception.InterruptOperationException;

import java.util.ResourceBundle;

class ExitCommand implements Command {
    private ResourceBundle res = ResourceBundle.getBundle(CashMachine.RESOURCE_PATH + "exit");

    @Override
    public void execute() throws InterruptOperationException {
        ConsoleHelper.writeMessage(res.getString("exit.question.y.n"));
        String result = ConsoleHelper.readString();
        if (result != null && "y".equals(result.toLowerCase())) {
            ConsoleHelper.writeMessage(res.getString("thank.message"));
        } else {
            //TODO process NO
        }
    }
}
