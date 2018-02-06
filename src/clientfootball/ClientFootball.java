/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientfootball;

import eu.dataaccess.footballpool.ArrayOfString;
import eu.dataaccess.footballpool.ArrayOftCountryInfo;

/**
 *
 * @author entrar
 */
public class ClientFootball {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println("Total yellow cards: " + yellowCardsTotal());
        String country = "Spain";
        for(int i = 0; i<countryNames(true).getTCountryInfo().size(); i++){
            System.out.println(defendersFor(countryNames(true).getTCountryInfo().get(i).getSName()));
        }
    }
    
    private static String defendersFor(String country){
        return "The defenders for " + country.trim() + " are: " + 
                allDefenders(country).getString();
    }
    
    private static int yellowCardsTotal() {
        eu.dataaccess.footballpool.Info service = new eu.dataaccess.footballpool.Info();
        eu.dataaccess.footballpool.InfoSoapType port = service.getInfoSoap();
        return port.yellowCardsTotal();
    }

    private static ArrayOfString allDefenders(java.lang.String sCountryName) {
        eu.dataaccess.footballpool.Info service = new eu.dataaccess.footballpool.Info();
        eu.dataaccess.footballpool.InfoSoapType port = service.getInfoSoap();
        return port.allDefenders(sCountryName);
    }

    private static ArrayOftCountryInfo countryNames(boolean bWithCompetitors) {
        eu.dataaccess.footballpool.Info service = new eu.dataaccess.footballpool.Info();
        eu.dataaccess.footballpool.InfoSoapType port = service.getInfoSoap();
        return port.countryNames(bWithCompetitors);
    }
    
}
