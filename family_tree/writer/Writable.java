package family_tree.writer;

import com.sun.source.tree.Tree;
import org.w3c.dom.Node;

import java.io.*;

public interface Writable {
        boolean save(FamilyTree<Human> tree);
        FamilyTree<Human> read();
        void setFilePath(String filePath);
    }
