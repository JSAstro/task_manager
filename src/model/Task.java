package model;
import java.util.Date;
import java.time.LocalDateTime;

public class Task {
	private String tittle;
	private String caption;
	private LocalDateTime created_time;
        private char prioridad;
	private String body;
	private Usuario user;
	
        public Task(){
            
        }
        public void setCreated_time(){
            this.created_time = LocalDateTime.now();
        }

    public String getTittle() {
        return tittle;
    }

    public String getCaption() {
        return caption;
    }

    public LocalDateTime getCreated_time() {
        return created_time;
    }

    public char getPrioridad() {
        return prioridad;
    }

    public String getBody() {
        return body;
    }
        
        
}

