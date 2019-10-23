package io.discordia.floobankservlet.model.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity ( foreignKeys = {
    @ForeignKey(
        entity = Account.class,
        parentColumns = "account_id",
        childColumns = "account_id",
        onDelete = ForeignKey.CASCADE
    )})
public class Holding {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="id")
    private int id;

    @ColumnInfo(name="security_type")
    private String securityType;

    @ColumnInfo(name="description")
    private String description;

    @ColumnInfo(name="price")
    private double price;

    @ColumnInfo(name="quantity")
    private int quantity;

    @ColumnInfo(name="security_id")
    private int securityId;

    public int getId() {
        return id;
    }

    public String getSecurityType() {
        return securityType;
    }

    public void setSecurityType(String securityType) {
        this.securityType = securityType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSecurityId() {
        return securityId;
    }

    public void setSecurityId(int securityId) {
        this.securityId = securityId;
    }
}
