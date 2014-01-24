/**
 * Questa classe permette di instanziare date. Viene ancora una volta mostrato il grande vantaggio che offre 
 * l'incapsulamento, permettendo di fare controlli sui dati inseriti dall'utente.
 * @author Giacomo
 */
package utils;

public class Date {
	private int year;
	private int month;
	private int day;
	public Date(int day, int month, int year){
    	setDay(day);
        setMonth(month);
        setYear(year);
    }
    public int getDay(){
        return day;
    }
    public void setDay(int day){
        int maxDay=31;
        switch(month){
            case 2: maxDay=28;
                break;
            case 4: case 6: case 9: case 11:
                maxDay=30;
                break;
            default: break;
        }
        if(day<1){
        	verificaData();
            day=1;
        }else if(day>maxDay){
        	verificaData();
            day=maxDay;
        }
        this.day=day;
    }
    public int getMonth(){
        return month;
    }
    public void setMonth(int month){
        if(month<1){
        	verificaData();
            month=1;
        }
        else if(month>12){
        	verificaData();
            month=12;
        }
        this.month=month;
        setDay(this.day);
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year=year;
    }
    public void verificaData(){
    	System.err.println("Attenzione, vefica il corretto inserimento della data");
    }
    @Override
    public String toString(){
    	return getDay()+"-"+getMonth()+"-"+getYear();
    }
}
