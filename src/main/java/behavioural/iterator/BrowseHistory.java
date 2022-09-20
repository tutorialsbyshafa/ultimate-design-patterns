package behavioural.iterator;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class BrowseHistory {

    private List<String> urls = new ArrayList<>();

    public void push(String url) {
        urls.add(url);
    }

    public String pop() {
        var lastUrl = urls.get(urls.size() - 1);
        urls.remove(lastUrl);

        return lastUrl;
    }

    public Iterator createIterator() {
        return new ListIterator(this);
    }


    @RequiredArgsConstructor
    public class ListIterator implements Iterator {
        private final BrowseHistory history;
        private int index;

        @Override
        public boolean hasNext() {
            return index < history.urls.size();
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
