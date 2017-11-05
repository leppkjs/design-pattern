package composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends Entry {
    private String name;
    private List<Entry> directory = new ArrayList<Entry>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public Entry add(Entry entry){
        this.directory.add(entry);
        return this;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator<Entry> it = directory.iterator();
        while(it.hasNext()) {
            Entry en = it.next();
            size += en.getSize();
        }
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        Iterator<Entry> it = directory.iterator();

        Entry en;
        while (it.hasNext()) {
            en = it.next();
            en.printList(prefix + "/" + name);
        }
    }
}
