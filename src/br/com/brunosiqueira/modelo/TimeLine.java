package br.com.brunosiqueira.modelo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimeLine {
	private Integer id;
	private LocalDate instante;
	private TipoTransicao transicao;
	private String descricao;
	private Pessoa pessoaParecer;

	private ArrayList<Calendar> tempoPercorrido;
	
	public TimeLine() {
		super();
		this.tempoPercorrido = new ArrayList<Calendar>();
	}
	
	public TimeLine(TipoTransicao transicao, String descricao, Pessoa pessoaParecer) {
		super();
		this.registrar(transicao, descricao, pessoaParecer);
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
	
	public void registrar(TipoTransicao transicao, String descricao, Pessoa pessoaParecer){
		this.instante = LocalDate.now();
		this.transicao = transicao;
		this.descricao = descricao;
		this.pessoaParecer = pessoaParecer;
		
		//Calendar tmp = Calendar.getInstance();
		//this.tempoPercorrido.add(tmp);
	}
	
	// mover para a classe de controle TimeTracking
	public StringBuilder retornaTempo(){
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss:ms:ms Z");
		StringBuilder time = new StringBuilder();
		
		for (Calendar c: tempoPercorrido ) {
		  dateFormat.setTimeZone(c.getTimeZone());
		  time.append(dateFormat.format(c.getTime()) + ' ');
		}
		
		return time;
	}
	
	// deverá ter um atributo de periodo na classe de controle TimeTracking
	public ArrayList<Calendar> periodo(){
		return tempoPercorrido;	
	}
	
	// metodo apenas para exemplo, em breve estarei removendo
	public void iniciaCronometro(){
    	Timer timer = null;  
    	
        final SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        
        if (timer == null)   
         {      
            timer = new Timer();  
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
            timer.scheduleAtFixedRate(tarefa, 0, 1000);      
        }    
    }

	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}
	
}
