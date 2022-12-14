package day42_abstractClass_interfaces;

import javax.lang.model.element.VariableElement;
import java.time.Year;

public class K_ChildClassOfInterfaces implements I02_Interfaces,I03_Interfaces{


    private static final String ISIM = "Yildiz Koleji";

    /*
                  Bir class'i bir interface'e child yapmak icin implements keyword kullanilir
                  implements dedikten sonra virgul yazarak istedigimiz kadar interface ekleyebiliriz
                 */
    public static void main(String[] args) {
        System.out.println(I03_Interfaces.SAYI); // 20
        System.out.println(I02_Interfaces.SAYI); // 30
        System.out.println(ISIM); // Yildiz Koleji
    }
}