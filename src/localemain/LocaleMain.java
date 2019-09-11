package localemain;

import java.util.Locale;

/**
 *
 * @author usharifzoda
 */
public class LocaleMain {

    public static void main(String[] args) {
        // Create Locale Object 
        
        Locale myLocale = Locale.getDefault();
        
        //Display Locale Info
        System.out.println(myLocale);
        System.out.println(myLocale.getCountry());
        System.out.println(myLocale.getDisplayCountry());
        System.out.println(myLocale.getLanguage());
        System.out.println(myLocale.getISO3Country());
        
        for(Locale locale : Locale.getAvailableLocales()){
            System.out.println(locale);
        }
        
    }
    
}
