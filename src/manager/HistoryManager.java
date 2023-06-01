package manager;

import task.AbstractTask;
import task.Task;

import java.util.List;

public interface HistoryManager {

   void add (AbstractTask abstractTask);
   List<AbstractTask> getHistory ();

}
