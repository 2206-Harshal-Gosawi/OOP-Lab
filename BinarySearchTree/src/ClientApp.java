import java.util.HashMap;
import java.util.Map;

import DataAccess.Laptop;
import treeDataStructure.BST;

public class ClientApp {

	public static void main(String[] args) {
		BST bstByModel = new BST();
		BST bstByPrice = new BST();
		Map<String, Integer> laptops = new HashMap<String, Integer>();
	    laptops.put("Apple Macbook Air 2017", 64692);
	    laptops.put("HP 15s",49490);
	    laptops.put("Apple Macbook pro 2017", 129999);
	    laptops.put("Lenovo Ideapad Slim 3i", 52490);
	    laptops.put("Acer", 16000);	    
	    laptops.forEach((key, value) -> {
	    	bstByModel.setRootNode(bstByModel.addNode(bstByModel.getRootNode(), new Laptop(key, value),true));
	    	bstByPrice.setRootNode(bstByPrice.addNode(bstByPrice.getRootNode(), new Laptop(key, value),false));
		});
	    
	    System.out.println("Binary Tree constructed by Selling Price");
	    bstByPrice.printInorder(bstByPrice.getRootNode());
	    
	    System.out.println("\nBinary Tree constructed by Model Name");
	    bstByModel.printInorder(bstByModel.getRootNode());
	    
	}

}
