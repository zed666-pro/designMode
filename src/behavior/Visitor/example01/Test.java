package behavior.visitor.example01;

public class Test {

    public static void main(String[] args) {
        SetMaterial setMaterial = new SetMaterial();
        Paper paper = new Paper();
        Cuprum cuprum = new Cuprum();

        ArtCompany artCompany = new ArtCompany();
        MineCompany mineCompany = new MineCompany();

        setMaterial.add(paper);
        setMaterial.add(cuprum);

        setMaterial.accept(artCompany);
        System.out.println("------------------------------");
        setMaterial.accept(mineCompany);
    }

    }

