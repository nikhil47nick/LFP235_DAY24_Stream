package Com.BridgeLabz.Stream;

import java.util.Comparator;

public class SortByName implements Comparator<Address> {


    @Override
    public int compare(Address o1, Address o2) {
        return o1.getName().compareTo(o2.getName());
    }


}
