package br.com.brunosiqueira.modelo;

import java.util.List;

public class TimeTracking {
	private Integer id;
	private long tempoTotal;
	private List<TimeLine> timeLine;
	
	public TimeTracking() {
		super();
	}
		
	public long getTempoTotal() {
		return tempoTotal;
	}
	
	public void setTempoTotal(long tempoTotal) {
		this.tempoTotal = tempoTotal;
	}
	
	public Integer getId() {
		return id;
	}

	
	public List<TimeLine> getTimeLine() {
		return timeLine;
	}

	
	public void setTimeLine(List<TimeLine> timeLine) {
		this.timeLine = timeLine;
	}
	
}
