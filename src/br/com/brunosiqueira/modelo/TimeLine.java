package br.com.brunosiqueira.modelo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimeLine {
	
	private LocalDate instante;
	private TipoTransicao transicao;
	private String descricao;
	private Timer timer;
	private ArrayList<Calendar> tempoPercorrido;
	
	public TimeLine() {
		super();
		this.tempoPercorrido = new ArrayList<Calendar>();
	}
	
	public TimeLine(TipoTransicao transicao, String descricao) {
		super();
		this.instante = LocalDate.now();
		this.transicao = transicao;
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TipoTransicao getTransicao() {
		return transicao;
	}

	public void setTransicao(TipoTransicao transicao) {
		this.transicao = transicao;
	}

	public LocalDate getInstante() {
		return instante;
	}

	public void setInstante(LocalDate instante) {
		this.instante = instante;
	}
	
	public void registrar(){
		Calendar tmp = Calendar.getInstance();
		this.tempoPercorrido.add(tmp);
	}
	
	public StringBuilder retornaTempo(){
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss:ms:ms Z");
		StringBuilder time = new StringBuilder();
		
		for (Calendar c: tempoPercorrido ) {
		  dateFormat.setTimeZone(c.getTimeZone());
		  time.append(dateFormat.format(c.getTime()) + ' ');
		}
		
		return time;
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
