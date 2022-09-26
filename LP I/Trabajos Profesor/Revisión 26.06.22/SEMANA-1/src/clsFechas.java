import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class clsFechas {

	public static void main(String[] args) {
		
		System.out.println(new Date());
		
		DateFormat formato = new SimpleDateFormat("YYYY/MM/dd");
		System.out.println(formato.format(new Date()));
		
		DateFormat formato2 = new SimpleDateFormat("YYYY/MM/dd HH:MM:ss");
		System.out.println(formato2.format(new Date()));
		
		Calendar calender = Calendar.getInstance();
		
		System.out.println("Año : " + calender.get(Calendar.YEAR));
		System.out.println("Mes (enero es el mes 0) : " + calender.get(Calendar.MONTH));
		System.out.println(" Día del mes :" + calender.get(Calendar.DAY_OF_MONTH));
		System.out.println("Día de la semana (la semana empieza el domingo) : " + calender.get(Calendar.DAY_OF_WEEK));
		System.out.println("Día del año : " + calender.get(Calendar.DAY_OF_YEAR));
		System.out.println("Semana del año : " + calender.get(Calendar.WEEK_OF_YEAR));
		System.out.println("Semana del mes : " + calender.get(Calendar.WEEK_OF_MONTH));
		System.out.println("Día de la semana en el mes : " + calender.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("AM PM :" + calender.get(Calendar.AM_PM));
		System.out.println("Hora : " + calender.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minutos : " + calender.get(Calendar.MINUTE));
		System.out.println("Segundos : " + calender.get(Calendar.SECOND));

	}

}
