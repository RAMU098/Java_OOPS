package CollectionFrameWork;
                                                            //using Comparator interface for sorting the custom elements like product,employee etc.
import java.util.Comparator;
public class PriceComparator implements Comparator<Product>{   //use class name with what we compareTo if id we can give class name has IdComparator for name or price use price and name Cpmparator has class name
	@Override
	public int compare(Product p1,Product p2) {         
		return Integer.compare  (p1.getProprice(),p2.getProprice());
	}

}
