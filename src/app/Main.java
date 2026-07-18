package app;

import model.ConstructionTask;
import model.TaskStatus;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        ConstructionTask framingTask = new ConstructionTask(1,"Andrew",LocalDate.of(2026,07,18), LocalDate.of(2026,07,25),TaskStatus.NOT_STARTED);

        System.out.println(framingTask.getTask_name() + "\n"+ framingTask.getTask_id() + "\n" + framingTask.getStart_date() +"\n" + framingTask.getTask_status());

    }
}