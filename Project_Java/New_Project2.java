/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package new_project2; 

/**
 *
 * @author Aditia Nurwansyah
 */
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat; 
public class New_Project2 { 

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    while(true){
    System.out.println("=================================================================");
    System.out.println("===================== APLIKASI PENJUALAN ========================");
    System.out.println("===============                                =================="); 
    
    System.out.println("=====================                    ========================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date( )));  
//    System.out.print("Tanggal   :  "); 
//    String Tanggal= input.next(); 
//    System.out.print("Bulan     :  ");
//    String Bulan= input.next(); 
//    System.out.print("Tahun     :  ");
//    String Tahun= input.next(); 
//    System.out.print("Jam       :  "); 
//    String Jam= input.next();  
    
//    String Nama= input.next();
//    System.out.println("Nama               :");   
   
    
    int Es_Kopi_Susu= 8000;
    String menu_Es_Kopi_susu = " Es Kopi susu "+Es_Kopi_Susu; 
    
    int Kopi_Susu_Caramel= 10000;
    String menu_Kopi_Susu_caramel = " Kopi susu caramel "+Kopi_Susu_Caramel;
    
   int Kopi_Susu_Gula_Aren= 9000;
   String menu_Kopi_Susu_Gula_aren = "  Kopi susu gula aren "+Kopi_Susu_Gula_Aren; 
   
   int V60= 10000;
   String menu_vgo = "  Vgo  "+V60;
   
   int Kopi_Susu_Panas= 8000;
   String menu_Kopi_Susu_panas = "  Kopi susu panas "+Kopi_Susu_Panas;   
   
   int Kopi_Susu_Vanila= 10000;
   String menu_Kopi_Susu_vanila = " Kopi susu vanila "+Kopi_Susu_Vanila;
 
   int Chocolate= 9000;
   String menu_chocolate = "Chocolate "+Chocolate;
   
   int RedVelvet= 9000;
   String menu_redvelvet = "Red Velvet "+RedVelvet;
   
   int BubbleGum= 9000;
   String menu_bubblegum= "BubbleGum "+BubbleGum;
   
   int Milk_Vanila= 9000;
   String menu_milkvanila= "Milk Vanila "+Milk_Vanila;
   
   int Thai_Milk_tea= 9000;
   String menu_thai_milktea= "Thai Milk Tea "+Thai_Milk_tea;
   
   int Taro= 9000;
   String menu_taro= "Taro "+Taro;
   
   int Matcha= 9000;
   String menu_matcha= "Matcha "+Matcha;
   
   int Cokhlat_Panas= 6000;
   String menu_coklat_panas= "Cokhlat Panas "+Cokhlat_Panas;
   
   int Thai_tea_Panas= 6000;
   String menu_thai_tea_panas= "Thai tea panas "+Thai_tea_Panas;
   
   int Matcha_Panas= 6000;
   String menu_matcha_panas= "Matcha panas "+Matcha_Panas;
   
   int Kentang_sosis= 6000;
   String menu_kentang_sosis= "Kentang sosis "+Kentang_sosis;
   
   int Tahu_crispi= 6000;
   String menu_tahu_crispi= "Tahu crispi "+Tahu_crispi;
   
   int Mie= 6000;
   String menu_mie= "Mie "+Mie;
   
   int Mie_telur= 6000;
   String menu_mie_telur= "Mie telur "+Mie_telur;
   
    System.out.println("==============  Menu Pilihan Coffee ==========================================="); 
    System.out.println("==================1===="+menu_Es_Kopi_susu+ "====================================");
    System.out.println("==================2===="+menu_Kopi_Susu_caramel+"================================");  
    System.out.println("==================3===="+menu_Kopi_Susu_Gula_aren+"=============================="); 
    System.out.println("==================4===="+menu_vgo+"=============================================="); 
    System.out.println("==================5===="+menu_Kopi_Susu_panas+"=================================="); 
    System.out.println("==================6===="+menu_Kopi_Susu_vanila+"=================================");  
    System.out.println("==============================================================================="); 
    
    System.out.println("==============  Menu pilihan Milkshake ======================================"); 
    System.out.println("================1===="+menu_chocolate+"========================================"); 
    System.out.println("================2===="+menu_redvelvet+"========================================"); 
    System.out.println("================3===="+menu_bubblegum+"========================================"); 
    System.out.println("================4===="+menu_milkvanila+"========================================");
    System.out.println("================5===="+menu_thai_milktea+"========================================");
    System.out.println("================6===="+menu_taro+"========================================");
    System.out.println("================7===="+menu_matcha+"========================================");
    System.out.println("====================================================================="); 
    
    System.out.println("============== Menu Pilihan lainnya =================================");
    System.out.println("==============1===="+menu_coklat_panas+"===============================");
    System.out.println("==============2===="+menu_thai_tea_panas+"=============================");
    System.out.println("==============3===="+menu_matcha_panas+"===============================");
    System.out.println("==============4===="+menu_kentang_sosis+"==============================");
    System.out.println("==============5===="+menu_tahu_crispi+"================================");
    System.out.println("==============6===="+menu_mie+"========================================");
    System.out.println("==============7===="+menu_mie_telur+"=================================="); 
    System.out.println("====================================================================="); 
    
    Scanner In= new Scanner(System.in);  
    System.out.print("Selamat datang silahkan masukan jumlah menu pesanan  :");      
    int angka= In.nextInt();  
    
    for(int i=0; i<angka; i++){  
       System.out.print("mau pesan apa  :");       
    String menu= In.next();  
    }
    
    System.out.print("beli berapa :");      
    int angka1= In.nextInt();   
    
    int total_menu_Es_Kopi_s= Es_Kopi_Susu*angka1; 
    int total_menu_kopi_sc= Kopi_Susu_Caramel*angka1;
    int total_menu_Kopi_sga= Kopi_Susu_Gula_Aren*angka1;
    int total_menu_V= V60*angka1;
    int total_menu_Kopi_sp= Kopi_Susu_Panas*angka1;  
    int total_menu_Kopi_sv= Kopi_Susu_Vanila*angka1;  
    
    int total_menu_chocolate= Chocolate*angka1; 
    int total_menu_redvelt= RedVelvet*angka1;
    int total_menu_bubblegum= BubbleGum*angka1;
    int total_menu_milkvani= Milk_Vanila*angka1;
    int total_menu_thai_milkt= Thai_Milk_tea*angka1;
    int total_menu_taro= Taro*angka1;
    int total_menu_matcha= Matcha*angka1;
    
    int total_menu_coklat_p= Cokhlat_Panas*angka1;
    int total_menu_thai_tea_p= Thai_tea_Panas*angka1;
    int total_menu_matcha_p= Matcha_Panas*angka1;
    int total_menu_kentang_so= Kentang_sosis*angka1;
    int total_menu_tahu_cris= Tahu_crispi*angka1;
    int total_menu_mie= Mie*angka1;
    int total_menu_mie_t= Mie_telur*angka1;
    
    System.out.println("Apakah ingin mengganti menu?  ");  
    String i= In.next();
    if(i.equalsIgnoreCase("iya")){
        System.out.print("Selamat datang silahkan masukan jumlah menu pesanan  :");       
    int a2= In.nextInt();  
    
    for(int a=0; a<a2; a++){
        System.out.print("Silahkan mau pesan apa :");       
    String menu= In.next(); 
    System.out.print("mau beli berapa :");    
    int b= In.nextInt();  
    System.out.println("----------------------------------------------------");  
    }
    
//    System.out.print("mau beli berapa :");   
//    int b= In.nextInt(); 
//    System.out.println("----------------------------------------------------");     
    }else{
        System.out.println("------------------------------------------------");   
    }  
    
    System.out.println("Tampilkan menu pesanan yang akan dipilih " );   
    System.out.println("Menu 1====="+"Es Kopi Susu"+"-"+"Chocolate");
    System.out.println("menu 2====="+"Kopi Susu Caramel"+"-"+"Red Velvet");
    System.out.println("menu 3====="+"Kopi Susu Gula Aren"+"-"+"Bubble Gum");
    System.out.println("menu 4====="+"V60"+"-"+"Milk Vanila");  
    System.out.println("menu 5====="+"Kopi Susu Panas"+"-"+"Thai Milk Tea");
    System.out.println("menu 6====="+"Kopi Susu Vanila"+"-"+"Taro");
    System.out.println("-----------------------------------------------------"); 
    System.out.println("menu 7====="+"Matcha"+"-"+"Chocolate"); 
    System.out.println("menu 8====="+"Matcha"+"-"+"Red Velvet");
    System.out.println("menu 9====="+"Matcha"+"-"+"Bubble Gum");
    System.out.println("menu 10===="+"Matcha"+"-"+"Milk Vanila");
    System.out.println("menu 11===="+"Matcha"+"-"+"Thai Milk Tea");
    System.out.println("menu 12===="+"Matcha"+"-"+"Taro");
    System.out.println("menu 13===="+"Matcha");
    System.out.println("-----------------------------------------------------"); 
    System.out.println("menu 14===="+"Es Kopi Susu");
    System.out.println("menu 15===="+"Kopi Susu Caramel");
    System.out.println("menu 16===="+"Kopi Susu Gula Aren");
    System.out.println("menu 17===="+"V60");
    System.out.println("menu 18===="+"Kopi Susu Panas");
    System.out.println("menu 19===="+"Kopi Susu Vanila");
    System.out.println("-----------------------------------------------------");
    System.out.println("menu 20===="+"Chocolate");
    System.out.println("menu 21===="+"Red Velvet");
    System.out.println("menu 22===="+"Bubble Gum");
    System.out.println("menu 23===="+"Milk Vanila");
    System.out.println("menu 24===="+"Thai Milk Tea");
    System.out.println("menu 25===="+"Taro");
    System.out.println("-----------------------------------------------------");
    System.out.println("menu 26===="+"Coklat panas");
    System.out.println("menu 27===="+"Thai tea panas");
    System.out.println("menu 28===="+"Matcha Panas");
    System.out.println("menu 29===="+"Kentang sosis");
    System.out.println("menu 30===="+"Tahu Crispi");
    System.out.println("menu 31===="+"Mie");
    System.out.println("menu 32===="+"Mie Telur"); 
    System.out.println("-----------------------------------------------------"); 
    System.out.println("menu 33===="+"Matcha"+"-"+"Es Kopi Susu");
    System.out.println("menu 34===="+"Matcha"+"-"+"Kopi Susu Caramel");
    System.out.println("menu 35===="+"Matcha"+"-"+"Kopi Susu Gula Aren");
    System.out.println("menu 36===="+"Matcha"+"-"+"V60");
    System.out.println("menu 37===="+"Matcha"+"-"+"Kopi Susu Panas");
    System.out.println("menu 38===="+"Matcha"+"-"+"Kopi Susu Vanila");
    System.out.println("----------------------------------------------------");
    System.out.println("menu 39===="+"Chocolate"+"-"+"Coklat panas");
    System.out.println("menu 40===="+"Red Velvet"+"-"+"Thai tea panas");
    System.out.println("menu 41===="+"Bubble Gum"+"-"+"Matcha Panas");
    System.out.println("menu 42===="+"Milk Vanila"+"-"+"Kentang Sosis"); 
    System.out.println("menu 43===="+"Thai Milk Tea"+"-"+"Tahu Crispi");
    System.out.println("menu 44===="+"Taro"+"-"+"Mie");
    System.out.println("menu 45===="+"Matcha"+"-"+"Mie Telur"); 
    System.out.println("----------------------------------------------------"); 
    System.out.println("menu 46===="+"Coklat panas"+"-"+"Es Kopi Susu");
    System.out.println("menu 47===="+"Thai tea panas"+"-"+"Kopi Susu Caramel");
    System.out.println("menu 48===="+"Matcha Panas"+"-"+"Kopi Susu Gula Aren");
    System.out.println("menu 49===="+"Kentang Sosis"+"-"+"v60");
    System.out.println("menu 50===="+"Tahu Crispi"+"-"+"Kopi Susu Panas");
    System.out.println("menu 51===="+"Mie"+"Kopi Susu Vanila");
    System.out.println("menu 52===="+"Mie Telur"+"Kopi Susu Vanila");
    System.out.println("----------------------------------------------------");
    System.out.println("menu 53===="+"Kentang sosis"+"Coklat Panas");
    System.out.println("menu 54===="+"Kentang sosis"+"Thai tea panas");
    System.out.println("menu 55===="+"Kentang sosis"+"Matcha Panas");
    System.out.println("menu 56===="+"Kentang sosis"+"Kentang sosis");
    System.out.println("menu 57===="+"Kentang sosis"+"Tahu Crispi");
    System.out.println("menu 58===="+"Kentang sosis"+"Mie");
    System.out.println("menu 59===="+"Kentang sosis"+"Mie Telur");
    System.out.println("----------------------------------------------------");
    System.out.println("menu 60===="+"Tahu Crispi"+"Coklat Panas");
    System.out.println("menu 61===="+"Tahu Crispi"+"Thai tea panas");
    System.out.println("menu 62===="+"Tahu Crispi"+"Matcha Panas");
    System.out.println("menu 63===="+"Tahu Crispi"+"Kentang sosis");
    System.out.println("menu 64===="+"Tahu Crispi"+"Tahu Crispi");
    System.out.println("menu 65===="+"Tahu Crispi"+"Mie");
    System.out.println("menu 66===="+"Tahu Crispi"+"Mie Telur");
    System.out.println("----------------------------------------------------");
    System.out.println("menu 67===="+"Mie"+"Coklat Panas");
    System.out.println("menu 68===="+"Mie"+"Thai tea panas");
    System.out.println("menu 69===="+"Mie"+"Matcha Panas");
    System.out.println("menu 70===="+"Mie"+"kentang sosis");
    System.out.println("menu 71===="+"Mie"+"Tahu Crispi");
    System.out.println("menu 72===="+"Mie"+"Mie");
    System.out.println("Menu 73===="+"Mie"+"Mie Telur");
    System.out.println("----------------------------------------------------");
    System.out.println("Menu 74===="+"Mie Telur"+"Coklat Panas");
    System.out.println("Menu 75===="+"Mie Telur"+"Thai tea panas");
    System.out.println("Menu 76===="+"Mie Telur"+"Matcha Panas");
    System.out.println("Menu 77===="+"Mie Telur"+"Kentang Sosis");
    System.out.println("Menu 78===="+"Mie Telur"+"Tahu Crispi");
    System.out.println("Menu 79===="+"Mie Telur"+"Mie");
    System.out.println("Menu 80===="+"Mie Telur"+"Mie Telur");
    System.out.println("----------------------------------------------------");
        System.out.println("Menu 81===="+"Es Kopi Susu"+"Chocolate"+"Coklat panas");
        System.out.println("--------------------------------------------------"); 
    System.out.println("Apakah ditampilan menu pesanan ada yang sesuai ?"); 
    String m= In.next();
    if(m.equalsIgnoreCase("ada")){ 
        System.out.println("------------------------------------------------"); 
    }else{
        System.out.println("Mohon maaf tidak ada silahkan mengulang !");
        System.out.print("Masukan jumlah menu pesanan  :");       
    int a2= In.nextInt();  
    
    for(int a=0; a<a2; a++){
        System.out.print("Silahkan mau pesan apa :");       
    String menu= In.next();  
    }
    System.out.print("mau beli berapa  :");
        int b= In.nextInt();   
    }
    
   System.out.print("Masukan pilihan menu yang sesuai dengan pesanan :");      
   int pilihan= In.nextInt();   
   
//    System.out.println("Apakah ingin mengganti menu lagi tidak? ");
//    String i= In.next();
//    if(i.equalsIgnoreCase("iya")){
//        System.out.print("Selamat datang!! mau pilih berapa menu tuan/nyonya :");     
//    int a2= In.nextInt();  
//    
//    System.out.print("Silahkan pilih menu anda :");   
//    String menu= In.next();   
//    
//    System.out.println("mau beli berapa :");    
//    int b= In.nextInt();   
//    }else{
//        System.out.println("Tampilkan menu anda ");  
//    } 
           
    if(pilihan < 2){ 
        System.out.println("=========Menu 1================================="); 
        System.out.println("===="+"Es Kopi Susu"+" "+angka1+" "+Es_Kopi_Susu+" "+total_menu_Es_Kopi_s+"==="); 
        System.out.println("===="+"Chocolate"+" "+angka1+" "+" "+Chocolate+" "+total_menu_chocolate+"======");     
        int total= total_menu_Es_Kopi_s+total_menu_chocolate; 
        System.out.println("                                     Total :"+total);  
        
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai); 
        
        int Kembalian= tunai-total;
        System.out.println("                              Kembalian :"+Kembalian);  
        
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Es Kopi Susu"+" "+angka1+" "+Es_Kopi_Susu+" "+total_menu_Es_Kopi_s+"===");  
        System.out.println("===="+"Chocolate"+" "+angka1+" "+Chocolate+" "+total_menu_chocolate+"======");  
        System.out.println("------------------------------------------------"); 
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
        System.out.println(" Terima kasih sudah belanja di tempat kami :)" ); 
    }else if(pilihan < 3){ 
        System.out.println("=======Menu 2====================================");
        System.out.println("===="+"Kopi susu caramel"+" "+angka1+" "+Kopi_Susu_Caramel+" "+total_menu_kopi_sc+"="); 
        System.out.println("==="+"Red Velvet"+" "+angka1+" "+RedVelvet+" "+total_menu_redvelt+"=========");
        int total= total_menu_kopi_sc+total_menu_redvelt; 
        System.out.println("                                     Total :"+total);
        
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        
        int Kembalian= tunai-total;
        System.out.println("                              Kembalian :"+Kembalian); 
        
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
       System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Kopi Susu Caramel"+" "+angka1+" "+Kopi_Susu_Caramel+" "+total_menu_kopi_sc+"="); 
        System.out.println("==="+"Red Velvet"+" "+angka1+" "+RedVelvet+" "+total_menu_redvelt+"========="); 
        System.out.println("------------------------------------------------"); 
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
        System.out.println(" Terima kasih sudah belanja di tempat kami :)" ); 
    }else if(pilihan < 4){
        System.out.println("======Menu 3====================================");
        System.out.println("===="+"Kopi Susu Gula Aren"+" "+angka1+" "+Kopi_Susu_Gula_Aren+" "+total_menu_Kopi_sga);
        System.out.println("===="+"Bubble Gum"+" "+angka1+" "+BubbleGum+" "+total_menu_bubblegum+"====="); 
        int total= total_menu_Kopi_sga+total_menu_bubblegum; 
        System.out.println("                                     Total :"+total);
        
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));  
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Kopi susu gula aren"+" "+angka1+" "+Kopi_Susu_Gula_Aren+" "+total_menu_Kopi_sga+"="); 
        System.out.println("==="+"Bubble Gum"+" "+angka1+" "+BubbleGum+" "+total_menu_bubblegum+"========="); 
        System.out.println("------------------------------------------------"); 
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
        System.out.println(" Terima kasih sudah belanja di tempat kami :)" ); 
    }else if(pilihan < 5){
        System.out.println("====Menu 4======================================");
        System.out.println("===="+"V60"+" "+angka1+" "+V60+" "+total_menu_V+"====================");
        System.out.println("===="+"Milk Vanila"+" "+angka1+" "+Milk_Vanila+" "+total_menu_milkvani+"=====");  
        int total= total_menu_V+total_menu_milkvani;
        System.out.println("                                     Total :"+total);
        
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"V60"+" "+angka1+" "+V60+" "+total_menu_V+"====================");  
        System.out.println("==="+"Milk Vanila"+" "+angka1+" "+Milk_Vanila+" "+total_menu_milkvani+"======");  
        System.out.println("------------------------------------------------"); 
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
        System.out.println(" Terima kasih sudah belanja di tempat kami :)" ); 
    }else if(pilihan < 6){
        System.out.println("====Menu 5======================================");
        System.out.println("=="+"Kopi Susu Panas"+" "+angka1+" "+Kopi_Susu_Panas+" "+total_menu_Kopi_sp);
        System.out.println("=="+"Thai Milk Tea"+" "+angka1+" "+Thai_Milk_tea+" "+total_menu_thai_milkt);
        int total= total_menu_Kopi_sp+total_menu_thai_milkt;
        System.out.println("                                     Total :"+total);
        
        System.out.print("bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));  
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Kopi Susu Panas"+" "+angka1+" "+Kopi_Susu_Panas+" "+total_menu_Kopi_sp+"===");  
        System.out.println("==="+"Thai Milk Tea"+" "+angka1+" "+Thai_Milk_tea+" "+total_menu_thai_milkt+"===");   
        System.out.println("------------------------------------------------"); 
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
        System.out.println(" Terima kasih sudah belanja di tempat kami :)" ); 
    }else if(pilihan < 7){
        System.out.println("====Menu 6======================================");
        System.out.println("=="+"Kopi Susu Vanila"+" "+angka1+" "+Kopi_Susu_Vanila+" "+total_menu_Kopi_sv);
        System.out.println("=="+"Taro"+" "+angka1+" "+Taro+" "+total_menu_taro);
        int total= total_menu_Kopi_sv+total_menu_taro;
        System.out.println("                                     Total :"+total);
        
        System.out.print("bayarannya :"); 
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Kopi Susu Vanila"+" "+angka1+" "+Kopi_Susu_Vanila+" "+total_menu_Kopi_sv+"===");  
        System.out.println("==="+"Taro"+" "+angka1+" "+Taro+" "+total_menu_taro+"===");     
        System.out.println("------------------------------------------------"); 
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
        System.out.println(" Terima kasih sudah belanja di tempat kami :)" ); 
    }else if(pilihan < 8){
        System.out.println("====Menu 7======================================");
        System.out.println("=="+"Matcha"+" "+angka1+" "+Matcha+" "+total_menu_matcha);
        System.out.println("=="+"Chocolate"+" "+angka1+" "+Chocolate+" "+total_menu_chocolate);
        int total= total_menu_matcha+total_menu_chocolate;
        System.out.println("                                     Total :"+total);
        
        System.out.print("Bayarannya :");
        int tunai= In.nextInt(); 
        System.out.println("                                     Tunai :"+tunai); 
                                            
       int Kembalian= tunai-total;
       System.out.println("                             Kembalian :"+Kembalian);
       
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));  
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Matcha"+" "+angka1+" "+Matcha+" "+total_menu_matcha+"===");  
        System.out.println("==="+"Chocolate"+" "+angka1+" "+Chocolate+" "+total_menu_chocolate+"===");     
        System.out.println("------------------------------------------------"); 
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
        System.out.println(" Terima kasih sudah belanja di tempat kami :)" ); 
    }else if(pilihan < 9){
        System.out.println("====Menu 8======================================");
        System.out.println("=="+"Matcha"+" "+angka1+" "+Matcha+" "+total_menu_matcha);
        System.out.println("=="+"Red Velvet"+" "+angka1+" "+RedVelvet+" "+total_menu_redvelt);
        int total= total_menu_matcha+total_menu_redvelt;
        System.out.println("                                      Total:"+total);
        
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        
        int Kembalian= tunai-total;
        System.out.println("                               Kembalian"+Kembalian);
        
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Matcha"+" "+angka1+" "+Matcha+" "+total_menu_matcha+"===");  
        System.out.println("==="+"Red Velvet"+" "+angka1+" "+RedVelvet+" "+total_menu_redvelt+"===");      
        System.out.println("------------------------------------------------"); 
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
        System.out.println(" Terima kasih sudah belanja di tempat kami :)" ); 
    }else if(pilihan < 10){
        System.out.println("====Menu 9======================================");
        System.out.println("=="+"Matcha"+" "+angka1+" "+Matcha+" "+total_menu_matcha);
        System.out.println("=="+"Bubble Gum"+" "+angka1+" "+BubbleGum+" "+total_menu_bubblegum);
        int total= total_menu_matcha+total_menu_bubblegum;
        System.out.println("                                     Total :"+total);
        
        System.out.print("Bayarannya :");
        int tunai=In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Matcha"+" "+angka1+" "+Matcha+" "+total_menu_matcha+"===");  
        System.out.println("==="+"Bubble Gum"+" "+angka1+" "+BubbleGum+" "+total_menu_bubblegum+"===");      
        System.out.println("------------------------------------------------"); 
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
        System.out.println(" Terima kasih sudah belanja di tempat kami :)" ); 
    }else if(pilihan < 11){
        System.out.println("====Menu 10=====================================");
        System.out.println("=="+"Matcha"+" "+angka1+" "+Matcha+" "+total_menu_matcha);
        System.out.println("=="+"Milk Vanila"+" "+angka1+" "+Milk_Vanila+" "+total_menu_milkvani);
        int total= total_menu_milkvani+total_menu_milkvani;
        System.out.println("                                     Total :"+total);
        
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Matcha"+" "+angka1+" "+Matcha+" "+total_menu_matcha+"===");  
        System.out.println("==="+"Milk Vanila"+" "+angka1+" "+Milk_Vanila+" "+total_menu_milkvani+"===");      
        System.out.println("------------------------------------------------"); 
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
        System.out.println(" Terima kasih sudah belanja di tempat kami :)" ); 
    }else if(pilihan < 12){
        System.out.println("====Menu 11=====================================");
        System.out.println("=="+"Matcha"+" "+angka1+" "+Matcha+" "+total_menu_matcha);
        System.out.println("=="+"Thai Milk Tea"+" "+angka1+" "+Thai_Milk_tea+" "+total_menu_thai_milkt);
        int total= total_menu_matcha+total_menu_taro;
        System.out.println("                                     Total :"+total);
        
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
       System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));  
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Matcha"+" "+angka1+" "+Matcha+" "+total_menu_matcha+"===");  
        System.out.println("==="+"Thai Milk Tea"+" "+angka1+" "+Thai_Milk_tea+" "+total_menu_thai_milkt+"===");       
        System.out.println("------------------------------------------------"); 
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
        System.out.println(" Terima kasih sudah belanja di tempat kami :)" ); 
    }else if(pilihan <  13){
        System.out.println("====Menu 12=====================================");
        System.out.println("=="+"Matcha"+" "+angka1+" "+Matcha+" "+total_menu_matcha);
        System.out.println("=="+"Taro"+" "+angka1+" "+Taro+" "+total_menu_taro);
        int total= total_menu_matcha+total_menu_taro;
        System.out.println("                                     Total :"+total);
        
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Matcha"+" "+angka1+" "+Matcha+" "+total_menu_matcha+"===");   
        System.out.println("==="+"Taro"+" "+angka1+" "+Taro+" "+total_menu_taro+"===");        
        System.out.println("------------------------------------------------"); 
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
        System.out.println(" Terima kasih sudah belanja di tempat kami :)" ); 
    }else if(pilihan < 14){
        System.out.println("====Menu 13=====================================");
        System.out.println("=="+"Matcha"+" "+angka1+" "+Matcha+" "+total_menu_matcha);
        int total= total_menu_matcha;
        System.out.println("                                    Total : "+total);
                                           
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                    Tunai : "+tunai);
        
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));  
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Matcha"+" "+angka1+" "+Matcha+" "+total_menu_matcha+"===");        
        System.out.println("------------------------------------------------"); 
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
        System.out.println(" Terima kasih sudah belanja di tempat kami :)" ); 
    }else if(pilihan < 15){
        System.out.println("====Menu 14=====================================");
        System.out.println("=="+"Es Kopi Susu"+" "+angka1+" "+Es_Kopi_Susu+" "+total_menu_Es_Kopi_s);
        int total= total_menu_Es_Kopi_s;
        System.out.println("                                     Total :"+total);
        
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Es Kopi Susu"+" "+angka1+" "+Es_Kopi_Susu+" "+total_menu_Es_Kopi_s+"===");         
        System.out.println("------------------------------------------------"); 
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
        System.out.println(" Terima kasih sudah belanja di tempat kami :)" ); 
    }else if(pilihan < 16){
        System.out.println("====Menu 15=====================================");
        System.out.println("=="+"Kopi Susu Caramel"+" "+angka1+" "+Kopi_Susu_Caramel+" "+total_menu_kopi_sc);
        int total= total_menu_kopi_sc;
        System.out.println("                                     Total :"+total);
        
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Kopi Susu Caramel"+" "+angka1+" "+Kopi_Susu_Caramel+" "+total_menu_kopi_sc+"===");          
        System.out.println("------------------------------------------------"); 
        System.out.println("                                 Total :"+total); 
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
        System.out.println(" Terima kasih sudah belanja di tempat kami :)" ); 
    }else if(pilihan < 17){
        System.out.println("====Menu 16=====================================");
        System.out.println("=="+"Kopi Susu Gula Aren"+" "+angka1+" "+Kopi_Susu_Gula_Aren+" "+total_menu_Kopi_sga);
        int total= total_menu_Kopi_sga;
        System.out.println("                                     Total :"+total);
        
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Kopi Susu Gula Aren"+" "+angka1+" "+Kopi_Susu_Gula_Aren+" "+total_menu_Kopi_sga+"===");           
        System.out.println("------------------------------------------------"); 
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
        System.out.println(" Terima kasih sudah belanja di tempat kami :)" ); 

    }else if(pilihan < 18){
         System.out.println("====Menu 17====================================");
         System.out.println("=="+"v60"+" "+angka1+" "+V60+" "+total_menu_V);
         int total= total_menu_V;
         System.out.println("                                    Total :"+total);
         
         System.out.print("Bayarannya :");
         int tunai= In.nextInt();
         System.out.println("                                    Tunai :"+tunai);
         
         int Kembalian= tunai-total;
         System.out.println("                            Kembalian :"+Kembalian);
         
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
       System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"v60"+" "+angka1+" "+V60+" "+total_menu_V+"===");            
        System.out.println("------------------------------------------------"); 
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
        System.out.println(" Terima kasih sudah belanja di tempat kami :)" );
    }else if(pilihan < 19){
        System.out.println("====Menu 18====================================="); 
        System.out.println("=="+"Kopi Susu Panas"+" "+angka1+" "+Kopi_Susu_Panas+" "+total_menu_Kopi_sp);
        int total= total_menu_Kopi_sp; 
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian); 
        
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
       System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Kopi Susu Panas"+" "+angka1+" "+Kopi_Susu_Panas+" "+total_menu_Kopi_sp+"===");            
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
        System.out.println(" Terima kasih sudah belanja di tempat kami :)" );
    }else if(pilihan < 20){
        System.out.println("===="+"Menu 19====================================");
        System.out.println("=="+"Kopi Susu Vanila"+" "+angka1+" "+Kopi_Susu_Vanila+" "+total_menu_Kopi_sv);
        int total= total_menu_Kopi_sv; 
        System.out.println("                                     Total :"+total); 
        
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Kopi Susu Vanila"+" "+angka1+" "+Kopi_Susu_Vanila+" "+total_menu_Kopi_sv+"===");             
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
        System.out.println(" Terima kasih sudah belanja di tempat kami :)" );
    }else if(pilihan < 21){
        System.out.println("====Menu 20=====================================");
        System.out.println("=="+"Chocolate"+" "+angka1+" "+Chocolate+" "+total_menu_chocolate);
        int total= total_menu_chocolate;
        System.out.println("                                     Total :"+total);
        
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Chocolate"+" "+angka1+" "+Chocolate+" "+total_menu_chocolate+"===");              
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
        System.out.println(" Terima kasih sudah belanja di tempat kami :)" );
    }else if(pilihan < 22){
        System.out.println("====Menu 21====================================="); 
        System.out.println("=="+"Red Velvet"+" "+angka1+" "+RedVelvet+" "+total_menu_redvelt);
        int total= total_menu_redvelt;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));  
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Red Velvet"+" "+angka1+" "+RedVelvet+" "+total_menu_redvelt+"===");              
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
    }else if(pilihan < 23){
        System.out.println("====Menu 22=====================================");
        System.out.println("=="+"Bubble Gum"+" "+angka1+" "+BubbleGum+" "+total_menu_bubblegum);
        int total= total_menu_bubblegum;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
      System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Bubble Gum"+" "+angka1+" "+BubbleGum+" "+total_menu_bubblegum+"===");               
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
    }else if(pilihan < 24){
        System.out.println("====Menu 23=====================================");
        System.out.println("=="+"Milk Vanila"+" "+angka1+" "+Milk_Vanila+" "+total_menu_milkvani);
        int total= total_menu_milkvani;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));  
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Milk Vanila"+" "+angka1+" "+Milk_Vanila+" "+total_menu_milkvani+"===");               
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
    }else if(pilihan < 25){
        System.out.println("====Menu 24====================================="); 
        System.out.println("=="+"Thai Milk Tea"+" "+angka1+" "+Thai_Milk_tea+" "+total_menu_thai_milkt);
        int total= total_menu_thai_milkt;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Thai Milk Tea"+" "+angka1+" "+Thai_Milk_tea+" "+total_menu_thai_milkt+"===");               
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
    }else if(pilihan < 26){
        System.out.println("====Menu 25=====================================");
        System.out.println("=="+"Taro"+" "+angka1+" "+Taro+" "+total_menu_taro);
        int total= total_menu_taro;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannaya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
       System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));  
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Taro"+" "+angka1+" "+Taro+" "+total_menu_taro+"===");               
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
    }else if(pilihan < 27){
        System.out.println("====Menu 26=====================================");
        System.out.println("=="+"Coklat Panas"+" "+angka1+" "+Cokhlat_Panas+" "+total_menu_coklat_p);
        int total= total_menu_coklat_p;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Coklat Panas"+" "+angka1+" "+Cokhlat_Panas+" "+total_menu_coklat_p+"===");               
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian);  
    }else if(pilihan < 28){
        System.out.println("====Menu 27=====================================");
        System.out.println("=="+"Thai Tea Panas"+" "+angka1+" "+Thai_tea_Panas+" "+total_menu_thai_tea_p);
        int total= total_menu_thai_tea_p;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Thai Tea Panas"+" "+angka1+" "+Thai_tea_Panas+" "+total_menu_thai_tea_p+"===");                
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian);  
    }else if(pilihan < 29){
        System.out.println("====Menu 28=====================================");
        System.out.println("=="+"Matcha Panas"+" "+angka1+" "+Matcha_Panas+" "+total_menu_matcha_p);
        int total= total_menu_matcha_p;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
       System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Matcha Panas"+" "+angka1+" "+Matcha_Panas+" "+total_menu_matcha_p+"===");               
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian);   
    }else if(pilihan < 30){
        System.out.println("====Menu 29=====================================");
        System.out.println("=="+"Kentang Sosis"+" "+angka1+" "+Kentang_sosis+""+total_menu_kentang_so);
        int total= total_menu_kentang_so;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Kentang Sosis"+" "+angka1+" "+Kentang_sosis+" "+total_menu_kentang_so+"===");               
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
    }else if(pilihan < 31){
        System.out.println("====Menu 30=====================================");
        System.out.println("=="+"Tahu Crispi"+" "+angka1+" "+Tahu_crispi+" "+total_menu_tahu_cris);
        int total= total_menu_tahu_cris;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Tahu Crispi"+" "+angka1+" "+Tahu_crispi+" "+total_menu_tahu_cris+"===");                
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian);
    }else if(pilihan < 32){
        System.out.println("====Menu 31=====================================");
        System.out.println("=="+"Mie"+" "+angka1+" "+Mie+" "+total_menu_mie);
        int total= total_menu_mie;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Mie"+" "+angka1+" "+Mie+" "+total_menu_mie+"===");                
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian);
    }else if(pilihan < 33){
        System.out.println("====Menu 32=====================================");
        System.out.println("=="+"Mie Telur"+" "+angka1+" "+Mie_telur+" "+total_menu_mie_t);
        int total= total_menu_mie_t;
        System.out.println("                                      Total:"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
     System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Mie Telur"+" "+angka1+" "+Mie_telur+" "+total_menu_mie_t+"===");                 
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian);
    }else if(pilihan < 34){
        System.out.println("====Menu 33======================================");
        System.out.println("=="+"Matcha"+" "+angka1+" "+Matcha+" "+total_menu_matcha);
        System.out.println("=="+"Es Kopi Susu"+" "+angka1+" "+Es_Kopi_Susu+" "+ total_menu_Es_Kopi_s);
        int total= total_menu_matcha+total_menu_Es_Kopi_s;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Matcha"+" "+angka1+" "+Matcha+" "+total_menu_matcha+"===");   
        System.out.println("===="+"Es Kopi Susu"+" "+angka1+" "+Es_Kopi_Susu+" "+total_menu_Es_Kopi_s); 
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian);
    }else if(pilihan < 35){
        System.out.println("====Menu 34======================================");
        System.out.println("=="+"Matcha"+" "+angka1+" "+Matcha+" "+total_menu_matcha);
        System.out.println("=="+"Kopi Susu Caramel"+" "+angka1+" "+Kopi_Susu_Caramel+" "+total_menu_kopi_sc);
        int total= total_menu_matcha+total_menu_kopi_sc;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Matcha"+" "+angka1+" "+Matcha+" "+total_menu_matcha+"===");   
        System.out.println("===="+"Kopi Susu Caramel"+" "+angka1+" "+Kopi_Susu_Caramel+" "+total_menu_kopi_sc);  
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian);
    }else if(pilihan < 36){
        System.out.println("====Menu 35======================================");
        System.out.println("=="+"Matcha"+" "+angka1+" "+Matcha+" "+total_menu_matcha);
        System.out.println("=="+"Kopi Susu Gula Aren"+" "+angka1+" "+Kopi_Susu_Gula_Aren+" "+total_menu_Kopi_sga);
        int total= total_menu_matcha+total_menu_Kopi_sga;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
       System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Matcha"+" "+angka1+" "+Matcha+" "+total_menu_matcha+"===");   
        System.out.println("===="+"Kopi Susu Gula Aren"+" "+angka1+" "+Kopi_Susu_Gula_Aren+" "+total_menu_Kopi_sga);   
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian);
    }else if(pilihan < 37){
        System.out.println("====Menu 36======================================");
        System.out.println("=="+"Matcha"+" "+angka1+" "+Matcha+" "+total_menu_matcha);
        System.out.println("=="+"v60"+" "+angka1+" "+V60+" "+total_menu_V);
        int total= total_menu_matcha+total_menu_V;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Matcha"+" "+angka1+" "+Matcha+" "+total_menu_matcha+"===");   
        System.out.println("===="+"v60"+" "+angka1+" "+V60+" "+total_menu_V);    
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian);
    }else if(pilihan < 38){
        System.out.println("====Menu 37=====================================");
        System.out.println("=="+"Matcha"+" "+angka1+" "+Matcha+" "+total_menu_matcha);
        System.out.println("=="+"Kopi Susu Panas"+" "+angka1+" "+Kopi_Susu_Panas+" "+total_menu_Kopi_sp);
        int total= total_menu_matcha+total_menu_Kopi_sp;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
      System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Matcha"+" "+angka1+" "+Matcha+" "+total_menu_matcha+"===");   
        System.out.println("===="+"Kopi Susu Panas"+" "+angka1+" "+Kopi_Susu_Panas+" "+total_menu_Kopi_sp);    
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian);
    }else if(pilihan < 39){
        System.out.println("====Menu 38=====================================");
        System.out.println("=="+"Matcha"+" "+angka1+" "+Matcha+" "+total_menu_matcha); 
        System.out.println("=="+"Kopi Susu Vanila"+" "+angka1+" "+Kopi_Susu_Vanila+" "+total_menu_Kopi_sv);
        int total= total_menu_matcha+total_menu_Kopi_sv;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Matcha"+" "+angka1+" "+Matcha+" "+total_menu_matcha+"===");   
        System.out.println("===="+"Kopi Susu Vanila"+" "+angka1+" "+Kopi_Susu_Vanila+" "+total_menu_Kopi_sv);     
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian);
    }else if(pilihan < 40){
        System.out.println("====Menu 39=====================================");
        System.out.println("=="+"Chocolate"+" "+angka1+" "+Chocolate+" "+total_menu_chocolate);
        System.out.println("=="+"Coklat Panas"+" "+angka1+" "+Cokhlat_Panas+" "+total_menu_coklat_p); 
        int total= total_menu_chocolate+total_menu_coklat_p;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Chocolate"+" "+angka1+" "+Chocolate+" "+total_menu_chocolate+"===");   
        System.out.println("===="+"Coklat Panas"+" "+angka1+" "+Cokhlat_Panas+" "+total_menu_coklat_p);    
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian);
    }else if(pilihan < 41){
        System.out.println("====Menu 40=====================================");
        System.out.println("=="+"Red Velvet"+" "+angka1+" "+RedVelvet+" "+total_menu_redvelt);
        System.out.println("=="+"Thai Tea Panas"+" "+angka1+" "+Thai_tea_Panas+" "+total_menu_thai_tea_p);
        int total= total_menu_redvelt+total_menu_thai_tea_p;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Red Velvet"+" "+angka1+" "+RedVelvet+" "+total_menu_redvelt+"===");   
        System.out.println("===="+"Thai Tea Panas"+" "+angka1+" "+Thai_tea_Panas+" "+total_menu_thai_tea_p);    
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian);
    }else if(pilihan < 42){
        System.out.println("====Menu 41======================================");
        System.out.println("=="+"Bubble Gum"+" "+angka1+" "+BubbleGum+" "+total_menu_bubblegum);
        System.out.println("=="+"Matcha Panas"+" "+angka1+" "+Matcha_Panas+" "+total_menu_matcha_p);
        int total= total_menu_bubblegum+total_menu_matcha_p;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian =tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Bubble Gum"+" "+angka1+" "+BubbleGum+" "+total_menu_bubblegum+"===");   
        System.out.println("===="+"Matcha Panas"+" "+angka1+" "+Matcha_Panas+" "+total_menu_matcha_p);    
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian);
    }else if(pilihan < 43){
        System.out.println("=====Menu 42====================================");
        System.out.println("=="+"Milk Vanila"+" "+angka1+" "+Milk_Vanila+" "+total_menu_milkvani);
        System.out.println("=="+"Kentang Sosis"+" "+angka1+" "+Kentang_sosis+" "+total_menu_kentang_so);
        int total= total_menu_milkvani+total_menu_kentang_so;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
       System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Milk Vanila"+" "+angka1+" "+Milk_Vanila+" "+total_menu_milkvani+"===");   
        System.out.println("===="+"Kentang Sosis"+" "+angka1+" "+Kentang_sosis+" "+total_menu_kentang_so);    
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
    }else if(pilihan < 44){
        System.out.println("=====Menu 43====================================");
        System.out.println("=="+"Thai Milk Tea"+" "+angka1+" "+Thai_Milk_tea+" "+total_menu_thai_milkt);
        System.out.println("=="+"Tahu Crispi"+" "+angka1+" "+Tahu_crispi+" "+total_menu_tahu_cris);
        int total= total_menu_thai_milkt+total_menu_tahu_cris;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Thai Milk Tea"+" "+angka1+" "+Thai_Milk_tea+" "+total_menu_thai_milkt+"===");   
        System.out.println("===="+"Tahu Crispi"+" "+angka1+" "+Tahu_crispi+" "+total_menu_tahu_cris);    
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
    }else if(pilihan < 45){
        System.out.println("=====Menu 44====================================");
        System.out.println("=="+"Taro"+" "+angka1+" "+Taro+" "+total_menu_taro);
        System.out.println("=="+"Mie"+" "+angka1+" "+Mie+" "+total_menu_mie);
        int total= total_menu_taro+total_menu_mie;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian = tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
       System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Taro"+" "+angka1+" "+Taro+" "+total_menu_taro+"===");   
        System.out.println("===="+"Mie"+" "+angka1+" "+Mie+" "+total_menu_mie);     
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
    }else if(pilihan < 46){
        System.out.println("=====Menu 45====================================");
        System.out.println("=="+"Matcha"+" "+angka1+" "+Matcha+" "+total_menu_matcha);
        System.out.println("=="+"Mie Telur"+" "+angka1+" "+Mie_telur+" "+total_menu_mie_t);
        int total= total_menu_matcha+total_menu_mie_t;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Matcha"+" "+angka1+" "+Matcha+" "+total_menu_matcha+"===");   
        System.out.println("===="+"Mie Telur"+" "+angka1+" "+Mie_telur+" "+total_menu_mie_t);     
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian);  
    }else if(pilihan < 47){
        System.out.println("=====Menu 46====================================");
        System.out.println("=="+"Coklat Panas"+" "+angka1+" "+Cokhlat_Panas+" "+total_menu_coklat_p);
        System.out.println("=="+"Es Kopi Susu"+" "+angka1+" "+Es_Kopi_Susu+" "+total_menu_Es_Kopi_s); 
        int total= total_menu_coklat_p+total_menu_Es_Kopi_s;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
       System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Coklat Panas"+" "+angka1+" "+Cokhlat_Panas+" "+total_menu_coklat_p+"===");   
        System.out.println("===="+"Es Kopi Susu"+" "+angka1+" "+Es_Kopi_Susu+" "+total_menu_Es_Kopi_s);     
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian);  
    }else if(pilihan < 48){
        System.out.println("=====Menu 47====================================");
        System.out.println("=="+"Thai Tea Panas"+" "+angka1+" "+Thai_tea_Panas+" "+total_menu_thai_tea_p);
        System.out.println("=="+"Kopi Susu Caramel"+" "+angka1+" "+Kopi_Susu_Caramel+" "+total_menu_kopi_sc);
        int total= total_menu_thai_tea_p+total_menu_kopi_sc;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Thai Tea Panas"+" "+angka1+" "+Thai_tea_Panas+" "+total_menu_thai_tea_p+"===");   
        System.out.println("===="+"Kopi Susu Caramel"+" "+angka1+" "+Kopi_Susu_Caramel+" "+total_menu_kopi_sc); 
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian);  
    }else if(pilihan < 49){
        System.out.println("=====Menu 48====================================");
        System.out.println("=="+"Matcha Panas"+" "+angka1+" "+Matcha_Panas+" "+total_menu_matcha_p);
        System.out.println("=="+"Kopi Susu Gula Aren"+" "+angka1+" "+Kopi_Susu_Gula_Aren+" "+total_menu_Kopi_sga);
        int total= total_menu_matcha_p+total_menu_Kopi_sga;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
       System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Matcha Panas"+" "+angka1+" "+Matcha_Panas+" "+total_menu_matcha_p+"===");   
        System.out.println("===="+"Kopi Susu Gula Aren"+" "+angka1+" "+Kopi_Susu_Gula_Aren+" "+total_menu_Kopi_sga);     
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian);  
    }else if(pilihan < 50){
        System.out.println("=====Menu 49====================================");
        System.out.println("=="+"Kentang Sosis"+" "+angka1+" "+Kentang_sosis+" "+total_menu_kentang_so);
        System.out.println("=="+"v60"+" "+angka1+" "+V60+" "+total_menu_V);
        int total= total_menu_kentang_so+total_menu_V;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
      System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Kentang Sosis"+" "+angka1+" "+Kentang_sosis+" "+total_menu_kentang_so+"===");   
        System.out.println("===="+"V60"+" "+angka1+" "+V60+" "+total_menu_V);       
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian);  
    }else if(pilihan < 51){
        System.out.println("=====Menu 50====================================");
        System.out.println("=="+"Tahu Crispi"+" "+angka1+" "+Tahu_crispi+" "+total_menu_tahu_cris);
        System.out.println("=="+"Kopi Susu Panas"+" "+angka1+" "+Kopi_Susu_Panas+" "+total_menu_Kopi_sp);
        int total= total_menu_tahu_cris+total_menu_Kopi_sp;
        System.out.println("                                      Total "+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Tahu Crispi"+" "+angka1+" "+Tahu_crispi+" "+total_menu_tahu_cris+"===");   
        System.out.println("===="+"Kopi Susu Panas"+" "+angka1+" "+Kopi_Susu_Panas+" "+total_menu_Kopi_sp);     
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian);  
    }else if(pilihan < 52){
        System.out.println("=====Menu 51====================================");
        System.out.println("Mie"+" "+angka1+" "+Mie+" "+total_menu_mie);
        System.out.println("Kopi Susu Vanila"+" "+angka1+" "+Kopi_Susu_Vanila+" "+total_menu_Kopi_sv);
        int total= total_menu_mie+total_menu_Kopi_sv;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));  
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Mie"+" "+angka1+" "+Mie+" "+total_menu_mie+"===");   
        System.out.println("===="+"Kopi Susu Vanila"+" "+angka1+" "+Kopi_Susu_Vanila+" "+total_menu_Kopi_sv);      
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian);  
    }else if(pilihan < 53){
        System.out.println("=====Menu 52====================================");
        System.out.println("=="+"Mie Telur"+" "+angka1+" "+Mie_telur+" "+total_menu_mie_t);
        System.out.println("=="+"Kopi Susu Vanila"+" "+angka1+" "+Kopi_Susu_Vanila+" "+total_menu_Kopi_sv);
        int total= total_menu_mie_t+total_menu_Kopi_sv;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Mie Telur"+" "+angka1+" "+Mie_telur+" "+total_menu_mie_t+"===");   
        System.out.println("===="+"Kopi Susu Vanila"+" "+angka1+" "+Kopi_Susu_Vanila+" "+total_menu_Kopi_sv);     
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian);  
    }else if(pilihan < 54){
        System.out.println("=====Menu 53====================================");
        System.out.println("=="+"Kentang Sosis"+" "+angka1+" "+Kentang_sosis+" "+total_menu_kentang_so); 
        System.out.println("=="+"Coklat Panas"+" "+angka1+" "+Cokhlat_Panas+" "+total_menu_coklat_p);
        int total= total_menu_kentang_so+total_menu_coklat_p;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Kentang Sosis"+" "+angka1+" "+Kentang_sosis+" "+total_menu_kentang_so+"===");   
        System.out.println("===="+"Coklat Panas"+" "+angka1+" "+Cokhlat_Panas+" "+total_menu_coklat_p);      
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian);  
    }else if(pilihan < 55){
        System.out.println("=====Menu 54====================================");
        System.out.println("=="+"Kentang Sosis"+" "+angka1+" "+Kentang_sosis+" "+total_menu_kentang_so); 
        System.out.println("=="+"Thai tea Panas"+" "+angka1+" "+Thai_tea_Panas+" "+total_menu_thai_tea_p);
        int total= total_menu_kentang_so+total_menu_thai_tea_p;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
      System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Kentang Sosis"+" "+angka1+" "+Kentang_sosis+" "+total_menu_kentang_so+"===");   
        System.out.println("===="+"Thai Tea Panas"+" "+angka1+" "+Thai_tea_Panas+" "+total_menu_thai_tea_p);      
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian);  
    }else if(pilihan < 56){
        System.out.println("=====Menu 55====================================");
        System.out.println("=="+"Kentang Sosis"+" "+angka1+" "+Kentang_sosis+" "+total_menu_kentang_so); 
        System.out.println("=="+"Matcha Panas"+" "+angka1+" "+Matcha_Panas+" "+total_menu_matcha_p);
        int total= total_menu_kentang_so+total_menu_matcha_p;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Kentang Sosis"+" "+angka1+" "+Kentang_sosis+" "+total_menu_kentang_so+"===");   
        System.out.println("===="+"Matcha Panas"+" "+angka1+" "+Matcha_Panas+" "+total_menu_matcha_p);       
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian);  
    }else if(pilihan < 57){
        System.out.println("=====Menu 56====================================");
        System.out.println("=="+"Kentang Sosis"+" "+angka1+" "+Kentang_sosis+" "+total_menu_kentang_so); 
        System.out.println("=="+"Kentang Sosis"+" "+angka1+" "+Kentang_sosis+" "+total_menu_kentang_so); 
        int total= total_menu_kentang_so+total_menu_kentang_so;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Kentang Sosis"+" "+angka1+" "+Kentang_sosis+" "+total_menu_kentang_so+"===");   
        System.out.println("===="+"Kentang Sosis"+" "+angka1+" "+Kentang_sosis+" "+total_menu_kentang_so);      
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian);  
    }else if(pilihan < 58){
        System.out.println("=====Menu 57====================================");
        System.out.println("=="+"Kentang Sosis"+" "+angka1+" "+Kentang_sosis+" "+total_menu_kentang_so); 
        System.out.println("=="+"Tahu Crispi"+" "+angka1+" "+Tahu_crispi+" "+total_menu_tahu_cris);
        int total= total_menu_kentang_so+total_menu_tahu_cris;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
       System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Kentang Sosis"+" "+angka1+" "+Kentang_sosis+" "+total_menu_kentang_so+"===");   
        System.out.println("===="+"Tahu Crispi"+" "+angka1+" "+Tahu_crispi+" "+total_menu_tahu_cris);      
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian);  
    }else if(pilihan < 59){
        System.out.println("=====Menu 58====================================");
        System.out.println("=="+"Kentang Sosis"+" "+angka1+" "+Kentang_sosis+" "+total_menu_kentang_so);
        System.out.println("=="+"Mie"+" "+angka1+" "+Mie+" "+total_menu_mie);
        int total= total_menu_kentang_so+total_menu_mie;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Kentang Sosis"+" "+angka1+" "+Kentang_sosis+" "+total_menu_kentang_so+"===");   
        System.out.println("===="+"Mie"+" "+angka1+" "+Mie+" "+total_menu_mie);       
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian);  
    }else if(pilihan < 60){
        System.out.println("=====Menu 59====================================");
        System.out.println("=="+"Kentang Sosis"+" "+angka1+" "+Kentang_sosis+" "+total_menu_kentang_so); 
        System.out.println("=="+"Mie Telur"+" "+angka1+" "+Mie_telur+" "+total_menu_mie_t); 
        int total= total_menu_kentang_so+total_menu_mie_t;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Kentang Sosis"+" "+angka1+" "+Kentang_sosis+" "+total_menu_kentang_so+"===");   
        System.out.println("===="+"Mie Telur"+" "+angka1+" "+Mie_telur+" "+total_menu_mie_t);       
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian);  
    }else if(pilihan < 61){
        System.out.println("=====Menu 60====================================");
        System.out.println("=="+"Tahu Crispi"+" "+angka1+" "+Tahu_crispi+" "+total_menu_tahu_cris); 
        System.out.println("=="+"Coklat Panas"+" "+angka1+" "+Cokhlat_Panas+" "+total_menu_coklat_p);
        int total= total_menu_tahu_cris+total_menu_coklat_p;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Tahu Crispi"+" "+angka1+" "+Tahu_crispi+" "+total_menu_tahu_cris+"===");   
        System.out.println("===="+"Coklat Panas"+" "+angka1+" "+Cokhlat_Panas+" "+total_menu_coklat_p);        
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
    }else if(pilihan < 62){
        System.out.println("=====Menu 61====================================");
        System.out.println("=="+"Tahu Crispi"+" "+angka1+" "+Tahu_crispi+" "+total_menu_tahu_cris); 
        System.out.println("=="+"Thai Tea Panas"+" "+angka1+" "+Thai_tea_Panas+" "+total_menu_thai_tea_p);
        int total= total_menu_tahu_cris+total_menu_thai_tea_p; 
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Tahu Crispi"+" "+angka1+" "+Tahu_crispi+" "+total_menu_tahu_cris+"===");   
        System.out.println("===="+"Thai Tea Panas"+" "+angka1+" "+Thai_tea_Panas+" "+total_menu_thai_tea_p);         
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
    }else if(pilihan < 63){
        System.out.println("=====Menu 62====================================");
        System.out.println("=="+"Tahu Crispi"+" "+angka1+" "+Tahu_crispi+" "+total_menu_tahu_cris);
        System.out.println("=="+"Matcha Panas"+" "+angka1+" "+Matcha_Panas+" "+total_menu_matcha_p);
        int total= total_menu_tahu_cris+total_menu_matcha_p;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Tahu Crispi"+" "+angka1+" "+Tahu_crispi+" "+total_menu_tahu_cris+"===");   
        System.out.println("===="+"Matcha Panas"+" "+angka1+" "+Matcha_Panas+" "+total_menu_matcha_p);         
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
    }else if(pilihan < 64){
        System.out.println("=====Menu 63====================================");
        System.out.println("=="+"Tahu Crispi"+" "+angka1+" "+Tahu_crispi+" "+total_menu_tahu_cris);
        System.out.println("=="+"Kentang Sosis"+" "+angka1+" "+Kentang_sosis+" "+total_menu_kentang_so);
        int total= total_menu_tahu_cris+total_menu_kentang_so;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Tahu Crispi"+" "+angka1+" "+Tahu_crispi+" "+total_menu_tahu_cris+"===");   
        System.out.println("===="+"Kentang Sosis"+" "+angka1+" "+Kentang_sosis+" "+total_menu_kentang_so);         
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
    }else if(pilihan < 65){
        System.out.println("=====Menu 64====================================");
        System.out.println("=="+"Tahu Crispi"+" "+angka1+" "+Tahu_crispi+" "+total_menu_tahu_cris); 
        System.out.println("=="+"Tahu Crispi"+" "+angka1+" "+Tahu_crispi+" "+total_menu_tahu_cris);
        int total= total_menu_tahu_cris+total_menu_tahu_cris;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Tahu Crispi"+" "+angka1+" "+Tahu_crispi+" "+total_menu_tahu_cris+"===");   
        System.out.println("===="+"Tahu Crispi"+" "+angka1+" "+Tahu_crispi+" "+total_menu_tahu_cris+"===");         
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
    }else if(pilihan < 66){
        System.out.println("=====Menu 65====================================");
        System.out.println("=="+"Tahu Crispi"+" "+angka1+" "+Tahu_crispi+" "+total_menu_tahu_cris); 
        System.out.println("=="+"Mie"+" "+angka1+" "+Mie+" "+total_menu_mie);
        int total= total_menu_tahu_cris+total_menu_mie;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
       System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Tahu Crispi"+" "+angka1+" "+Tahu_crispi+" "+total_menu_tahu_cris+"===");   
        System.out.println("===="+"Mie"+" "+angka1+" "+Mie+" "+total_menu_mie);         
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
    }else if(pilihan < 67){
        System.out.println("=====Menu 66====================================");
        System.out.println("=="+"Tahu Crispi"+" "+angka1+" "+Tahu_crispi+" "+total_menu_tahu_cris); 
        System.out.println("=="+"Mie Telur"+" "+angka1+" "+Mie_telur+" "+total_menu_mie_t);
        int total= total_menu_tahu_cris+total_menu_mie_t;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Tahu Crispi"+" "+angka1+" "+Tahu_crispi+" "+total_menu_tahu_cris+"===");   
        System.out.println("===="+"Mie Telur"+" "+angka1+" "+Mie_telur+" "+total_menu_mie_t);         
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
    }else if(pilihan < 68){
        System.out.println("=====Menu 67====================================");
        System.out.println("=="+"Mie"+" "+angka1+" "+Mie+" "+total_menu_mie); 
        System.out.println("=="+"Coklat Panas"+" "+angka1+" "+Cokhlat_Panas+" "+total_menu_coklat_p);
        int total= total_menu_mie+total_menu_coklat_p;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
       System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Mie"+" "+angka1+" "+Mie+" "+total_menu_mie+"===");   
        System.out.println("===="+"Coklat Panas"+" "+angka1+" "+Cokhlat_Panas+" "+total_menu_coklat_p);          
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
    }else if(pilihan < 69){
        System.out.println("=====Menu 68====================================");
        System.out.println("=="+"Mie"+" "+angka1+" "+Mie+" "+total_menu_mie);
        System.out.println("=="+"Thai Tea Panas"+" "+angka1+" "+Thai_tea_Panas+" "+total_menu_thai_tea_p);
        int total= total_menu_mie+total_menu_thai_tea_p; 
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
       System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Mie"+" "+angka1+" "+Mie+" "+total_menu_mie+"===");   
        System.out.println("===="+"Thai Tea Panas"+" "+angka1+" "+Thai_tea_Panas+" "+total_menu_thai_tea_p);           
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
    }else if(pilihan < 70){
        System.out.println("=====Menu 69====================================");
        System.out.println("=="+"Mie"+" "+angka1+" "+Mie+" "+total_menu_mie);
        System.out.println("=="+"Matcha Panas"+" "+angka1+" "+Matcha_Panas+" "+total_menu_matcha_p);
        int total= total_menu_mie+total_menu_matcha_p;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Mie"+" "+angka1+" "+Mie+" "+total_menu_mie+"===");   
        System.out.println("===="+"Matcha Panas"+" "+angka1+" "+Matcha_Panas+" "+total_menu_matcha_p);           
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
    }else if(pilihan < 71){
        System.out.println("=====Menu 70====================================");
        System.out.println("=="+"Mie"+" "+angka1+" "+Mie+" "+total_menu_mie);
        System.out.println("=="+"Kentang Sosis"+" "+angka1+" "+Kentang_sosis+" "+total_menu_kentang_so);
        int total= total_menu_mie+total_menu_kentang_so;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Mie"+" "+angka1+" "+Mie+" "+total_menu_mie+"===");   
        System.out.println("===="+"Kentang Sosis"+" "+angka1+" "+Kentang_sosis+" "+total_menu_kentang_so);           
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
    }else if(pilihan < 72){
        System.out.println("=====Menu 71====================================");
        System.out.println("=="+"Mie"+" "+angka1+" "+Mie+" "+total_menu_mie);
        System.out.println("=="+"Tahu Crispi"+" "+angka1+" "+Tahu_crispi+" "+total_menu_tahu_cris);
        int total= total_menu_mie+total_menu_tahu_cris;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Mie"+" "+angka1+" "+Mie+" "+total_menu_mie+"===");   
        System.out.println("===="+"Tahu Crispi"+" "+angka1+" "+Tahu_crispi+" "+total_menu_tahu_cris);           
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
    }else if(pilihan < 73){
        System.out.println("=====Menu 72====================================");
        System.out.println("=="+"Mie"+" "+angka1+" "+Mie+" "+total_menu_mie);
        System.out.println("=="+"Mie"+" "+angka1+" "+Mie+" "+total_menu_mie);
        int total= total_menu_mie+total_menu_mie;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Mie"+" "+angka1+" "+Mie+" "+total_menu_mie+"===");   
        System.out.println("===="+"Mie"+" "+angka1+" "+Mie+" "+total_menu_mie+"===");           
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
    }else if(pilihan < 74){
        System.out.println("=====Menu 73====================================");
        System.out.println("=="+"Mie"+" "+angka1+" "+Mie+" "+total_menu_mie);
        System.out.println("=="+"Mie Telur"+" "+angka1+" "+Mie_telur+" "+total_menu_mie_t); 
        int total= total_menu_mie+total_menu_mie_t;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Mie"+" "+angka1+" "+Mie+" "+total_menu_mie+"===");   
        System.out.println("===="+"Mie Telur"+" "+angka1+" "+Mie_telur+" "+total_menu_mie_t);           
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
    }else if(pilihan < 75){
        System.out.println("=====Menu 74====================================");
        System.out.println("=="+"Mie Telur"+" "+angka1+" "+Mie_telur+" "+total_menu_mie_t);
        System.out.println("=="+"Coklat Panas"+" "+angka1+" "+Cokhlat_Panas+" "+total_menu_coklat_p);
        int total= total_menu_mie_t+total_menu_coklat_p;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Mie Telur"+" "+angka1+" "+Mie_telur+" "+total_menu_mie_t+"===");   
        System.out.println("===="+"Coklat Panas"+" "+angka1+" "+Cokhlat_Panas+" "+total_menu_coklat_p);            
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian);
    }else if(pilihan < 76){
        System.out.println("=====Menu 75====================================");
        System.out.println("=="+"Mie Telur"+" "+angka1+" "+Mie_telur+" "+total_menu_mie_t);
        System.out.println("=="+"Thai Tea Panas"+" "+angka1+" "+Thai_tea_Panas+" "+total_menu_thai_tea_p); 
        int total= total_menu_mie_t+total_menu_thai_tea_p;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
       System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Mie Telur"+" "+angka1+" "+Mie_telur+" "+total_menu_mie_t+"===");   
        System.out.println("===="+"Thai Tea Panas"+" "+angka1+" "+Thai_tea_Panas+" "+total_menu_thai_tea_p);             
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian);
    }else if(pilihan < 77){
        System.out.println("=====Menu 76====================================");
        System.out.println("=="+"Mie Telur"+" "+angka1+" "+Mie_telur+" "+total_menu_mie_t);
        System.out.println("=="+"Matcha Panas"+" "+angka1+" "+Matcha_Panas+" "+total_menu_matcha_p);
        int total= total_menu_mie_t+total_menu_matcha_p;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Mie Telur"+" "+angka1+" "+Mie_telur+" "+total_menu_mie_t+"===");   
        System.out.println("===="+"Matcha Panas"+" "+angka1+" "+Matcha_Panas+" "+total_menu_matcha_p);             
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian);
    }else if(pilihan < 78){
        System.out.println("=====Menu 77====================================");
        System.out.println("=="+"Mie Telur"+" "+angka1+" "+Mie_telur+" "+total_menu_mie_t);
        System.out.println("=="+"Kentang Sosis"+" "+angka1+" "+Kentang_sosis+" "+total_menu_kentang_so);
        int total= total_menu_mie_t+total_menu_kentang_so;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Mie Telur"+" "+angka1+" "+Mie_telur+" "+total_menu_mie_t+"===");   
        System.out.println("===="+"Kentang Sosis"+" "+angka1+" "+Kentang_sosis+" "+total_menu_kentang_so);             
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian);
    }else if(pilihan < 79){
        System.out.println("=====Menu 78====================================");
        System.out.println("=="+"Mie Telur"+" "+angka1+" "+Mie_telur+" "+total_menu_mie_t);
        System.out.println("=="+"Tahu Crispi"+" "+angka1+" "+Tahu_crispi+" "+total_menu_tahu_cris);
        int total= total_menu_mie_t+total_menu_tahu_cris;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Mie Telur"+" "+angka1+" "+Mie_telur+" "+total_menu_mie_t+"===");   
        System.out.println("===="+"Tahu Crispi"+" "+angka1+" "+Tahu_crispi+" "+total_menu_tahu_cris);             
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian);
    }else if(pilihan < 80){
        System.out.println("=====Menu 79====================================");
        System.out.println("=="+"Mie Telur"+" "+angka1+" "+Mie_telur+" "+total_menu_mie_t);
        System.out.println("=="+"Mie"+" "+angka1+" "+Mie+" "+total_menu_mie);
        int total= total_menu_mie_t+total_menu_mie;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian);
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Mie Telur"+" "+angka1+" "+Mie_telur+" "+total_menu_mie_t+"===");   
        System.out.println("===="+"Mie"+" "+angka1+" "+Mie+" "+total_menu_mie);             
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian);
    }else if(pilihan < 81){
        System.out.println("=====Menu 80====================================");
        System.out.println("=="+"Mie Telur"+" "+angka1+" "+Mie_telur+" "+total_menu_mie_t);
        System.out.println("=="+"Mie Telur"+" "+angka1+" "+Mie_telur+" "+total_menu_mie_t);
        int total= total_menu_mie_t+total_menu_mie_t;
        System.out.println("                                     Total :"+total);
        System.out.print("Bayarannya :");
        int tunai= In.nextInt();
        System.out.println("                                     Tunai :"+tunai);
        int Kembalian= tunai-total;
        System.out.println("                             Kembalian :"+Kembalian); 
        System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())); 
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Mie Telur"+" "+angka1+" "+Mie_telur+" "+total_menu_mie_t+"===");   
        System.out.println("===="+"Mie Telur"+" "+angka1+" "+Mie_telur+" "+total_menu_mie_t+"===");             
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
        
    }else if(pilihan < 82){
        System.out.println("====Menu 81============================================");
        System.out.println("Es Kopi Susu"+" "+angka1+" "+Es_Kopi_Susu+" "+total_menu_Es_Kopi_s);
        System.out.println("Chocolate"+" "+angka1+" "+Chocolate+" "+total_menu_chocolate);
        System.out.println("Coklat Panas"+" "+angka1+" "+Cokhlat_Panas+" "+total_menu_coklat_p);
        int total= total_menu_Es_Kopi_s+total_menu_chocolate+total_menu_coklat_p;
        
         System.out.println("                   T           Total :"+total); 
         System.out.println("Bayarannya :");
         int Tunai= In.nextInt();
         System.out.println("                               Tunai :"+Tunai);
         int Kembalian=Tunai-total;
         System.out.println("                       Kembalian :"+Kembalian);
         System.out.println("=========== Struk Pembelanjaan ==================");
        System.out.println("=============== KOPI KU SEDUH ===================");
        System.out.println("=================================================");
        System.out.println("Date : "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));   
        System.out.println("------------------------------------------------");
        System.out.println("===="+"Es Kopi Susu"+" "+angka1+" "+Es_Kopi_Susu+" "+total_menu_Es_Kopi_s+"===");   
        System.out.println("===="+"Chocolate"+" "+angka1+" "+Chocolate+" "+total_menu_chocolate+"====");
        System.out.println("===="+"Coklat Panas"+" "+angka1+" "+Cokhlat_Panas+" "+total_menu_coklat_p+"===");  
        System.out.println("------------------------------------------------");  
        System.out.println("                                 Total :"+total);
        System.out.println("                                 Tunai :"+Tunai);
        System.out.println("                             Kembalian :"+Kembalian); 
    }else{
        System.out.println("Terima kasih selamat datang kembali :) "); 
    }
    
    System.out.println("Apakah ingin meginput lagi? ");
    String mn= In.next();
     
    if(!mn.equalsIgnoreCase("iya")){
        System.out.println(""); 
        break;             
    } 
    }
    }  

    
