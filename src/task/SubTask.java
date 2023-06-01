package task;

public class SubTask extends AbstractTask{
   private int epicId;////сабстаск знает какую переменную хранит епикади

    public int getEpicId() {
        return epicId;
    }

    public void setEpicId(int epicId) {
        this.epicId = epicId;
    }


    public SubTask(String name, String descriptions, Status status,int epicId) {
        super(name, descriptions, status);
        this.epicId=epicId;
    }

    @Override
    public String toString() {
        return "SubTask{" +
                "epicId=" + epicId +
                ", name='" + name + '\'' +
                ", descriptions='" + descriptions + '\'' +
                ", id=" + id +
                ", status=" + status +
                '}';
    }
}
