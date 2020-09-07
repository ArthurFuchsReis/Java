
package manipulacaoDatas;

import org.joda.time.DateTime;


public class ManipulacaoDatas {
    
  public Boolean diferencaDataHoras(DateTime ini, DateTime fim){
        
    	long diff = fim.getMillis() - ini.getMillis();
    	
    	Long totalSegundos = diff / 1000;
    	Long dias = totalSegundos / 60 / 60 / 24;
    	long minutos = (totalSegundos / 60) % 60;
    	long horas = totalSegundos / 60 / 60;
    	long segundos = (totalSegundos / 60 / 60) % 60;
        return  minutos>0 && horas>=0;
    	
    }

}
