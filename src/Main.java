import manager.InMemoryTaskManager;
import task.EpikTask;
import task.Status;
import task.SubTask;
import task.Task;

public class Main {

    public static void main(String[] args) {
        InMemoryTaskManager manager = new InMemoryTaskManager();

        EpikTask epikTask = new EpikTask("Убраться в квартире", "Быстро", Status.DONE);
        manager.createEpikTask(epikTask);
        SubTask subTask = new SubTask("Принести пылесос", "Вкючить пылесос", Status.DONE, epikTask.getId());
        manager.createSubTask(subTask);
        SubTask subTask1 = new SubTask("Пропылесосить", "Мощно", Status.DONE, epikTask.getId());
        manager.createSubTask(subTask1);
        EpikTask epikTask1 = new EpikTask("Сделать ремонт", "Евро", Status.NEW);
        manager.createEpikTask(epikTask1);
        SubTask subTask2 = new SubTask("Позвонить бригаде", "оплатить", Status.NEW, epikTask1.getId());
        manager.createSubTask(subTask2);
        Task task = new Task("Посмотреть джаву", "Все", Status.IN_PROGRES);
        manager.creatTask(task);
        Task task1 = new Task("Прорешать лит код", "хотя бы 10", Status.IN_PROGRES);
        manager.creatTask(task1);
        System.out.println(manager.getAllEpikTask());
        System.out.println(manager.getAllSubTask());
        System.out.println(manager.getAllTask());
        Task task2 = new Task("Обновлен", "Список 100 задач", Status.DONE);

        task2.setId(task.getId());
        manager.updateTask(task2);
        System.out.println(manager.getTaskById(task.getId()));
        manager.deletTask(task.getId());
        System.out.println(task.getId());
        System.out.println(manager.getAllTask());
        manager.deleteEpikTask(epikTask.getId());
        System.out.println(manager.getAllSubTask());
        EpikTask epikTask2 = new EpikTask("1", "2", Status.DONE);
        manager.createEpikTask(epikTask2);
        SubTask subTask3=new SubTask("3","4",Status.NEW, epikTask2.getId());
        manager.createSubTask(subTask3);
        manager.updateEpikStatus(epikTask2);
        System.out.println(epikTask2);

    }
}

