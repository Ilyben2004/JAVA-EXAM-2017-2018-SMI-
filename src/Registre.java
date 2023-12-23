import java.util.*;
public class Registre extends  LinkedList<Produit>{


    // II A METHODE NORMALE
    Registre css(int qt){
        Registre r = new Registre();
        for(Produit p : this){
            if(p.quantite==qt){
                r.add(p);
            }
        }
        return  r;
    }


    // II A METHODE ITERATOR
    Registre cssIt(int qt){
        Registre r = new Registre();
       ListIterator<Produit> it = this.listIterator();
       Produit p ;
       while (it.hasNext()){
           p=it.next();

           if(p.quantite==qt){
               r.add(p);
           }
       }
        return  r;
    }


    Map <String,Integer> scommandes(){
        Map <String , Integer > map = new HashMap<>();
        for(Produit p : this){
            if (map.containsKey(p.code)){
                map.put(p.code,map.get(p.code)+p.quantite);
            }
            else{
       map.put(p.code,p.quantite);
            }
        }

        return map;
    }

String plusCommandeProduit(){
        String code="";
        int maxQuantity=0;
        for(Produit p : this){
            if(p.quantite>maxQuantity){
                maxQuantity=p.quantite;
                code=p.code;
            }
        }

        return  code;

}


}

