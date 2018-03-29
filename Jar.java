import java.util.*;

class Jar(){
	private Long amount;
	private final int capacity = 32; //Fluid ounces
	private int volume;

	public Jar(){
		this.amount = 0;
		this.volume = 0;
	}

	public Boolean add(Coin c){
		if(c.getCountry().equals("US") && (this.volume+c.getVolume() <= this.capacity )){
			this.amount = this.amount + c.getValue();
			this.volume = this.volume + c.getVolume();

			return true;
		} else{
			return false;
		}
	}

	public void reset(){
		this.amount = 0;
		this.volume = 0;
	}

	public Long getAmount(){
		return this.amount;
	}
	public void setAmount(Long amount){
		this.amount = amount;
	}
	public int getVolume(){
		return this.volume;
	}
	public void setVolume(int volume){
		this.volume = volume;
	}
}

class Coin{
	private int value;
	private String country;
	private int volume; //ounce

	public int getValue(){
		return this.volume;
	}
	public void setValue(int value){
		this.value = value;
	}
	public String getCountry(){
		return this.country;
	}
	public void setCountry(String country){
		this.country = country;
	}
	public int getVolume(){
		return this.volume;
	}
	public void setVolume(int volume){
		this.volume = volume;
	}
}