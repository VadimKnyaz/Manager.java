package task;

import java.util.ArrayList;

public class EpikTask extends AbstractTask {
    private ArrayList<SubTask> subTasks=new ArrayList<>();

    public ArrayList<SubTask> getSubTasks() {
        return subTasks;
    }

    public void setSubTasks(ArrayList<SubTask> subTasks) {
        this.subTasks = subTasks;
    }

    public EpikTask(String name, String descriptions, Status status) {
        super(name, descriptions, status);
    }

    @Override
    public String toString() {
        return "EpikTask{" +
                "subTasks=" + subTasks +
                ", name='" + name + '\'' +
                ", descriptions='" + descriptions + '\'' +
                ", id=" + id +
                ", status=" + status +
                '}';
    }
}
