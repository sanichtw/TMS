package ECM.GoodsContract;

import ECM.AbstractDocument.AbstractDocument;

import java.util.Date;

public class GoodsContract extends AbstractDocument {
  private String goodsType;
  private int goodsQuantity;

  public GoodsContract() {
  }

  @Override
  public String getInfo() {
    return "Котракт на поставку товаров №" + documentNumber + " от " + documentDate.toString() +
        "\nТип товаров: " + goodsType +
        "\nКоличество товаров: " + goodsQuantity + "\n";
  }

  public GoodsContract(int documentNumber, Date documentDate, String goodsType, int goodsQuantity) {
    super(documentNumber, documentDate);
    this.goodsType = goodsType;
    this.goodsQuantity = goodsQuantity;
  }
}
