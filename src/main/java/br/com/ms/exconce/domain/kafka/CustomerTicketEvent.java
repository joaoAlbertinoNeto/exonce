package br.com.ms.exconce.domain.kafka;

public class CustomerTicketEvent {
	private String name;
	private int amout;
	private String time;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmout() {
		return amout;
	}
	public void setAmout(int amout) {
		this.amout = amout;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	@Override
	public String toString() {
		return "{name:" + name + ", amout:" + amout + ", time:" + time + "}";
	}
	
}
