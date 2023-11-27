abstract class Languages {
    Languages(){
        System.out.println("Other oll languages...");
    }
    abstract void programming();
    void otherSkills(){
        System.out.println("MYSQL, ANGULAR, SPRINGBOOT....");
    }
}
class Java extends Languages{
    @Override
    void programming() {
        System.out.println("JAVA");
    }
}
class Python extends Languages{
    @Override
    void programming() {
        System.out.println("PYTHON");
    }
}
class test{
    public static void main(String[] args) {
    Languages l=new Java();
    l.programming();
    l.otherSkills();
    Languages lg=new Python();
    lg.programming();
    }
}
