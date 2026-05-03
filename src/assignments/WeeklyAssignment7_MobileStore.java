/**
 * 
 */
package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *Assignment 2: Mobile Store using ArrayList

Create a class Mobile with:

· brand

· model

· price

Store objects inside an ArrayList<Mobile>.

Operations to Perform

1. Add 5 mobile objects

2. Display all mobiles

3. Sort mobiles based on price in descending order

4. Remove the most expensive mobile

5. Search mobile by brand

6. Update price of one mobile

7. Display final list

---

Expected Output

Original Mobiles: Samsung S23 70000 Apple iPhone15 80000 OnePlus 12 60000 Vivo V30 35000 Realme GT 30000 After Sorting Descending: Apple iPhone15 80000 Samsung S23 70000 OnePlus 12 60000 Vivo V30 35000 Realme GT 30000 After Removing Most Expensive Mobile: Samsung S23 70000

OnePlus 12 60000 Vivo V30 35000 Realme GT 30000 Brand Found: Vivo After Price Update: Samsung S23 68000 OnePlus 12 60000 Vivo V30 35000 Realme GT 30000 
 */

class MobileStore {
String brand;
String model;
int price;

MobileStore(String brand,String model,int price) {
this.brand=brand;
this.model=model;
this.price=price;
}


}
class MobileStoreComparator implements Comparator<MobileStore> {

	@Override
	public int compare(MobileStore o1, MobileStore o2) {
		// TODO Auto-generated method stub
		return o2.price-o1.price;
	}
	
}
public class WeeklyAssignment7_MobileStore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<MobileStore> mobileList=new ArrayList<MobileStore>();
    mobileList.add(new MobileStore("Samsung","S23",70000));
    mobileList.add(new MobileStore("Apple","IPhone15",80000));
    mobileList.add(new MobileStore("OnePlus","12",60000));
    mobileList.add(new MobileStore("Vivo","V30",35000));
    mobileList.add(new MobileStore("Realme","GT",30000));
    System.out.println("Original Mobiles");
    
    for(MobileStore mobileStore : mobileList) {
    	System.out.println(mobileStore.brand + " " + mobileStore.model + " " + mobileStore.price);	
    }
    Collections.sort(mobileList,new MobileStoreComparator());
    System.out.println("After Sorting Descending");
    for(MobileStore mobileStore : mobileList) {
    	System.out.println(mobileStore.brand + " " + mobileStore.model + " " + mobileStore.price);	
    }
    
    MobileStore max = mobileList.get(0);

    for (MobileStore m : mobileList) {
        if (m.price > max.price) {
            max = m;
        }
    }

    mobileList.remove(max);
    
    System.out.println("After Removing Most expensive Mobile");
    for(MobileStore mobileStore : mobileList) {
    	System.out.println(mobileStore.brand + " " + mobileStore.model + " " + mobileStore.price);	
    }
    Scanner sc=new Scanner(System.in);
    System.out.println("Search By Brand Name : ");
    String searchBrand = sc.next();
    sc.close();
    for (MobileStore m : mobileList) {
        if (m.brand.equalsIgnoreCase(searchBrand)) {
            System.out.println("Brand Found: " + m.brand);
        }
    }
    
    ListIterator<MobileStore> it = mobileList.listIterator();

    while (it.hasNext()) {
        MobileStore m = it.next();
        if (m.brand.equals("Samsung")) {
            m.price = 68000;
        }
    }
    
    System.out.println("After Price Update");
    for(MobileStore mobileStore : mobileList) {
    	System.out.println(mobileStore.brand + " " + mobileStore.model + " " + mobileStore.price);	
    }
    
    
	}

}
