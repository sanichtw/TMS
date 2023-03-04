package ECM.AbstractDocument;

import ECM.Information.Document;

import java.util.Date;

public abstract class AbstractDocument implements Document {
  protected int documentNumber;
  protected Date documentDate;

  public AbstractDocument() {
  }

  public AbstractDocument(int documentNumber, Date documentDate) {
    this.documentNumber = documentNumber;
    this.documentDate = documentDate;
  }

  public int getDocumentNumber() {
    return documentNumber;
  }
}
