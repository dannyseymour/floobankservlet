package io.discordia.floobankservlet.model.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(foreignKeys = {
    @ForeignKey(
        entity = Holding.class,
        parentColumns = "holding_id",
        childColumns = "holding_id",
        onDelete = ForeignKey.CASCADE
    )})
public class Security {

  @PrimaryKey(autoGenerate=true)
  @ColumnInfo(name = "id")
  private int id;

  @ColumnInfo(name = "type")
  private String type;

  @ColumnInfo(name = "interest_rate")
  private double interestRate;

  @ColumnInfo(name = "description")
  private String description;

  @ColumnInfo(name = "trade_currency")
  private String tradeCurrency;

  @ColumnInfo(name = "income_currency")
  private String incomeCurrency;

  @ColumnInfo(name = "sedol")
  private int sedol;

  public int getId() {
    return id;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public double getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(double interestRate) {
    this.interestRate = interestRate;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getTradeCurrency() {
    return tradeCurrency;
  }

  public void setTradeCurrency(String tradeCurrency) {
    this.tradeCurrency = tradeCurrency;
  }

  public String getIncomeCurrency() {
    return incomeCurrency;
  }

  public void setIncomeCurrency(String incomeCurrency) {
    this.incomeCurrency = incomeCurrency;
  }

  public int getSedol() {
    return sedol;
  }

  public void setSedol(int sedol) {
    this.sedol = sedol;
  }
}