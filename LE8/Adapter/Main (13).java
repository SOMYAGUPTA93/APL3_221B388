public class Main
    {
        public static void main(String args[]){
            Crow crow=new IndianCrow();
            CrowAdapter crowadapter=new CrowAdapter(crow);
            Client(crowadapter);
        }  //main ends here
        // our client is our princess
        public static void Client(Swan swan){
            swan.eat(); //oh my god! he is eating pearls
            swan.swim(); //look! he denies to swim he flies
            swan.sing(); // so what if he doesnt swim nicely you cant except everything in one
        }
    
}