package br.com.brunosiqueira.modelo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Cronometro {
	
	private Timer timer;
	private ArrayList<Calendar> tempoPercorrido;
	
	public Cronometro() {
		super();
		this.tempoPercorrido = new ArrayList<Calendar>();
		this.tempoPercorrido = null;
	}
	
	public void registrar(){
		Calendar tmp = Calendar.getInstance();
		this.tempoPercorrido.add(tmp);
	}
	
	public ArrayList<Calendar> periodo(){
		return tempoPercorrido;
		
	}
	
	public void iniciaCronometro(){
    	this.timer = null;  
        final SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        
        if (this.timer == null)   
         {      
            this.timer = new Timer();  
            TimerTask tarefa = new TimerTask() {     
                 public void run()   
                 {      
                     try {      
                         System.out.println("Hora: "+format.format(new Date().getTime()));      
                   } catch (Exception e) {      
                         e.printStackTrace();      
                     }      
                 }   
             };      
            this.timer.scheduleAtFixedRate(tarefa, 0, 1000);      
        }    
    }
	
}
