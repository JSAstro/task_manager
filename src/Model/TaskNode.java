/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.*;
/**
 *
 * @author Jordan
 */
public interface TaskNode {
    UUID getId();
    String getTitulo();
    Optional<String> getDescription();
    List<TaskNode> getHijos();
    default boolean isGroup() { return getHijos().isEmpty();}
}
