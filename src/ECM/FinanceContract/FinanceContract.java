package ECM.FinanceContract;

import ECM.AbstractDocument.AbstractDocument;

import java.util.Date;

public class FinanceContract extends AbstractDocument {
  private int monthTotal;
  private int departmentCode;

  public FinanceContract() {
  }

  public FinanceContract(int documentNumber, Date documentDate, int monthTotal, int departmentCode) {
    super(documentNumber, documentDate);
    this.monthTotal = monthTotal;
    this.departmentCode = departmentCode;
  }

  @Override
  public String getInfo() {
    return "Финансовая накладная №" + documentNumber + " от " + documentDate.toString() +
            "\nИтоговая сумма за месяц: " + monthTotal +
            "\nКод депортамента: " + departmentCode + "\n";
  }
}
