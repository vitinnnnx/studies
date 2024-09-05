public class main {
    public static void main(String[] args){
       
        //obj 1
        uzumaki naruto = new uzumaki();
        naruto.setname("Naruto Uzumaki");
        
        naruto.getname();
        naruto.Aldeia = "Konoha";
        naruto.temBiju = true;
        naruto.ataqueBase();

        //obj 2
        uchiha sasuke = new uchiha();
        sasuke.setname("Sasuke Uchiha");
        sasuke.sharingan();
        sasuke.ataqueBase();
        sasuke.ataqueBase(3);
    }    
}