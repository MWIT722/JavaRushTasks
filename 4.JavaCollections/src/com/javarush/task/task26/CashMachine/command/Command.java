package com.javarush.task.task26.CashMachine.command;


import com.javarush.task.task26.CashMachine.exception.InterruptOperationException;

interface Command {
    void execute() throws InterruptOperationException;
}
