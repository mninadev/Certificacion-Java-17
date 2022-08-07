package joedayz.java17.design.clases.avanzado.records;

public final record CraneRecord(int numberEggs, String name) implements Bird{}

class TestRecord{
    public static void main(String[] args) {
        var mommy = new CraneRecord(4, "Cammy");
        System.out.println(mommy.numberEggs());
        System.out.println(mommy.name());

        var father = new CraneRecord(0, "Craig");
        System.out.println(father);//CraneRecord[numberEggs=0, name=Craig]

        var copy = new CraneRecord(0, "Craig");
        System.out.println(copy);//CraneRecord[numberEggs=0, name=Craig]

        System.out.println(father.equals(copy));//true
        System.out.println(father.hashCode()+", "+copy.hashCode()); //65368656, 65368656

        var cousin = new CraneRecord(3, "Jenny");
        var friend = new CraneRecord(cousin.numberEggs(),"Janeice");
        System.out.println(friend);
    }

}

interface Bird{}

