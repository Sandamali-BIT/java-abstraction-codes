abstract class bankInterest {
    abstract int getInterest();
}
class PB extends bankInterest{
    @Override
    int getInterest() {
        return 5;
    }
}
class NSB extends bankInterest{
    @Override
    int getInterest() {
        return 6;
    }
}
class bankInterestTest{
    public static void main(String[] args) {
        bankInterest b,b1;
        b=new PB();
        System.out.println("Peoples bank's house loan interest is "+ b.getInterest()+"%.");
        b1=new NSB();
        System.out.println("NSB bank's house loan interest is "+ b1.getInterest()+"%.");
    }
}
