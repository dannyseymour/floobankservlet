package io.discordia.floobankservlet.model.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import java.util.Date;

@Entity ( foreignKeys = {
    @ForeignKey(
        entity = Account.class,
        parentColumns = "account_id",
        childColumns = "account_id",
        onDelete = ForeignKey.CASCADE
    )})
public class InvestmentOption {
  @PrimaryKey(autoGenerate=true)
  @ColumnInfo(name="id")
  private int id;

  @ColumnInfo(name="account_id")
  private int accountId;

  @ColumnInfo(name="holding_type")
  private String holdingType;

  @ColumnInfo(name="description")
  private String description;

  @ColumnInfo(name="price")
  private double price;

  @ColumnInfo(name="inception_date")
  private Date inceptionDate;

  @ColumnInfo(name="inception_to_date_return")
  private double inceptionToDateReturn;

  @ColumnInfo(name="year_to_date_return")
  private float yearToDateReturn;

  @ColumnInfo(name="historic_returns")
  private double historicReturns;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getHoldingType() {
    return holdingType;
  }

  public void setHoldingType(String holdingType) {
    this.holdingType = holdingType;
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

  public Date getInceptionDate() {
    return inceptionDate;
  }

  public void setInceptionDate(Date inceptionDate) {
    this.inceptionDate = inceptionDate;
  }

  public double getInceptionToDateReturn() {
    return inceptionToDateReturn;
  }

  public void setInceptionToDateReturn(double inceptionToDateReturn) {
    this.inceptionToDateReturn = inceptionToDateReturn;
  }

  public float getYearToDateReturn() {
    return yearToDateReturn;
  }

  public void setYearToDateReturn(float yearToDateReturn) {
    this.yearToDateReturn = yearToDateReturn;
  }

  public double getHistoricReturns() {
    return historicReturns;
  }

  public void setHistoricReturns(double historicReturns) {
    this.historicReturns = historicReturns;
  }
}
