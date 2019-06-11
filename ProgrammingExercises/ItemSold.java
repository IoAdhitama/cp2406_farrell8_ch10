public class ItemSold
{
    protected int invoiceNum;
    protected String description;
    protected int price;

    public int getInvoiceNum() {
        return invoiceNum;
    }
    public String getDescription() {
        return description;
    }
    public int getPrice() {
        return price;
    }

    public void setInvoiceNum(int invoiceNum) {
        this.invoiceNum = invoiceNum;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public ItemSold(int number, String descript, int price)
    {
        setInvoiceNum(number);
        setDescription(descript);
        setPrice(price);
    }

    public void display()
    {
        System.out.println("Invoice number " + getInvoiceNum() + ": " + getDescription()
                + " ($" + getPrice() + "). ");
    }
}
