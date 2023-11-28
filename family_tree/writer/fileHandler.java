package family_tree.writer;

import org.w3c.dom.Node;

import java.io.*;

public class FileHandler implements Writable{

    public boolean save(Serializable serializable, String filePath) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            objectOutputStream.writeObject(serializable);
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public Object read(String filePath) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))){
            return objectInputStream.readObject();
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean save(FamilyTree<Human> tree) {
        return false;
    }

    @Override
    public FamilyTree<Human> read() {
        return null;
    }

    @Override
    public void setFilePath(String filePath) {

    }
}
