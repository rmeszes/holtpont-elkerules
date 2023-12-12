package holtpontelkerulo;

import java.util.HashMap;
import java.util.Map;

import static holtpontelkerulo.ResourceManager.Resource;
public class TaskManager {
    private ResourceManager resourceManager;
    public static class Task {
        private final String name;
        private Resource currentlyHolding;

        private final String[] utasitasok;
        private int pc;

        public Task(String name, String[] utasitasok) {
            this.name = name;
            this.utasitasok = utasitasok;
            currentlyHolding = null;
            pc = 0;
        }
    }

    private final Map<String, Task> tasks;

    public TaskManager(ResourceManager resourceManager) {
        this.resourceManager = resourceManager;
        tasks = new HashMap<>();
    }

    public void createTask(String name, String[] utasitasok) {
        if(!tasks.containsKey(name)) resourceManager.requireResources(utasitasok);
        tasks.computeIfAbsent(name, o1 -> new Task(name, utasitasok));
    }


}
