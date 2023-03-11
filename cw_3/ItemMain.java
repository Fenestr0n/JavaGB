package cw_3;

import java.util.ArrayList;
import java.util.List;
/*
 * Даны сведения об экспортируемых товарах: указывается наименование товара, страна, экспортирующая товар, и объем поставляемой
 * партии в штуках. Найти страны, которые экспортируют данный товар, и общий объем его экспорта.
 */
public class ItemMain {
    public static void main(String[] args) {
        ItemInfo itemInfo = new ItemInfo("qwe", "asd", 3);
        ItemInfo itemInfo2 = new ItemInfo("qwe", "asd", 4);
        ItemInfo itemInfo3 = new ItemInfo("qwe2", "asd3", 5);
        
        List<ItemInfo> itemList = new ArrayList<>();
        itemList.add(itemInfo);
        itemList.add(itemInfo2);
        itemList.add(itemInfo3);
        System.out.println(itemList);
        String searchName = "qwe";
        Integer sumValume = 0;
        List<String> country = new ArrayList<>();
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).getItemName().equals(searchName)) {
                sumValume += itemList.get(i).getValue();
                boolean f = true;
                for (int j = 0; j < country.size(); j++) {
                    if (itemList.get(i).getCountryName().equals(country.get(j))) {
                        f = false;
                    }
                }
                if (f) {
                    country.add(itemList.get(i).getCountryName());
                }
            }
        }
        System.out.println("Country: " + country);
        System.out.println("sumVolume = " + sumValume);

    }
}
