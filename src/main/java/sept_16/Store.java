package sept_16;

import java.util.*;

public class Store {
    private String name;
    private String owner_name;
    private int numOfProductsLeft;
    private Necklace[] products;


    Store(String name, String owner_name){
        this.name = name;
        this.owner_name = owner_name;
        this.numOfProductsLeft = 20;
        this.products = new Necklace[] {
                new Necklace("A", 40),
                new Necklace("B", 40),
                new Necklace("C", 40),
                new Necklace("D", 40),
                new Necklace("E", 40),
                new Necklace("F", 40),
                new Necklace("G", 40),
                new Necklace("H", 40),
                new Necklace("I", 40),
                new Necklace("J", 40),
                new Necklace("K", 40),
                new Necklace("L", 40),
                new Necklace("M", 40),
                new Necklace("N", 40),
                new Necklace("O", 40),
                new Necklace("P", 40),
                new Necklace("Q", 40),
                new Necklace("R", 40),
                new Necklace("S", 40),
                new Necklace("T", 40)
        };

    }

    void addProduct(Necklace product){
        if(numOfProductsLeft < 20) {
            this.products[numOfProductsLeft - 1] = product;
            numOfProductsLeft++;
        } else {
            System.out.println("Inventory already maxed out at 20");
        }
    }
    
    void sell(int id){
        if(numOfProductsLeft > 0) {
            List<Necklace> tempList = new ArrayList<Necklace>();
            Collections.addAll(tempList, this.products);

            for (int i = 0; i < numOfProductsLeft; i++) {
                if (this.products[i].getItem_id() == id) {
                    tempList.remove(i);
                    tempList.add(null);
                }
            }
            this.products = tempList.toArray(new Necklace[0]);
            numOfProductsLeft--;
        }
    }

    void restock(){
        int char_name_int = 84;
        for (int i = 19; i > numOfProductsLeft-1; --i) {
            products[i] = new Necklace((Character.toString((char)char_name_int)), (Math.random() * 1000) + 50);
            char_name_int--;
        }
        this.numOfProductsLeft = 20;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public int getNumOfProductsLeft() {
        return numOfProductsLeft;
    }

    public Necklace[] getProducts() {
        return products;
    }

    public void listProducts(){
        System.out.println(Arrays.toString(this.getProducts()));
    }
    
}
