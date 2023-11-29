package family_tree;
import family_tree.writer.FileHandler;

import java.io.IOException;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        FamilyTree tree = load();
        //FamilyTree tree = testTree();
        System.out.println(tree);

        save(tree);
    }

    private static FamilyTree load() {
        String filePath = "C:/Users/tiliv/IdeaProjects/SeminariOOP/family_tree/writer/tree.txt";
        FileHandler fileHandler = new FileHandler();
        return (FamilyTree) fileHandler.read(filePath);
    }
    private static void save(FamilyTree tree){
        String filePath = "C:/Users/tiliv/IdeaProjects/SeminariOOP/family_tree/writer/tree.txt";
        FileHandler fileHandler = new FileHandler();
        if(fileHandler.save(tree, filePath)){
        }
    }
    static FamilyTree testTree() {
        FamilyTree tree = new FamilyTree();

        Human vasya = new Human("Василий", Gender.Male, LocalDate.of(1963, 12, 10));
        Human masha = new Human("Мария", Gender.Female, LocalDate.of(1965, 9, 15));
        tree.add(vasya);
        tree.add(masha);
        Human christina = new Human("Кристина", Gender.Female, LocalDate.of(1988, 7, 5), vasya, masha);
        Human semyon = new Human("Семен", Gender.Male, LocalDate.of(1991, 1, 25),
                vasya, masha);
        tree.add(christina);
        tree.add(semyon);
        Human grandMother = new Human("Лариса", Gender.Female, LocalDate.of(1945, 9, 1));
        grandMother.addChild(vasya);
        tree.add(grandMother);


        return tree;

    }

}
