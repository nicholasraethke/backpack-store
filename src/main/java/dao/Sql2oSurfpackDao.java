package dao;

import models.Backpack;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;


public class Sql2oSurfpackDao implements BackPackDao{

    private final Sql2o sql2o;

    public Sql2oSurfpackDao(Sql2o sql2o){
        this.sql2o = sql2o;
    }

    @Override
    public void add (Backpack backpack) {
        String sql = "INSERT INTO backpacks (brand, model, description, waterResistance, durability, productId, price) VALUES (:brand, :model, :description, :waterResistance, :durability, :productId, :price)";
        try(Connection con = sql2o.open()){
            int id = (int) con.createQuery(sql)
                    .bind(backpack)
                    .executeUpdate()
                    .getKey();
            backpack.setId(id);
        } catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }


}