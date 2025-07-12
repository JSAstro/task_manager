package model;

public interface Task {
	TypeTask save();
        void edit(String name, String body, Usuario user);
        void delete();             
}
