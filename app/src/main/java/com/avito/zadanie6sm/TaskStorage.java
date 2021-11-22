package com.avito.zadanie6sm;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TaskStorage {
    private static final TaskStorage taskStorage = new TaskStorage();

    public List<Task> getTasks() {
        return tasks;
    }

    private final List<Task> tasks;

    public static TaskStorage getInstance() { return  taskStorage; }

    private TaskStorage()
    {
        tasks = new ArrayList<>();
        for (int i = 1; i<=100; i++) {
            Task task = new Task();
            task.setName("Task #" + i);
            task.setDone(i % 3 == 0);
            tasks.add(task);
        }
    }

    public Task getTask(UUID id) {
        for (Task task : tasks) {
            if (task.getId().equals(id))
                return task;
        }

        return null;
    }
}
