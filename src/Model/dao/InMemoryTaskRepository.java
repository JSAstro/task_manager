/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.dao;
import Model.*;
import java.util.*;
public class InMemoryTaskRepository {
    private final Map<UUID, TaskNode> xId = new HashMap<>();
    private final Map<UUID, UUID> padre = new HashMap<>();
    private final List<UUID> roots = new ArrayList<>();
    
    public List<TaskNode> obtenerRaices(){
        List<TaskNode> out = new ArrayList<>();
        for(UUID id : roots) out.add(xId.get(id));
        return out;
    }
    public void addRoot(TaskNode n){
        xId.put(n.getId(),n);
        roots.add(n.getId());
    }
    public void addHijo(UUID padreId, TaskNode hijo){
        xId.put(hijo.getId(),hijo);
        padre.put(hijo.getId(), padreId);
        TaskNode p = xId.get(padreId);
        if(p instanceof TaskGroup g) g.getHijosMut().add(hijo);
        else throw new IllegalStateException("El padre no es grupo");
    }
    public Optional<UUID> padreDe(UUID id){
        return Optional.ofNullable(padre.get(id));
    }
}
