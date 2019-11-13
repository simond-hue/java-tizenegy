package arlap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Pekseg {
    private List<Arlap> arlaplista;

    public Pekseg(String filename) {
        arlaplista = new ArrayList();
        try{
            FileReader f = new FileReader(filename);
            BufferedReader br = new BufferedReader(f);
            String sor = br.readLine();
            while(sor != null){
                String[] adat = sor.split(" ");
                if(adat[0] == "Kave"){
                    if(adat[1] == "habog"){
                        arlaplista.add(new Kave(true));
                    }
                    else{
                        arlaplista.add(new Kave(false));
                    }
                }
                else if(adat[0] == "Pogacsa"){
                    arlaplista.add(new Pogacsa(Double.parseDouble(adat[1]),Double.parseDouble(adat[2])));
                }
                sor = br.readLine();
            }
            br.close();
            f.close(); 
        }
        catch(FileNotFoundException e){
            System.out.println("A fájl nem található!");
        }
        catch(IOException e){
            System.out.println("Hiba");
        }
    }
    
    public void etelLeltar(){
        for (Arlap arlap : arlaplista) {
            if(arlap instanceof Pogacsa){
                System.out.println(arlap);
            }
        }
    }
}
