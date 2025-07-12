package model;

public class TypeTask implements Task{
    private String name;
    private String body;
    private Usuario user;
    
    public TypeTask(){
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
    
    public TypeTask save(TypeTask task){
        // Aca code para guardar en la BD
        return this;
    }
    public void edit(String name, String body, Usuario user){
        setName(name);
        setBody(body);
        setUser(user);
    }
    public void delete();
}
