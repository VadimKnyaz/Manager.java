package manager;

import task.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//Абзац вернуться к проверьте что теперь инмеморитаскманагерс обращается к менеджеру истроии . ПОлностью все проанализировать вс что мы написали еще раза пройтись по тз все сверить что не написали что не хватает с предложениями.Задача №1 Задачника.
public class InMemoryTaskManager implements TaskManager {
    private final HistoryManager historyManager =Managers.getDefaultHistory();
    private static int id = 1;

    public static int getId() {
        return id;
    }

    private final HashMap<Integer, SubTask> subTasksHashMap = new HashMap<>();
    private final HashMap<Integer, Task> taskHashMap = new HashMap<>();
    private final HashMap<Integer, EpikTask> epikTaskHashMap = new HashMap<>();

    @Override
    public List<SubTask> getAllSubTask() {
        List<SubTask> list = new ArrayList<>(subTasksHashMap.values());
        return list;
    }

    @Override
    public List<Task> getAllTask() {
        return new ArrayList<>(taskHashMap.values());
    }
    @Override
    public List<EpikTask> getAllEpikTask() {
        return new ArrayList<>(epikTaskHashMap.values());
    }
    @Override
    public void removeAllSubTasks() {
        subTasksHashMap.clear();
    }
    @Override
    public void removeAllTasks() {
        taskHashMap.clear();
    }
    @Override
    public void removeAllEpik() {
        epikTaskHashMap.clear();
    }
    @Override
    public void removeAllTypeOfTasks() {
        subTasksHashMap.clear();
        taskHashMap.clear();
        epikTaskHashMap.clear();
    }
    @Override
    public Task getTaskById(int id) {
        //вызвать метод добавления в историю задач
        return taskHashMap.get(id);
    }//
    @Override
    public SubTask getSubTaskById(int id) {
        //вызвать метод добавления в историю задач
        return subTasksHashMap.get(id);
    }
    @Override
    public EpikTask getEpikTaskById(int id) {
        //вызвать метод добавления в историю задач
        return epikTaskHashMap.get(id);
    }
    @Override
    public int creatTask(Task task) {
        taskHashMap.put(id, task);
        task.setId(id);
        return id++;
    }
    @Override
    public int createSubTask(SubTask subTask) {
        subTasksHashMap.put(id, subTask);
        epikTaskHashMap.get(subTask.getEpicId()).getSubTasks().add(subTask);//получили объект эпика у него получили эрейлист сабтасок и добавли в него сабтаску ктр приходит в метод
        subTask.setId(id);
        updateEpikStatus(epikTaskHashMap.get(subTask.getEpicId()));
        return id++;

    }
    @Override
    public int createEpikTask(EpikTask epikTask) {
        epikTaskHashMap.put(id, epikTask);
        epikTask.setId(id);
        return id++;

    }
    @Override
    public boolean updateTask(Task newTask) {
        if (taskHashMap.containsKey(newTask.getId())) {
            taskHashMap.put(newTask.getId(), newTask);
            return true;
        } else {
            return false;
        }
    }
    @Override
    public boolean updateSubTask(SubTask newSubTask) {
        if (subTasksHashMap.containsKey(newSubTask.getId())) {
            subTasksHashMap.put(newSubTask.getId(), newSubTask);
            updateEpikStatus(epikTaskHashMap.get(newSubTask.getEpicId()));//сабстаск знает какую переменную хранит епикади
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean updateEpikTask(EpikTask newEpikTask) {
        if (epikTaskHashMap.containsKey(newEpikTask.getId())) {
            epikTaskHashMap.put(newEpikTask.getId(), newEpikTask);
            return true;
        } else {
            return false;
        }
    }
    @Override
    public boolean deletTask(int id) {
        if (taskHashMap.containsKey(id)) {
            taskHashMap.remove(id);
            return true;
        } else {
            return false;
        }
    }
    @Override
    public boolean deletSubTask(int id) {
        if (subTasksHashMap.containsKey(id)) {
            updateEpikStatus(epikTaskHashMap.get(subTasksHashMap.get(id).getEpicId()));
            subTasksHashMap.remove(id);

            return true;
        } else {
            return false;
        }
    }
    @Override
    public boolean deleteEpikTask(int id) {
        if (epikTaskHashMap.containsKey(id)) {
            for (SubTask subtack : epikTaskHashMap.get(id).getSubTasks()) {
                subTasksHashMap.remove(subtack.getId());
            }
            epikTaskHashMap.remove(id);

            return true;
        } else {
            return false;
        }
    }
    @Override
    public List<SubTask> getSubTasksByEpikId(int id) {
        return epikTaskHashMap.get(id).getSubTasks();
    }
    @Override
    public void updateEpikStatus(EpikTask epik) {
        if (epik.getSubTasks().isEmpty()) {
            epik.setStatus(Status.NEW);
            return;
        }
        boolean isNew = true;
        boolean isDone = true;
        for (SubTask subTask : epik.getSubTasks()) {
            if (subTask.getStatus() == Status.NEW) {
                isDone = false;
            }
            if (subTask.getStatus() == Status.DONE) {
                isNew = false;
            }
            if (subTask.getStatus() == Status.IN_PROGRES) {
                isDone = false;
                isNew = false;
            }
        }
        if (isDone) {
            epik.setStatus(Status.DONE);
        }
        if (isNew) {
            epik.setStatus(Status.NEW);
        }
        if (!isDone && !isNew) {
            epik.setStatus(Status.IN_PROGRES);
        }//разобрать каждую строчку , каждую переменную
    }

    @Override
    public List<AbstractTask> getHistory() {
        return null;
    }


}


//продумать все что 4 if else// колекции


//досканально изучить на каждый метод приходить с идеей
//интерфейсы абстрактные классы вспомнить изучить тз второго задания план в блокноте что почему и зачем
