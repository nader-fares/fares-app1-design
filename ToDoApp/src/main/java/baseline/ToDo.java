package baseline;

import javafx.scene.control.ListView;

public class ToDo {
    String todoTitle;
    ListView<Item> itemList;

    public String getTodoTitle() {
        return todoTitle;
    }

    public void setTodoTitle(String todoTitle) {
        this.todoTitle = todoTitle;
    }

    public ListView<Item> getItemList() {
        return itemList;
    }

    public void setItemList(ListView<Item> itemList) {
        this.itemList = itemList;
    }

}
