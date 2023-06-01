package task;


public class Task extends AbstractTask{

    public Task(String name, String descriptions, Status status) {
        super(name, descriptions, status);

    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", descriptions='" + descriptions + '\'' +
                ", id=" + id +
                ", status=" + status +
                '}';
    }
}
