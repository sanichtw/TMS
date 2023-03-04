package ECM.EmployeeContract;

import ECM.AbstractDocument.AbstractDocument;

import java.util.Date;

public class EmployeeContract extends AbstractDocument {
  private Date endDate;
  private String employeeName;

  public EmployeeContract() {
  }

  public EmployeeContract(int documentNumber, Date documentDate, Date endDate, String employeeName) {
    super(documentNumber, documentDate);
    this.endDate = endDate;
    this.employeeName = employeeName;
  }

  @Override
  public String getInfo() {
    return "Контракт с сотрудником №" + documentNumber + " от " + documentDate.toString() +
        "\nИмя сотрудника: " + employeeName+
        "\nОкончание контракта: " + endDate + "\n";
  }
}
