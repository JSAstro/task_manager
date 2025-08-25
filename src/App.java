import Model.*;
import Model.dao.InMemoryTaskRepository;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class App extends Application{
    @Override
    public void start(Stage stage)throws Exception{
        Parent root = new javafx.scene.layout.StackPane();
        stage.setTitle("Prueba 01");
        stage.setScene(new Scene(root, 900, 600));
        stage.show();
    }
    
    
    public static void main(String[] args){
        InMemoryTaskRepository repo = new InMemoryTaskRepository();
        
        TaskGroup trabajo = new TaskGroup("Trabajo");
        repo.addRoot(trabajo);
        
        TaskLeaf trabajo1 = new TaskLeaf(null,"Prueba","Prueba2");
        TaskLeaf trabajo2 = new TaskLeaf(null,"Prueba3","Pruebaasda");
        
        repo.addHijo(trabajo.getId(), trabajo1);
        
        System.out.println("Raíces: " + repo.obtenerRaices());
        System.out.println("Padre de t1: " + repo.padreDe(trabajo1.getId()));

    }
}
