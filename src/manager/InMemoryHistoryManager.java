package manager;

import task.AbstractTask;
import task.Task;

import java.util.ArrayList;
import java.util.List;

public class InMemoryHistoryManager implements HistoryManager {
   private final List<AbstractTask> history = new ArrayList<>();


    @Override
    public void add(AbstractTask abstractTask) {
        if (history.size() == 10) {
            history.remove(0);
        }
        history.add(abstractTask);
    }

    @Override
    public List<AbstractTask> getHistory() {
        return history;
    }
}
