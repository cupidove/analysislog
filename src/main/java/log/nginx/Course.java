package log.nginx;

import com.alibaba.fastjson.JSONArray;

public class Course {
    private User user;
    private JSONArray books;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public JSONArray getBooks() {
        return books;
    }

    public void setBooks(JSONArray books) {
        this.books = books;
    }
}
