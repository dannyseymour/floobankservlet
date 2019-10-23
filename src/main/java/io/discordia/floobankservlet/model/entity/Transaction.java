package io.discordia.floobankservlet.model.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import java.util.Date;

@Entity( foreignKeys = {
    @ForeignKey(
        entity = Account.class,
        parentColumns = "account_id",
        childColumns = "account_id",
        onDelete = ForeignKey.CASCADE
    )})
public class Transaction {
  @PrimaryKey(autoGenerate=true)
  @ColumnInfo(name="id")
  private int id;

  @ColumnInfo(name="account_id")
  private int accountId;

  @ColumnInfo(name="description")
  private String description;

  @ColumnInfo(name="category_id")
  private String categoryId;

  @ColumnInfo(name="transaction_date")
  private Date transactionDate;

  @ColumnInfo(name="post_date")
  private Date postDate;

  @ColumnInfo(name="base_type")
  private String baseType;

  @ColumnInfo(name="merchant")
  private String merchant;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getAccountId() {
    return accountId;
  }

  public void setAccountId(int accountId) {
    this.accountId = accountId;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }

  public Date getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(Date transactionDate) {
    this.transactionDate = transactionDate;
  }

  public Date getPostDate() {
    return postDate;
  }

  public void setPostDate(Date postDate) {
    this.postDate = postDate;
  }

  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public String getMerchant() {
    return merchant;
  }

  public void setMerchant(String merchant) {
    this.merchant = merchant;
  }
}
