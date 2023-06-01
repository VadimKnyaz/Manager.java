package manager;

import task.AbstractTask;
import task.EpikTask;
import task.SubTask;
import task.Task;

import java.util.List;

public interface TaskManager {
    List<SubTask> getAllSubTask();
    List<Task> getAllTask();
    List<EpikTask> getAllEpikTask();
    void removeAllSubTasks();
    void removeAllTasks();
    void removeAllEpik();
    void removeAllTypeOfTasks();
    Task getTaskById(int id);
    SubTask getSubTaskById(int id);
    EpikTask getEpikTaskById(int id);
    int creatTask(Task task);
    int createSubTask(SubTask subTask);
    int createEpikTask(EpikTask epikTask);
    boolean updateTask(Task newTask);
    boolean updateSubTask(SubTask newSubTask);
    boolean updateEpikTask(EpikTask newEpikTask);
    boolean deletTask(int id);
    boolean deletSubTask(int id);
    boolean deleteEpikTask(int id);
    List<SubTask> getSubTasksByEpikId(int id);
    void updateEpikStatus(EpikTask epik);

    List <AbstractTask> getHistory ();

}

