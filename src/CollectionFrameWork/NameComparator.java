package CollectionFrameWork;
import java.util.Comparator;
//public class NameComparator implements Comparator<Employee>{
//	@Override
//	public int compare(Employee e1,Employee e2) {
	//	return e1.getEname().compareTo(e2.getEname());   //for string comparator 
//	}

//}
public class NameComparator implements Comparator<Employee>{
@Override
public int compare(Employee e1,Employee e2) {
	return Integer.compare(e1.getEno(), e2.getEno()); //for integer comparator  for sorting
}
}
