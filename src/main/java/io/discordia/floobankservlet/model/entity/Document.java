package io.discordia.floobankservlet.model.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(foreignKeys = {
    @ForeignKey(
        entity = Account.class,
        parentColumns = "account_id",
        childColumns = "account_id",
        onDelete = ForeignKey.CASCADE
    )
})
public class Document {
  @PrimaryKey(autoGenerate = true)
  @ColumnInfo(name="id")
  private long id;

  @ColumnInfo(name="doc_type")
  private String docType;

  @ColumnInfo(name="name")
  private String name;

  @ColumnInfo(name="type")
  private String type;

  @ColumnInfo(name="status")
  private String status;

  @ColumnInfo(name="doc_content")
  private String docContent;

  public long getId() {
    return id;
  }

  public String getDocType() {
    return docType;
  }

  public void setDocType(String docType) {
    this.docType = docType;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getDocContent() {
    return docContent;
  }

  public void setDocContent(String docContent) {
    this.docContent = docContent;
  }
}
