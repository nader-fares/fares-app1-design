package baseline;

import javafx.event.ActionEvent;

public class Controller {
    public void addList(ActionEvent actionEvent) {
        /*
        create object with title set from the inputted text field
        new list will be created and displayed in listview
         */
    }

    public void delList(ActionEvent actionEvent) {
        /*
        click on title of list in listview to select
        delete
         */
    }

    public void editList(ActionEvent actionEvent) {
        /*
        click on title of list in listview to select
        edit items on the side of window
         */
    }

    public void addItem(ActionEvent actionEvent) {
        /*
        create object with description set from the inputted text field
        and date set from date picker on side
        new item will be added to item list in original list object
        new item will be created and displayed in listview
         */
    }

    public void editItem(ActionEvent actionEvent) {
         /*
        click on description of list in listview to select
        edit items on the side of window
         */
    }

    public void markItemComplete(ActionEvent actionEvent) {
        /*
        marks selected item as complete
         */
    }

    public void showAllItems(ActionEvent actionEvent) {
        /*
        displays entire list of items
         */
    }

    public void showIncompleteItems(ActionEvent actionEvent) {
        /*
        display items that are not marked as complete
         */
    }

    public void showCompleteItems(ActionEvent actionEvent) {
        /*
        display items that are marked as complete
         */
    }

    public void saveTodoList(ActionEvent actionEvent) {
        /*
        create output file for each selected item in list
        user specifies location and name of file
        create directory for created files
         */
    }

    public void loadTodoList(ActionEvent actionEvent) {
        /*
        user loads previously saved to do list
         */
    }


}


