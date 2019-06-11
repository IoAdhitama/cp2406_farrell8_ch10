public class PetSold extends ItemSold
{
    protected boolean isVaccinated;
    protected boolean isNeutered;
    protected boolean isHousebroken;

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }
    public void setNeutered(boolean neutered) {
        isNeutered = neutered;
    }
    public void setHousebroken(boolean housebroken) {
        isHousebroken = housebroken;
    }

    PetSold(int number, String descript, int price, boolean vaccinated, boolean neutered, boolean housebroken)
    {
        super(number, descript, price);
        setVaccinated(vaccinated);
        setNeutered(neutered);
        setHousebroken(housebroken);
    }

    public void display()
    {
        System.out.print("Invoice number " + getInvoiceNum() + ": " + getDescription()
                + " ($" + getPrice() + "). ");
        if (isVaccinated) System.out.print("The pet has been vaccinated. ");
        if (isNeutered) System.out.print("The pet has been neutered. ");
        if (isHousebroken) System.out.print("The pet has been housebroken. ");
        System.out.println();
    }

}
