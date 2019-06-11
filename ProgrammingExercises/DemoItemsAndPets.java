public class DemoItemsAndPets
{
    public static void main(String[] args)
    {
        ItemSold item1 = new ItemSold(38, "A lamp", 60);
        ItemSold item2 = new ItemSold(42, "The answer to everything", 42);

        PetSold pet1 = new PetSold(666, "Cerberus", 666,
                true, true, true);
        PetSold pet2 = new PetSold(9, "Ice Fairy", 129,
                false, false, true);

        item1.display();
        item2.display();
        pet1.display();
        pet2.display();
    }
}
