package gepjarmu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Orszagut {
    private List<Jarmu> jarmulista;
    
    public final void jarmuvekJonnek(String filename){
        jarmulista = new ArrayList();
        try{
            FileReader r = new FileReader(filename);
            BufferedReader br = new BufferedReader(r);
            String sor = br.readLine();
            while(sor!=null){
                String[] adatok = sor.split(" ");
                if(adatok[0].equals("robogo")){
                    jarmulista.add(new Robogo(Integer.parseInt(adatok[2]),Integer.parseInt(adatok[3]),adatok[1]));
                }
                else if(adatok[0].equals("audi")){
                    jarmulista.add(new AudiS8(Boolean.parseBoolean(adatok[3]),Integer.parseInt(adatok[2]),adatok[1]));
                }
                sor = br.readLine();
            }
            br.close();
            r.close();
        }
        catch(Exception e){
            System.out.println("Hiba! "+e.getMessage());
        }
    }
}
