public class uchiha extends ninja{
    
    public void sharingan(){
        System.out.println("Sharingan ativado!");
    }

    @Override
    public void ataqueBase(){
        System.out.println("Ataque base do Uchiha!");
    }
        public void ataqueBase(int nivelChakra){
            if(nivelChakra > 2){
                System.out.println("Ativar susano!");
            }

            else if(nivelChakra > 1){
                System.out.println("Ativar amaterasu!");
            }

            else{
                System.out.println("Ataque base do Uchiha!");
        }
    }
}
