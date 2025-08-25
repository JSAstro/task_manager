/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.*;
public final class TaskLeaf implements TaskNode {
    private final UUID id;
    private final String title;
    private final String description;
    
    public TaskLeaf(UUID id, String title, String description){
        this.id = id == null ? UUID.randomUUID(): id;
        this.title = Objects.requireNonNull(title);
        this.description = description == null ? "" : description;
    }
    public TaskLeaf(String title){
        this(null, title, "");
    }
    
    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public String getTitulo() {
        return title;
    }

    @Override
    public Optional<String> getDescription() {
        return description.isBlank()? Optional.empty(): Optional.of(description);
    }

    @Override
    public List<TaskNode> getHijos() {
        return List.of();
    }
    
}