//    System.out.println("========================================================");
//   System.out.println(Tanggal+" "+" "+ Bulan+" " +" "+ Tahun+" " +" "+ Jam+" " );  
//    System.out.println("========================================================");
//    System.out.println("Espresso"+"  "+angka    +"  "+total_menu_1); 
//    System.out.println("Americano"+" "+angka    +"  "+total_menu_2); 
    
    

//   
//    System.out.println("pilihan menu anda");
//   int pilihan= In.nextInt(); 
//   
//    for(int i=0; i<pilihan; i++){ 
//        System.out.print("Pilih yang mana aja :"); 
//        String menu= In.next();    
//    } 
//    System.out.println("======================= Tentukan pilihan yang anda pesan =====================================");  
//    int Z= In.nextInt();
//    
//    if(Z < 2){
//        System.out.println("-------------------------------------------------------");
//        System.out.println("capucino"+angka+     +Capucino+"  "+ p1); 
//        System.out.println("good day     1    "+Good_day+"  "+p2);  
//        System.out.println("-------------------------------------------------------");
//        int total= total1+total2; 
//        System.out.println("                                      Total :"+total); 
//        
//        System.out.print ("Masukan uang anda : ");  
//        int uang= In.nextInt();
//        System.out.println("                                      Tunai :"+uang);
//        
//        int kembalian= uang-total;
//        System.out.println("                                  Kembalian :"+kembalian);   
//        
//        System.out.println("==============================================================");
//        System.out.println("==============================================================");
//        System.out.println("capucino    1  "+Capucino+" "+p1);
//        System.out.println("good day    1  "+Good_day+" "+p2); 
//        System.out.println("--------------------------------------------------------------");
//        System.out.println("                                     Total :"+total);
//        System.out.println("                                     Tunai :"+uang);
//        System.out.println("                                  Kembalian:"+kembalian); 
//        System.out.println("--------------------------------------------------------------");
//        System.out.println("Terima kasih sudah belanja ditempat kami :) "); 
//    }else if (Z < 3){
//        System.out.println("good day     1    "+Good_day+"  "+p2); 
//        System.out.println("--------------------------------------------------------");
//        int total= total2;
//        System.out.println("                                    Total  :"+total);
//        
//        System.out.print("Masukan uang anda : ");
//        int uang= In.nextInt();
//        System.out.println("                                    Tunai  :"+uang);
//        
//        int Kembalian= uang-total;
//        System.out.println("                                 Kembalian : "+Kembalian);  
//        
//        System.out.println("========================================================");
//        System.out.println(Tanggal+" "+"/ "+Bulan+"/ "+" "+Tahun+"/ "+" "+ Jam+" "); 
//        System.out.println("========================================================");
//        System.out.println("good day 1 "+Good_day+" "+p2);
//        System.out.println("--------------------------------------------------------");
//        System.out.println("                                     Total :"+total);
//        System.out.println("                                     Tunai :"+uang);
//        System.out.println("                               Kembalian :"+Kembalian);
//        System.out.println("--------------------------------------------------------");
//        System.out.println("Terima kasih sudah belanja ditempat kami :) ");
//    }else if (Z < 4){
//        System.out.println("capucino     1    "+Capucino+" "+p1); 
//        System.out.println("---------------------------------------------------------");
//        int total= total1;
//        System.out.println("                                 Total :"+total);
//        
//        System.out.print("Masukan uang anda : ");
//        int uang= In.nextInt();
//        System.out.println("                                 Tunai :"+uang);
//        
//        int Kembalian= uang-total;
//        System.out.println("                             Kembalian :"+Kembalian); 
//    }else{
//        System.out.println("Terima kasih");
    } 

