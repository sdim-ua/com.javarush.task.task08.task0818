package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        
         HashMap<String, Integer > map = new HashMap<>();
         
        map.put("Иванов", 100);
        map.put("Петров", 200);
        map.put("Сидоров", 300);
        map.put("Антонов", 400);
        map.put("Павлов", 500);
        map.put("Козлов", 600);
        map.put("Иванов1", 700);
        map.put("Иванов2", 800);
        map.put("Антонов1", 900);
        map.put("Крючков", 1000);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        
             Iterator<Map.Entry<String, Integer> iterator = map.entrySet().iterator();
         
         while (iterator.hasNext()){
                 Map.Entry<String,Integer> entry = iterator.next();
                 Integer salary = entry.getValue();
			            if(salary <500) {
				iterator.remove();
			}                 
         }
    }

    public static void main(String[] args) {

    }
}
