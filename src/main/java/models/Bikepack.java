package models;

/**
 * Created by Guest on 8/24/17.
 */
    public class Bikepack extends Backpack {

        private static boolean pannier = true;
        public static final String DATABASE_TYPE = "bikepack";


    public Bikepack(String brand, String model, String description, int waterResistance, int durability, int productId, double price) {
            super(brand, model,  description, waterResistance, durability, productId, price);


            type = DATABASE_TYPE;

        }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public boolean isPannier() {
        return pannier;
    }

    public void setPannier(boolean pannier) {
        this.pannier = pannier;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getWaterResistance() {
        return waterResistance;
    }

    public void setWaterResistance(int waterResistance) {
        this.waterResistance = waterResistance;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



}
