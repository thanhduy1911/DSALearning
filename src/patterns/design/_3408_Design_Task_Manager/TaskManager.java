package patterns.design._3408_Design_Task_Manager;

import java.util.*;

public class TaskManager {
    private static class Task implements Comparable<Task> {
        int userId, taskId, priority;

        Task(int userId, int taskId, int priority) {
            this.userId = userId;
            this.taskId = taskId;
            this.priority = priority;
        }

        @Override
        public int compareTo(Task o) {
            if (this.priority != o.priority) {
                return Integer.compare(o.priority, this.priority);
            }

            return Integer.compare(o.taskId, this.taskId);
        }
    }

    private final TreeMap<Task, Integer> sortedTask;
    private final Map<Integer, Task> taskMap;

    private TaskManager(List<List<Integer>> tasks) {
        sortedTask = new TreeMap<>();
        taskMap = new HashMap<>();

        for (List<Integer> task : tasks) {
            int userId = task.get(0);
            int taskId = task.get(1);
            int priority = task.get(2);

            add(userId, taskId, priority);
        }
    }

    private void add(int userId, int taskId, int priority) {
        Task task = new Task(userId, taskId, priority);
        sortedTask.put(task, taskId);
        taskMap.put(taskId, task);
    }

    private void edit(int taskId, int newPriority) {
        Task task = taskMap.get(taskId);
        if (task != null) {
            sortedTask.remove(task);
            task.priority = newPriority;
            sortedTask.put(task, taskId);
        }
    }

    private void rmv(int taskId) {
        Task task = taskMap.get(taskId);
        if (task != null) {
            sortedTask.remove(task);
            taskMap.remove(taskId);
        }
    }

    private int execTop() {
        if (sortedTask.isEmpty()) {
            return -1;
        }

        Task topTask = sortedTask.firstKey();
        sortedTask.remove(topTask);
        taskMap.remove(topTask.taskId);

        return topTask.userId;
    }
}
