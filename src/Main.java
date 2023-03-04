import Professions.Accountant.Accountant;
import Professions.Director.Director;
import Professions.Employee.Employee;

import ECM.EmployeeContract.EmployeeContract;
import ECM.FinanceContract.FinanceContract;
import ECM.GoodsContract.GoodsContract;
import ECM.Registry.Registry;


import java.util.Date;

public class Main {
  public static void main(String[] args) {
    // Task 1
      new Director().getPositionInfo();
      new Accountant().getPositionInfo();
      new Employee().getPositionInfo();
      System.out.println();

    // Task 2
    Registry registry = new Registry();

    GoodsContract goodsContract = new GoodsContract(
            111,
            new Date(),
            "Товары для дома",
            4
    );
    registry.saveDocument(goodsContract);
    registry.getInfo(goodsContract);

    EmployeeContract employeeContract = new EmployeeContract(
            10212,
            new Date(),
            new Date(2023, 3, 15),
            "Иванов Иван Иванович"
    );
    registry.saveDocument(employeeContract);
    registry.getInfo(employeeContract);

    FinanceContract financeContract = new FinanceContract(
            10099,
            new Date(),
            100500,
            121
    );
    registry.saveDocument(financeContract);
    registry.getInfo(financeContract);

  }
}
