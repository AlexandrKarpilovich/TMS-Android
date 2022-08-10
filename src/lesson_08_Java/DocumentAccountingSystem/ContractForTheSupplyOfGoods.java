package lesson_08_Java.DocumentAccountingSystem;

import java.util.Date;

/**
 * Class Contract For The Supply Of Goods contains information about the document
 */
public class ContractForTheSupplyOfGoods extends Document {
    private String goodsType; // Goods type
    private int numberOfGoods; // Number of goods

    // Constructor without parameters
    public ContractForTheSupplyOfGoods() {
    }

    // Constructor with parameters of this class
    public ContractForTheSupplyOfGoods(int documentNumber, Date documentDate, String goodsType, int numberOfGoods) {
        super(documentNumber, documentDate);
        this.goodsType = goodsType;
        this.numberOfGoods = numberOfGoods;
    }

    // Overridden method for displaying information about a document
    @Override
    public String informationAboutTheDocument() {
        return "Contract for the supply goods: " +
                "\n\tDocument number: " + getDocumentNumber() +
                "\n\tGoods type: " + getGoodsType() +
                "\n\tNumber of goods: " + getNumberOfGoods() +
                "\n\tDocument date: " + getDocumentDate();
    }

    /*
        Getters and Setters
     */
    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public int getNumberOfGoods() {
        return numberOfGoods;
    }

    public void setNumberOfGoods(int numberOfGoods) {
        this.numberOfGoods = numberOfGoods;
    }

    // Overridden method toString()
    @Override
    public String toString() {
        return informationAboutTheDocument();
    }
}
