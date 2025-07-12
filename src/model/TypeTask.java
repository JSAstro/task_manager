package model;

public class TypeTask implements Task{
    private String name;
    private String body;
    private boolean deleted = false;
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
    @Override
    public TypeTask save(){
        // Aca code para guardar en la BD
        return this;
    }
    @Override
    public void edit(String name, String body, Usuario user){
        setName(name);
        setBody(body);
        setUser(user);
    }
    @Override
    public void delete(){
        this.deleted = true;
    }
}
