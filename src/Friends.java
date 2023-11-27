abstract class Friends {
    abstract void travel();
}
class Chethana extends Friends{
    void travel(){
        System.out.println("I like to travel with boyfriend.");
    }
}
class Nirmani extends Friends{
    void travel(){
        System.out.println("I like to travel with family.");
    }
}
class testFriends{
    public static void main(String[] args) {
        Friends f=new Chethana();
        f.travel();
        Friends fr=new Nirmani();
        fr.travel();
    }
}