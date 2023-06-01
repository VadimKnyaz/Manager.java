package task;

public class AbstractTask {
    protected String name;
    protected String descriptions;
    protected int id;
    protected Status status;

    public String getName() {
        return name;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public int getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public AbstractTask(String name, String descriptions, Status status){
        this.name=name;
        this.descriptions=descriptions;
        this.status=status;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AbstractTask{" +
                "name='" + name + '\'' +
                ", descriptions='" + descriptions + '\'' +
                ", id=" + id +
                ", status=" + status +
                '}';
    }

}
