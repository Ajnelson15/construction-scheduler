package app;

import model.ConstructionTask;
import model.TaskStatus;
import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TaskStatus.ProjectStatus status = TaskStatus.ProjectStatus.IN_PROGRESS;

        System.out.println(status);


        ConstructionTask framingTask = new ConstructionTask(1,"Andrew",LocalDate.of(2026,07,18), LocalDate.of(2026,07,25),1);

        System.out.println(framingTask.getTask_name() + "\n"+ framingTask.getTask_id() + "\n" + framingTask.getStart_date());

    }
}