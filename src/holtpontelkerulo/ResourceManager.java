package holtpontelkerulo;

import java.util.HashMap;
import java.util.Map;

import static holtpontelkerulo.TaskManager.Task;

public class ResourceManager {
    public static class Resource {
        private String name;
        private Task takenBy;
        public Resource(String name) {
            this.name = name;
            takenBy = null;
        }
    }
    private final Map<String, Resource> resources;

    public ResourceManager() {
        resources = new HashMap<>();
        resources.put("0",null);
    }

    public void requireResources(String[] calls) {
        for(String s : calls) {
            String name = s.substring(1);
            if(!s.equals("0")) resources.computeIfAbsent(name, o1 -> new Resource(name));
        }
    }
}
