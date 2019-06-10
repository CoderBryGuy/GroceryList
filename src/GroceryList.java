import java.util.ArrayList;

public class GroceryList {

    private int[] myNumbers = new int[50];
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGrocerList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));

        }


    }
    public void modifyGrocerList(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + "has been modified");
    }

    public void removeGrocerListItem(int position){
        System.out.println("Removing " + groceryList.get(position));
        groceryList.remove(position);

    }
}
