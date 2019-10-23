package io.discordia.floobankservlet.model.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import java.util.Date;

@Entity (foreignKeys = {
    @ForeignKey(
        entity = Account.class,
        parentColumns = "account_id",
        childColumns = "account_id",
        onDelete = ForeignKey.CASCADE
    )
})
public class Statement {
  @PrimaryKey(autoGenerate=true)
  @ColumnInfo(name="id")
  private int id;

  @ColumnInfo(name="account_id")
  private int accountId;

  @ColumnInfo(name="statement_date")
  private Date statementDate;

  @ColumnInfo(name="due_date")
  private Date dueDate;

  @ColumnInfo(name="billing_period_start")
  private Date billingPeriodStart;

  @ColumnInfo(name="billing_period_end")
  private Date billingPeriodEnd;

  @ColumnInfo(name="last_payment_date")
  private Date lastPaymentDate;

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

  public Date getStatementDate() {
    return statementDate;
  }

  public void setStatementDate(Date statementDate) {
    this.statementDate = statementDate;
  }

  public Date getDueDate() {
    return dueDate;
  }

  public void setDueDate(Date dueDate) {
    this.dueDate = dueDate;
  }

  public Date getBillingPeriodStart() {
    return billingPeriodStart;
  }

  public void setBillingPeriodStart(Date billingPeriodStart) {
    this.billingPeriodStart = billingPeriodStart;
  }

  public Date getBillingPeriodEnd() {
    return billingPeriodEnd;
  }

  public void setBillingPeriodEnd(Date billingPeriodEnd) {
    this.billingPeriodEnd = billingPeriodEnd;
  }

  public Date getLastPaymentDate() {
    return lastPaymentDate;
  }

  public void setLastPaymentDate(Date lastPaymentDate) {
    this.lastPaymentDate = lastPaymentDate;
  }
}
