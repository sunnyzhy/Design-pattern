package com.zhy.DesignPattern.Command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {

    private List<AbstractCommand> commands;

    public Waiter()
    {
        this.commands = new ArrayList<AbstractCommand>();
    }

    public void SetOrder(AbstractCommand command)
    {
        this.commands.add(command);
        System.out.println("���Ӷ�����" + command.getName());
    }

    public void CancelOrder(AbstractCommand command)
    {
        this.commands.remove(command);
        System.out.println("ȡ��������" + command.getName());
    }

    public void Notify()
    {
        for (AbstractCommand command : this.commands)
        {
            command.Cook();
        }
    }
}
