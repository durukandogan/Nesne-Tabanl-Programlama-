
package toplamadd1;

public class Toplamadd1 {


    public static void main(String[] args) {
        toplamaislemi(1);
        toplamaislemi(1,1);
        toplamaislemi(1,2);
        toplamaislemi(2,2);
        toplamaislemi(2,3);
        toplamaislemi(3,3);
        toplamaislemi(3,4);
        toplamaislemi(4,4);
        toplamaislemi(4,5);
        toplamaislemi(5,5);  
        /*
        Burada toplamaişlemi değişkenine parametreleri giriyorum,
        yani ekran çıktısı olarak gözükecek kısım burada yapmış oluyorum.
        Sırayla sayılarımı yazdım ve 1 den 10' a kadar sırlamaış oldum.
        Girmiş olduğum parametreleri kendi aralarında topluyor ve sonra 
        bir sonraki parametreye geçiyor. 
        Void kullandığımız içinde parametreler bittiği zaman,
        geriye değer döndürmüyor ve işlemi sonlandırıyor.
        */
    }
     public static void toplamaislemi(int... durukan) 
  /*değişken sayılı bir parametre olduğu için yani 
   istediğimiz sayıda parametre oluşturacapımız için, burada üç nokta (...) kullandım. 
   Bu üç nokta sayesinde girmiş olduğumuz parametreler yani sayılar ard arda sıralanıp toplanabilecek.
   Yani biz burada bir dizi oluşturmuş oluyoruz. Bu üç nokta (...) bu işlevi görüyor.
   */     
{
int toplamadegerleri=0;
/*Bu sayıların toplanabilmesi için toplamdegerleri adında bir değişken tanımladım.
toplamdegerleri=0 diyerek de toplama işleminin 0'dan başlamasını sağladım,
eğer toplamdeğerleri=1 deseydim 2 den başlayarak devam edecekti.
Bu yüzden mantık olarak 0'dan başlatıyoruz.*/

for(int sayı: durukan)
 /*for döndüsünün içinde oluşturduğum sayı değişkeni dönecek,
 Bu sayı değişkeni de değerini durukan isminde adlandırıdığım parametreler içinden alıcak.
Yani durukan diye adlandlandırdığım parametreyi kullanarak parametreleri tek tek alamasını sağlıyorum.
 */
{
toplamadegerleri+=sayı;
/*
Sayıların kendi aralrında toplanmasını sağlıyorum. Hangi işlemi girer isek o işlemi yapıyor. 
Toplama işlemi yapıp sayıları sıralayacağımız için *= kullandım.
*/
}
    System.out.println(toplamadegerleri);
  /*Sonucu ekrana yazdırması için de System.out.println kullanarak,
    toplamdeğerleri değişkeninin işlemlerini ekrana yazırması için parantezin içine yazıyorum.
    Kısaca sonucu ekrana yazdıracak.
  */  
}
}
