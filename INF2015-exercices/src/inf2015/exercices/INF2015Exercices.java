/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf2015.exercices;

import java.io.IOException;
import net.sf.json.*;
/**
 *
 * @author ck191148
 */
public class INF2015Exercices {

    public static void main(String[] args) {
        
        JSONObject jo = new JSONObject();
        JSONArray ja = new JSONArray();
 
        try{
            String monString = FileReader.loadFileIntoString("C:/Users/ck191148/Documents/NetBeansProjects/INF2170/unFichierJSON.json", "UTF-8");
            JSONArray jaEntree = JSONArray.fromObject(monString);
            int size = jaEntree.size();
            jo.accumulate("id", "1321033823");
            jo.accumulate("total", "29.70");
            jo.accumulate("date", "11/11/2011");
            jo.accumulate("validated", true);
            for(int i =0 ; i< size; i++){
                if(jaEntree.getJSONObject(i).getDouble("price") < 10){
                    ja.add(jaEntree.getJSONObject(i));
                }
            }
            jo.accumulate("albums", ja);
            System.out.println(jo);
        } catch(IOException e){
            System.out.println(e.getMessage());
        }

        
        
    }
    
}
