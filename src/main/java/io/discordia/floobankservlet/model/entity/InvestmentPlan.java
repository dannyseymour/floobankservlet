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
public class InvestmentPlan {
  @PrimaryKey(autoGenerate=true)
  @ColumnInfo(name="id")
  private int id;

  @ColumnInfo(name="account_id")
  private int account_id;

  @ColumnInfo(name="plan_number")
  private int planNumber;

  @ColumnInfo(name="plan_name")
  private String planName;


}
