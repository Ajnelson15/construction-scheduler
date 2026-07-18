package model;

import java.time.LocalDate;

public class ConstructionTask {
    private int task_id;
    private String task_name;
    private LocalDate start_date;
    private LocalDate end_date;
    private TaskStatus task_status;

    public ConstructionTask(int task_id, String task_name, LocalDate start_date,LocalDate end_date, TaskStatus task_status) {
        this.task_id = task_id;
        this.task_name = task_name;
        this.start_date = start_date;
        this.end_date = end_date;
        this.task_status = task_status;
    }
    public int getTask_id() {
        return task_id;
    }

    public String getTask_name() {
        return task_name;
    }

    public String setTask_name(String task_name) {
        return this.task_name = task_name;
    }

    public LocalDate getStart_date() {
        return start_date;
    }

    public LocalDate setStart_date(LocalDate start_date) {
        return this.start_date = start_date;
    }

    public LocalDate getEnd_date() {
        return end_date;
    }

    public LocalDate setEnd_date(LocalDate end_date) {
        return this.end_date = end_date;
    }

    public TaskStatus getTask_status () {
        return this.task_status;
    }

    public void setTask_status(TaskStatus task_status) {
        this.task_status = task_status;
    }
}





