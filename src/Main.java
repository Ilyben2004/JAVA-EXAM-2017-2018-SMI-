import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Creating products
        Produit p1 = new Produit("P001", 10);
        Produit p2 = new Produit("P002", 20);
        Produit p3 = new Produit("P001", 15);

        // Creating a register and adding products
        Registre register = new Registre();
        register.add(p1);
        register.add(p2);
        register.add(p3);

        // Testing css method with quantity
        Registre filteredByQuantity = register.css(15);
        System.out.println("Filtered by quantity (15): " + filteredByQuantity);

        // Testing cssIt method with quantity
        Registre filteredByQuantityIterator = register.cssIt(20);
        System.out.println("Filtered by quantity using Iterator (15): " + filteredByQuantityIterator);

        // Testing scommandes method
        Map<String, Integer> commandesMap = register.scommandes();
        System.out.println("Commandes Map: " + commandesMap);

        // Testing plusCommandeProduit method
        String mostOrderedProduct = register.plusCommandeProduit();
        System.out.println("Most ordered product: " + mostOrderedProduct);
    }
}
