package app;

import model.TaskStatus;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TaskStatus.ProjectStatus status = TaskStatus.ProjectStatus.IN_PROGRESS;

        System.out.println(status);
    }
}