abstract class tuitionClass {
    abstract void teach();
}
class Economics extends tuitionClass{
    @Override
    void teach() {
        System.out.println("Dodamgoda sir is the teacher.");
    }
}
class businessStudies extends tuitionClass{
    @Override
    void teach() {
        System.out.println("Wijedasa sir is the teacher.");
    }
}
class Accounting extends tuitionClass{
    @Override
    void teach() {
        System.out.println("Pandula sir is the teacher.");
    }
}
class Test{
    public static void main(String[] args) {
        tuitionClass t,t1,t2;
        t=new Economics();t.teach();
        t1=new businessStudies();t1.teach();
        t2=new Accounting();t2.teach();
    }
}